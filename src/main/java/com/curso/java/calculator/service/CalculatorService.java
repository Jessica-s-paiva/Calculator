package com.curso.java.calculator.service;

import com.curso.java.calculator.model.User;
import java.util.Scanner;

import static com.curso.java.calculator.util.CalculateUtils.Sum;

public class CalculatorService {

    public static void main(String[] args) {
        User user = new User("Jess", "Analista de sistemas", 33, "(41)987990725");

        System.out.println("Bem vindo(a) " + user.getName() + "! \nVi que você é um(a) " + user.getProfession() + "!");
        System.out.println("Digite qual operação você deseja realizar: Soma, Subtração, Multiplicação ou Divisão?");

        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        double a, b;

        System.out.printf("Informe o primeiro valor: ");
        a = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)

        System.out.printf("Informe o segundo valor.: ");
        b = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

        System.out.printf("\nResultados:\n");
        System.out.printf("%d + %d = %3d\n", a, b, (a + b));
        System.out.printf("%d - %d = %3d\n", a, b, (a - b));
        System.out.printf("%d * %d = %3d\n", a, b, (a * b));
        System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a / b));
        System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b, ((double)a / b));
    }
}
