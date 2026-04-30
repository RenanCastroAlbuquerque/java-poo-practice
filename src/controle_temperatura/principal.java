package controle_temperatura;

public class principal {
    public static void main(String[]args){
        temperatura temperatura2 = new temperatura();
        temperatura2.local = "Setor A";
        temperatura2.temperatura_atual = 39.2;
        temperatura2.exibir();

        temperatura setorB = new temperatura();
        setorB.local = "Setor B";
        setorB.temperatura_atual = 35.6;
        setorB.exibir();
    }
}
