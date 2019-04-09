package tn.esprit.insurance.service.implementation;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import tn.esprit.insurance.entity.User;
import tn.esprit.insurance.entity.Utilisateur;
import tn.esprit.insurance.service.interfaces.IUserRemote;
import tn.java.security.ACallbackHandler;


 
@Stateless
@LocalBean
public class UserServices implements IUserRemote {

    private static final String EMAIL_PATTERN

           = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"

           + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

                     private static Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                     private static Matcher matcher;
                     private static final String pwd=  "^[A-Za-z0-9]+$";

                     private static Pattern pattern1 = Pattern.compile(pwd);

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	@Override
	public int addUser(User user) {
		System.out.println("In addUser : ");
		em.persist(user);
		System.out.println("Out of addUser" + user.getId());
		return user.getId();
	}

	@Override
	public User findUserById(int id) {
		 /*User  u  = (User) em.createQuery (
	                "SELECT u FROM t_user u WHERE u.id = :id" )
	                .setParameter("id", id)
	                .getSingleResult();
			*/
					
		System.out.println("before fin ");
		User user =(User) em.find(User.class, id);
		System.out.println("after find  ");
		return user;
	
	}

	@Override
	public void removeUser(int id) {
		System.out.println("In removeUser : avant");
		em.remove(em.find(User.class, id));
		System.out.println("Out of removeUser : removed"); 
		
	}

	@Override
	public void updateUser(User userNewValues) {
		System.out.println("In updateUser : ");
		User user = em.find(User.class, userNewValues.getId());
		user.setEmail(userNewValues.getEmail());
		System.out.println("Out of updateUser : ");
		
	}

	@Override
	public List<User> findAllUsers() {
		System.out.println("In findAllUsers : ");
		List<User> users = em.createQuery("from User", User.class).getResultList();
		System.out.println("Out of findAllUsers : ");
		return users;
		
	}

	@Override
	public String UserName(int id) {
		User user = em.find(User.class, id);
		System.out.println("after find  ");
		return user.getFirst_name();
		
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		User user=new User();
		Query query =em.createQuery("select a from User a where a.email =:email AND a.password =:password ", User.class);
		query.setParameter("email",email);
		query.setParameter("password",password);
		try{	
			user=(User) query.getSingleResult();
		}
		catch (NoResultException e)
		{
			System.out.println("not found");
			return null;	
		}



		



		return user;
		}

	@Override
	public void Loginf(String mail, String password) {

		System.setProperty("java.security.auth.login.config", "jaas.config");
		LoginContext loginContext = null ; 
		try {
			 loginContext = new LoginContext("Jaas", new ACallbackHandler()) ;
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			System.exit(0);
			
		} 
		while (true){
			try {
				
				
				loginContext.login();
				System.exit(0);
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public String passencryption(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean passTest( String text) {

        matcher = pattern1.matcher(text);

        return matcher.matches();
	}

	@Override
	public boolean mailConfirmation( String text) {
		

		if( text!=null && text.trim().length()>0 )
			return text.matches("^[a-zA-Z0-9\\.\\-\\_]+@([a-zA-Z0-9\\-\\_\\.]+\\.)+([a-zA-Z]{2,4})$");
		return false;
	}
	

	@Override
	public boolean NotNull(String text) {
		 if(text == ""){

             return false; 

         }

         return true ;

	}



}
