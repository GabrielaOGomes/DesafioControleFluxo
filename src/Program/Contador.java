package Program;

import Exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();

        try {
            //chamada do método contador
            contador(num1, num2);
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contador(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }
        int contagem = num2 - num1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}

