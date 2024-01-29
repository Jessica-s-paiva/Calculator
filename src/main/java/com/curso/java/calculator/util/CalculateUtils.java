package com.curso.java.calculator.util;

import com.curso.java.calculator.model.User;

import java.util.Scanner;

public class CalculateUtils {
    private static final Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    public static void calculate(){
        String operation;
        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        double a, b;
        User user = new User("Jess", "Analista de sistemas", 33, "(41)987990725");

        System.out.println("Bem vindo(a) " + user.getName() + "! \nVi que você é um(a) " + user.getProfession() + "!");
        System.out.println("Digite qual operação você deseja realizar: Soma, Subtração, Multiplicação ou Divisão?");
        operation = ler.next();

        switch (operation){
            case "soma":
                sum();
                break;

            case "subtração":
                subtraction();
                break;

            case "multiplicação":
                multiplication();
                break;

            case "divisão":
                division();
                break;
        }
    }

    public static void sum(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = (double) ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("O resultado da sua soma é: " + ( numberOne + numberTwo));
    }

    public static void subtraction(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = (double) ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("O resultado da sua subtração é: " + ( numberOne - numberTwo));
    }

    public static void multiplication(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = (double) ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("O resultado da sua multiplicação é: " + ( numberOne * numberTwo));
    }

    public static void division(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = (double) ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

        if (numberTwo == 0){
            System.out.println("Erro, o número divisor deve ser diferente de zero!");
            System.out.println("Informe o primeiro valor: ");
            numberOne = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)
            System.out.println("Informe o segundo valor.: ");
            numberTwo = (double) ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        }
        System.out.println("O resultado da sua divisão é: " + ( numberOne / numberTwo));
    }
}