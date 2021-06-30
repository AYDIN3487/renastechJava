package Exercises;

public class Ex1 {
    public static void main(String[] args) {

        int a=10;
        int b= a++ + --a - -a++ ;
        System.out.println(b);


        long c=4;
        long d=(c++ + c-- + --c);
        System.out.println(d);

        short e=0;
        short f= (short) (--e + e++ * e--);
        System.out.println(f);



    }
}
