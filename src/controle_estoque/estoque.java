package controle_estoque;

public class estoque {
    String produto;
    int estoque;

    public void vender(int qtd_vendida){
        if (estoque >= qtd_vendida){
            estoque -= qtd_vendida;
            System.out.printf("Venda realizada com sucesso. Estoque restante: %d\n", estoque);
        } else{
            System.out.printf("Estoque insuficiente");
        }
    }
}
