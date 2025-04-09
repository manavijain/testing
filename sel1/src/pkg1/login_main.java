package pkg1;

public class login_main {

	public static void main(String[] args) {
		
		loginscript ls = new loginscript();		
		String actualText = ls.validlogin("standard_user","secret_sauce");

        System.out.println("Returned text: " + actualText);
        
        String expmsg = "Epic sadface: Username and password do not match any user in this service";
        String actmsg = ls.invalidlogin("user_problem","secret_sauce",expmsg);
        
        System.out.println("Returned Error message: " + actmsg);

	}

}
