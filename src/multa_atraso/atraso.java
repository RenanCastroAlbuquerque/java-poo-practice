package multa_atraso;

public class atraso {
    public static void main(String[]args){
        pedido aluguel1 = new pedido();
        aluguel1.titulo = "Dom Casmurro";
        aluguel1.dias_atraso = 3;
        aluguel1.exibir_informacoes();
    }
}
