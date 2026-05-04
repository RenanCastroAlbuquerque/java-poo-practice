package tarefas;

public class tarefa {
    String descricao;
    Boolean concluida;

    public void exibir(){
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}
