package tn.esprit.insurance.service.interfaces;

import java.util.List;
import javax.ejb.Remote;
import tn.esprit.insurance.entity.Expert;
import tn.esprit.insurance.entity.ExpertReport;
import tn.esprit.insurance.entity.Sinister;

@Remote
public interface IExpertReportRemote {
	public int addExpertReport(ExpertReport expReport);
	public void removeReport(int id);
	public void updateReport(ExpertReport expertReportNewValues);
	public ExpertReport findExpertReportById(int id);
	public List<ExpertReport> findAllExpertReports();
	public List<ExpertReport> findAllExpertReportsbyExpert(Expert expert);
	public List<ExpertReport> findAllExpertReportsbySinister(Sinister expert);
}
