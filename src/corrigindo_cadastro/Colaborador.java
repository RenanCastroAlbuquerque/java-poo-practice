package corrigindo_cadastro;

public class Colaborador {
    public static void main(String[]args){
        Empresa funcionario = new Empresa();
        funcionario.nome = "Júlia Oliveira";
        funcionario.cargoAtual = "Desenvolvedora Júnior";
        funcionario.nivelAcesso = 1;
        funcionario.exibir();

        funcionario.cargoNovo = "Desenvolvedora Plena";
        funcionario.nivelAcessoAtualizado = 2;
        funcionario.exibirAtualizado();
    }
}
