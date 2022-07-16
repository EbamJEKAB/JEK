package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.print("Ingrese Dividendo:");
        num1 = sc.nextDouble();
        System.out.print("Ingrese Divisor:");
        num2 = sc.nextDouble();

        if(num2!=0){
            resultado= num1/num2;
            System.out.println("El resultado es:" + resultado);
        }
        else{
            System.out.print("El numerador no debe ser cero(0)");
        }
    }
}
