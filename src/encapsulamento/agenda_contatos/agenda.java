package encapsulamento.agenda_contatos;

import java.util.ArrayList;

public class agenda {
    public void main(String[] args) {
        ArrayList<contatos> Contato = new ArrayList<>();
        Contato.add(new contatos("Jõao Silva", "(11) 99999-0000"));
        Contato.add(new contatos("Luana Santos", "(21) 98888-0000"));
        Contato.add(new contatos("Pedro Oliveira", "(31) 97777-0000"));
        int indice = 1;

        for(contatos contato : Contato){
            System.out.printf("%d. %s - %s\n", indice++, contato.getNome(), contato.getTelefone());
        }
    }
}
