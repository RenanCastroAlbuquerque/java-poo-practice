package resumo_livro;

public class resumo {
    public static void main(String[]args){
        livro livro01 = new livro();
        livro01.titulo = "O Guia do Mochileiro das Galáxias";
        livro01.autor = "Douglas Adams";
        livro01.paginas = 208;

        livro01.exibir_informacoes();
    }
}
