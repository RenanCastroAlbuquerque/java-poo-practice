package Loja_informática;

public class produto {
    String nome;
    Double preco;
    int quantidade;

    public void exibir_informacao(){
        System.out.printf("Nome do produto: %s, Preço do produto: %.2f, Quantidade disponivel: %d", nome, preco, quantidade);
    }
}
