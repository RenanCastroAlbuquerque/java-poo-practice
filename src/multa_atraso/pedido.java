package multa_atraso;

public class pedido {
    String titulo;
    int dias_atraso;
    double calcularMulta() {
        return dias_atraso * 2.50;
    }

    void exibir_detalhes(){
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, dias_atraso, multa);
    }


    public void exibir_informacoes(){

        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", titulo, dias_atraso, multa);
    }

}