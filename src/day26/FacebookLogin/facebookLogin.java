package day26.FacebookLogin;

public class facebookLogin {
    //try this with chrome, firefox  ,opera ,safari browsers
    //open browser    --- this step you will open diffeerent browsers
    //go to facebook -- you pass same url
    //pass credantials  -- you pass same credantilas
    //end browser

    private String username;
    private String password;

    //shortcut for encapsulation
    //right click - genarete - getter setter


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void openBrowser(){
        System.out.println("Browser started");
    }

    public void goToFacebook(){
        System.out.println("we are on facebook login page");
    }

    public void passCredentials(String username , String password){
        setUsername(username);
        setPassword(password);
    }

    public void closeBrowser(){
        System.out.println("Browser is closed");
    }
}