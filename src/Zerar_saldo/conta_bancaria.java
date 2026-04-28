package Zerar_saldo;

public class conta_bancaria {
    public static void main(String[]args){
        conta saldo1 = new conta();
        saldo1.saldo = 1579.42;

        saldo1.exibir_saldo();
        saldo1.saldo_zerado();
        saldo1.exibir_saldo();
    }
}
