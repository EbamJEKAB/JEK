package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letra;
        System.out.print("ingrese una letra cualquiera:");
        letra = sc.nextLine();
        
        if(toUpperCase(letra)== letra){
            System.out.print("Mayuscula");
        }
        else{
            System.out.print("Minuscula");
        }

    }

    private static String toUpperCase(String letra) {
        return null;
    }
}