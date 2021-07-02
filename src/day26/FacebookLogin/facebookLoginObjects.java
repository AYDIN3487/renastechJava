package day26.FacebookLogin;

import MyLibrary.Library;

public class facebookLoginObjects {

    public static void main(String[] args) {
        //login with chrome
        chromeFacebook chromeFacebook=new chromeFacebook();
        chromeFacebook.openBrowser();
        chromeFacebook.goToFacebook();
        chromeFacebook.passCredentials("erdal","erdal1243");
        System.out.println("chromeFacebook.getUsername() = " + chromeFacebook.getUsername());//encapsulation
        System.out.println("chromeFacebook.getPassword() = " + chromeFacebook.getPassword());
        chromeFacebook.closeBrowser();


        Library.stars();


        //login with firefox
        firefoxFacebook obj=new firefoxFacebook();
        obj.openBrowser();
        obj.goToFacebook();
        obj.passCredentials("gulfidan","123gulfidan");
        System.out.println("obj.getUsername() = " + obj.getUsername());
        System.out.println("obj.getPassword() = " + obj.getPassword());
        obj.closeBrowser();
    }
}
