package Zerar_saldo;

public class conta {
    Double saldo;

    public void exibir_saldo(){
        System.out.printf("\nSeu saldo é de R$ %.2f reais", saldo);
    }

    public void saldo_zerado(){
        saldo = 0.0;
    }
}
