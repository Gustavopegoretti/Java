package principal;

import javax.swing.JOptionPane;

import interf.Interface;
import interf.Login;

public class Principal {
	 public static int login, senha;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Login l = new Login();
     
      Interface f = new Interface();
	   f.setVisible(false);	
     while ((login == 0) && (senha == 0)) {
	 l.setVisible(true);
	  
      if ((login == 1) && (senha == 1)) {
		l.setVisible(false);
    	  f.setVisible(true);	
		}
			
	   }
		
		
	}

}
