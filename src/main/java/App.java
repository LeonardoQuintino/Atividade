package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        Corpo_humano c1 = new Corpo_humano();
        System.out.println("Digite o seu peso: ");
        c1.setPeso(read.nextDouble());

        System.out.println("Digite o sua massa: ");
        c1.setMassa(read.nextDouble());

        System.out.println("Digite sua altura: ");
        c1.setAltura(read.nextDouble());
        c1.calcularIMC();
        System.out.println(c1.getIMC());
    }
}
