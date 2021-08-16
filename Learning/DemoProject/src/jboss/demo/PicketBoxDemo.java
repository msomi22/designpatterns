/**
 * 
 */
package jboss.demo;

/**
 *
 *
 */
public class PicketBoxDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("=======================================");
		
		String[] pass = {"pass"};
		org.picketbox.datasource.security.SecureIdentityLoginModule.main(pass);
		
		System.out.println("=======================================");

	}

}
