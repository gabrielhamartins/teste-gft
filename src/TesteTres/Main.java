package TesteTres;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[6];
        pessoas[0] = new Paulista();
        pessoas[1] = new Mineiro();
        pessoas[2] = new Carioca();
        pessoas[3] = new Carioca();
        pessoas[4] = new Mineiro();
        pessoas[5] = new Paulista();

        for(Pessoa individuo : pessoas){
            System.out.println(individuo.giria());
        }
    }
}
