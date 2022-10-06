package Autoboxing;

public class Autoboxing {

    /**
     * @author Alejandro Recarte Rebollo
     * @version 1.0
     *
     * **/

    public static void main(String[] args){
        int a = 3;
        int b = 7;
        int c = 9;

        System.out.println("a: "+a+" b: "+b+" c: "+c);

        //Autoboxing
        a=b;

        System.out.println("a-> "+a);

        //Unboxing
        c=a;

        System.out.println("c-> "+c);

        System.out.println("a: "+a+" b: "+b+" c: "+c);
    }//fin main
}//fin class
