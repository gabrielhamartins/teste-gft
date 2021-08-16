package TesteQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o turno em que você trabalha: ");
        String turnoInformado = sc.nextLine();
        if(turnoInformado.equalsIgnoreCase("m")){
            System.out.println("Bom dia!");
        }
        else if (turnoInformado.equalsIgnoreCase("t")){
            System.out.println("Boa tarde!");
        }
        else if(turnoInformado.equalsIgnoreCase("n")){
            System.out.println("Boa noite!");
        }
        else{
            System.out.println("Valor inválido! Digite M (manhã), T (tarde) ou N (noite).");
        }
    }
}
