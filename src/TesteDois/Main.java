package TesteDois;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double porcentagemDoAumento = 0;
        double valorAumentado = 0;
        double novoSalario = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salarioAnterior = sc.nextDouble();

        if(salarioAnterior <= 1600.00){
            porcentagemDoAumento = 0.25;
        }
        if(salarioAnterior > 1600.00 && salarioAnterior <= 3000.00){
            porcentagemDoAumento = 0.20;
        }
        if(salarioAnterior > 3000.00 && salarioAnterior <= 5000.00){
            porcentagemDoAumento = 0.15;
        }
        if(salarioAnterior > 5000.00){
            porcentagemDoAumento = 0.10;
        }
        novoSalario = salarioAnterior * (porcentagemDoAumento+1);
        valorAumentado = novoSalario - salarioAnterior;

        System.out.println("Salário anterior: R$ " + String.format("%.2f", salarioAnterior));
        System.out.println("Percentual aumentado no salário: " + porcentagemDoAumento * 100 + "%");
        System.out.println("Valor do aumento: R$ " + String.format("%.2f", valorAumentado));
        System.out.println("Salário após aumento: R$ " + String.format("%.2f", novoSalario));
    }
}
