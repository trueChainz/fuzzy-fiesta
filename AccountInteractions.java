/**
 * Provides a class that directly interacts with user and
 * calls methods from the Account Controller
 * author: Jess Hansen
 * date: 2/27/2018
 */



public class AccountInteractions {
 
  private AccountController aController;
  
  /**
   * Checks if the user's credentials are valid and either
   * logs them in or supplies them with an error message to try again
   * @return boolean value regarding if the sign in was successful or not
   */
  public void logOn(String username, String password){
    
    aController.logOn(username,password);
  }
  
  /**
   * If the user is logged on, the user is able to log off using this method 
   * @return boolean value whether they successfully log off or not
   */
  public void logOff(){
    
    aController.logOff();
  }
   
  
  //public void displayError(){ }
  
  /**
   * Sets the users account with their changed information
   * @param account that wants to be edited
   * @return String of account details changed
   */
  public void setAccount(String username, String password, String firstName, String lastName, char type, char status){
    
    aController.editAccount( username,  password,  firstName,  lastName,  type,  status);
  }

}