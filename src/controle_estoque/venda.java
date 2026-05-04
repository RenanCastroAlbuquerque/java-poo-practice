package controle_estoque;

public class venda {
    public static void main(String[]args){
        estoque item = new estoque();
        item.produto = "Camiseta - Polo";
        item.estoque = 10;
        item.vender(5);

        estoque item2 = new estoque();
        item2.produto = "Calça - Cargo";
        item2.estoque = 5;
        item2.vender(6);
    }
}
