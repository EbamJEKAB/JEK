package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("introduzca un numero entero cualquiera:");
        N = sc.nextInt();

        if (N%10==0){
            System.out.println("Es multiplo de diez (10)");
        }
        else{
            System.out.println("No es multiplo de diez (10)");
        }
    }
}
