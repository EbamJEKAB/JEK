package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double catetoad, catetoop, hipotenusa;

        System.out.print("Ingrese el valor del cateto adyacente:");
        catetoad = sc.nextDouble();
        System.out.print("Ingrese el valor del cateto opuesto:");
        catetoop = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(catetoad,2)+Math.pow(catetoop, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
