package app.caminho01;

import java.util.Scanner;

public class Rota01 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int numero;

        System.out.print("DIGITE UM NUMERO: ");
        numero = valor.nextInt();

        System.out.print("O NUMERO DIGITADO FOI " + numero);
        valor.close();

    }
}