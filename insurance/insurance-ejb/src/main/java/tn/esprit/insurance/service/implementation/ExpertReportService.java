package tn.esprit.insurance.service.implementation;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.insurance.entity.Expert;
import tn.esprit.insurance.entity.ExpertReport;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.service.interfaces.IExpertReportLocal;
import tn.esprit.insurance.service.interfaces.IExpertReportRemote;

@Stateless
public class ExpertReportService implements IExpertReportLocal, IExpertReportRemote {
		
		@PersistenceContext(unitName = "insurance-ejb")
		EntityManager em;

		@Override
		public int addExpertReport(ExpertReport expReport) {
			System.out.println("In addExpertReport : ");
			em.persist(expReport);
			System.out.println("Out of addExpertReport" + expReport.getExpertReportId());
			return expReport.getExpertReportId();
		}

		@Override
		public void removeReport(int id) {
			System.out.println("In removeExpertReport : ");
			em.remove(em.find(ExpertReport.class, id));
			System.out.println("Out of removeExpertReport : ");
		}

		@Override
		public void updateReport(ExpertReport expertReportNewValues) {
			System.out.println("In updateExpertReport : ");
			ExpertReport s = em.find(ExpertReport.class, expertReportNewValues.getExpertReportId());
			s.setObservation(expertReportNewValues.getObservation());
			s.setTopic(expertReportNewValues.getTopic());	
			s.setSinister(expertReportNewValues.getSinister());
			s.setExpert(expertReportNewValues.getExpert());
			System.out.println("Out of updateExpertReport : ");
		}

		@Override
		public ExpertReport findExpertReportById(int id) {
			System.out.println("In findExpertReportById : ");
			ExpertReport s = em.find(ExpertReport.class, id);
			System.out.println("Out of findExpertReportById : ");
			return s;
		}

		@Override
		public List<ExpertReport> findAllExpertReports() {
			System.out.println("In findAllExpertReports : ");
			List<ExpertReport> reports = em.createQuery("from ExpertReport", ExpertReport.class).getResultList();
			System.out.println("Out of findAllExpertReports : ");
			return reports;
		}
		
		@Override
		public List<ExpertReport> findAllExpertReportsbyExpert(Expert expert) {
			System.out.println("ReportsByExpert ");
			TypedQuery<ExpertReport> query = em.createQuery("SELECT u FROM ExpertReport u WHERE u.expert = :expert",ExpertReport.class);			
			List<ExpertReport> reports = query.setParameter("expert", expert).getResultList();
			System.out.println("SReportsByExpert done ");
			return reports;
		}
		
		@Override
		public List<ExpertReport> findAllExpertReportsbySinister(Sinister expert) {
			System.out.println("ReportsByExpert ");
			TypedQuery<ExpertReport> query = em.createQuery("SELECT u FROM ExpertReport u WHERE u.sinister = :sinister",ExpertReport.class);			
			List<ExpertReport> reports = query.setParameter("sinister", expert).getResultList();
			System.out.println("SReportsByExpert done ");
			return reports;
		}
	}

