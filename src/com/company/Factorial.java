package com.company;

public class Factorial {

    public static long calcFactorial(int a){
        long total=1;
        while (a>0){
            total = total*a;
            a--;
        }
        return total;
    }

    public static double calcE(){
        double e = 1.0;
        double olde = 0.0;
        int count = 1;
        while ((e-olde) > 0.001)
        {
            olde = e;
            e = e + 1.0/calcFactorial(count);
            count++;
        }
        return e;
    }

    public static double calcEX(int x){
        double e = 1.0;
        double olde = 0.0;
        int count = 1;
        while ((e-olde) > 0.001)
        {
            olde = e;
            e = e + Math.pow(x,count)/calcFactorial(count);
            count++;
        }
        return e;
    }

    public static void main (String [] args){

        for (int i=1; i<=20; i++){
            System.out.print(calcFactorial(i));
            System.out.println();
        }
        System.out.println(calcE());
        System.out.printf("e is %2.3f \n", calcEX(1));
        System.out.printf("e is %2.3f \n", calcEX(2));
        System.out.printf("e is %2.3f \n", calcEX(3));
        System.out.printf("e is %2.3f \n", calcEX(4));
        System.out.printf("e is %2.3f \n", calcEX(5));

    }

}
