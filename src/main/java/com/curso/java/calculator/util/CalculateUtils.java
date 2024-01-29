package com.curso.java.calculator.util;

import com.curso.java.calculator.model.User;

import java.util.Scanner;

public class CalculateUtils {
    private static final Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    public static void calculate(){
        while (true){
            String operation;
            Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
            User user = new User("Jess", "Analista de sistemas", 33, "(41)987990725");

            System.out.println("Bem vindo(a) " + user.getName() + "! \nVi que você é um(a) " + user.getProfession() + "!");
            System.out.println("Digite qual operação você deseja realizar: Soma, Subtração, Multiplicação ou Divisão?");
            operation = removeAccent(ler.next()).toLowerCase().replace("ç", "c" +
                    "c");

            switch (operation){
                case "soma":
                    sum();
                    break;

                case "subtracao":
                    subtraction();
                    break;

                case "multiplicacao":
                    multiplication();
                    break;

                case "divisao":
                    division();
                    break;

                default:
                    System.out.println("Opção inválida, digite uma operação válida!");
            }
        }
    }

    public static String removeAccent(String input) {
        return java.text.Normalizer.normalize(input, java.text.Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    public static void sum(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble();
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = ler.nextDouble();
        System.out.println("O resultado da sua soma é: " + ( numberOne + numberTwo));
    }

    public static void subtraction(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble();
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = ler.nextDouble();
        System.out.println("O resultado da sua subtração é: " + ( numberOne - numberTwo));
    }

    public static void multiplication(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble();
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = ler.nextDouble();
        System.out.println("O resultado da sua multiplicação é: " + ( numberOne * numberTwo));
    }

    public static void division(){
        System.out.println("Informe o primeiro valor: ");
        double numberOne = ler.nextDouble();
        System.out.println("Informe o segundo valor.: ");
        double numberTwo = ler.nextDouble();

        if (numberTwo == 0){
            System.out.println("Erro, o número divisor deve ser diferente de zero!");
            System.out.println("Informe o primeiro valor: ");
            numberOne = ler.nextDouble();
            System.out.println("Informe o segundo valor.: ");
            numberTwo = ler.nextDouble();
        }
        System.out.println("O resultado da sua divisão é: " + ( numberOne / numberTwo));
    }
}