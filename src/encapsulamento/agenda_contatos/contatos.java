package encapsulamento.agenda_contatos;

public class contatos {
    private String nome;
    private String telefone;

    public contatos(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }
}
