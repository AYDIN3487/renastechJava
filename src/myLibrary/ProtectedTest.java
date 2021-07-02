package MyLibrary;

import day26.c1_AccessModifier;

import static day26.c1_AccessModifier.*;

public class ProtectedTest extends c1_AccessModifier{

    public static void main(String[] args) {
        System.out.println("c1_AccessModifier.publicVrb = " + publicVrb);
        System.out.println("c1_AccessModifier.protectedVrb = " + protectedVrb);
        publicMethod();
        protectedMethod();

        //cant call default or priavet
    }
}
