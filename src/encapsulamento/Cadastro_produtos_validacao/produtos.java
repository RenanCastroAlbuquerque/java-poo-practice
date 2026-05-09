package encapsulamento.Cadastro_produtos_validacao;

import java.util.ArrayList;

public class produtos {
    public static void main(String[] args) {
        ArrayList<validacao> validar = new ArrayList<>();
        validar.add(new validacao("Mouse", -10.00));

        for(validacao valida : validar){
            System.out.println("Produto: " + valida.getProduto());
            System.out.println("Preço: " + valida.getPreco());
        }
    }
}