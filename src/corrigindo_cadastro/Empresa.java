package corrigindo_cadastro;

public class Empresa {
    String nome;
    String cargoAtual;
    String cargoNovo;
    int nivelAcesso;
    int nivelAcessoAtualizado;

    public void exibir(){
        System.out.printf("\nNome do funcionário: %s, Cargo Atual: %s, Nivel de Acesso: %d", nome, cargoAtual, nivelAcesso);
    }

    public void exibirAtualizado(){
        System.out.printf("\nNome do funcionário: %s, Cargo Atualizado: %s, Nivel de Acesso Atualizado: %d", nome, cargoNovo, nivelAcessoAtualizado);
    }
}
