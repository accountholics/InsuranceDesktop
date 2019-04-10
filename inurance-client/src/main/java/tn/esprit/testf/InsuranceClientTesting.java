package tn.esprit.testf;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.service.interfaces.ISinisterRemote;

public class InsuranceClientTesting {

	public static void main(String[] args)  throws NamingException {
		String jndiName = "insurance-ear/insurance-ejb/SinisterService!tn.esprit.insurance.service.interfaces.ISinisterRemote";
		Context context = new InitialContext();
		ISinisterRemote proxy = (ISinisterRemote) context.lookup(jndiName);

		Sinister s = new Sinister();
		s.setContractNumber(1524);
		s.setSinisterDescription("First Sinister Ever");
		
		System.out.println(proxy.addSinister(s));
	}

}
