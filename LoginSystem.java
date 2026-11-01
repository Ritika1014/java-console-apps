class LoginSystem {
    public static void main(String args[]) {

        // Predefined username and password
        String correctUsername = "admin";
        String correctPassword = "1234";

        // Check if command line arguments are provided
        if(args.length != 2) {
            System.out.println("Usage: java LoginSystem <username> <password>");
            return;
        }

        String enteredUsername = args[0];
        String enteredPassword = args[1];

        // Validate login credentials
        if(enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Login Successful! Welcome " + enteredUsername);
        } else {
            System.out.println("Invalid Username or Password!");
        }
    }
}