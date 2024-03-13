package aula4;

import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        Scanner digitado = new Scanner (System.in);
        double n1, n2, resultado;

        System.out.print (" digite o primeiro Numero: ");
        n1 = digitado.nextDouble();

        System.out.print ("Digite o segundo Numero ");
        n2 = digitado.nextDouble();


        resultado = n1/n2;
        System.out.println ("O Resultado deu: " + resultado);


    }
}
