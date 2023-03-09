package Calculadora;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar(){
        return num1+num2;
    }

    public int restar(){
        return num1-num2;
    }

    public int multiplicar(){
        return num1*num2;
    }

    public int dividir(){
        if(num2==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return num1/num2;
    }
}
