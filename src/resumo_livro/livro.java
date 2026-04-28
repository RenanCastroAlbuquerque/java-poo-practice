package resumo_livro;

public class livro {
    String titulo;
    String autor;
    int paginas;

    public void exibir_informacoes(){
        System.out.printf("O livro %s, escrito por %s, contém %d", titulo, autor, paginas);
    }
}
