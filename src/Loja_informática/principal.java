package Loja_informática;

public class principal {
    public static void main(String[]args){
        produto produto1 = new produto();
        produto1.nome = "Mouse Gamer";
        produto1.preco = 159.90;
        produto1.quantidade = 25;

        produto1.exibir_informacao();

    }
}
