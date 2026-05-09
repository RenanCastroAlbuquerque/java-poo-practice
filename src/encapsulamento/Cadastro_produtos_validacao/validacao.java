package encapsulamento.Cadastro_produtos_validacao;

public class validacao {
    private String produto;
    private Double preco;

    public validacao(String produto, Double preco){
        this.produto = produto;
        setPreco(preco);
    }

    public String getProduto(){
        return produto;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(double valor){
        if (valor >= 0) {
            preco = valor;
        } else {
            System.out.println("Preço inválido.");
        }
    }
}
