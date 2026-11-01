public class Password_Validation_Using_CommandLine_Args {
public static void main(String[] args) {
    String username;
    username=args[0];
    String Password;
    Password= args[1];
    String actual_username="demo-user";
    String actual_Password="demo-password";
    if(username.equals(actual_username) && Password.equals(actual_Password)){
        System.out.println("Login Successful");
    }
    else{
        System.out.println("Invalid username or password");
    }


}
}