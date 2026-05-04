package tarefas;

import java.util.Scanner;

public class controle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        tarefa t1 = new tarefa();
        System.out.println("Escreva a descrição sobre o seu planejamento de hoje: ");
        t1.descricao = sc.nextLine();

        System.out.println("Você concluiu sua tarefa? (Digite True para sim e False para não) ");
        t1.concluida = sc.nextBoolean();
        sc.nextLine();
        t1.exibir();

        tarefa t2 = new tarefa();
        System.out.println("Escreva a descrição sobre o seu planejamento de hoje: ");
        t2.descricao = sc.nextLine();

        System.out.println("Você concluiu sua tarefa? (Digite True para sim e False para não) ");
        t2.concluida = sc.nextBoolean();
        t2.exibir();
    }
}
