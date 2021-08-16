package TesteUm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idades[] = new int[10];
        int aux = 0;
        int faixaUm = 0;
        int faixaDois = 0;
        int faixaTres = 0;
        int faixaQuatro = 0;
        int faixaCinco = 0;


        for(int i = 0; i < 10; i++){
            System.out.print("Digite a idade " + (i+1) + ": ");
            int x = sc.nextInt();
            idades [i] = x;
            if(x < 15){
                faixaUm++;
            }

            if(x > 14 && x < 30){
                faixaDois++;
            }

            if(x > 29 && x < 45){
                faixaTres++;
            }

            if(x > 44 && x < 60){
                faixaQuatro++;
            }

            if(x > 59) {
                faixaCinco++;
            }
        }

        System.out.println("A quantidade de pessoas com até 14 anos é " + faixaUm);
        System.out.println("A quantidade de pessoas entre 15 a 29 anos é " + faixaDois);
        System.out.println("A quantidade de pessoas entre 30 a 44 anos é " + faixaTres);
        System.out.println("A quantidade de pessoas entre de 45 a 59 anos " + faixaQuatro);
        System.out.println("A quantidade de pessoas acima de 60 anos é " + faixaCinco);

        System.out.println("A porcentagem de pessoas com até 14 anos é de " + ((double)faixaUm/10) * 100 + "%");
        System.out.println("A porcentagem de pessoas acima de 60 anos é de " + ((double)faixaCinco/10) * 100 + "%");


    }


}
