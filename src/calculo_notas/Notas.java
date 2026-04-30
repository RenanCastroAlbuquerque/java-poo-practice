package calculo_notas;

import java.util.Scanner;

public class Notas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        aluno aluno1 = new aluno();

        System.out.println("Qual o nome do aluno?");
        aluno1.nome = sc.nextLine();

        System.out.println("Qual a primeira nota?");
        aluno1.nota1 = sc.nextDouble();

        System.out.println("Qual a segunda nota?");
        aluno1.nota2 = sc.nextDouble();

        System.out.println("Qual a terceira nota?");
        aluno1.nota3 = sc.nextDouble();

        aluno1.exibir_nota();

        sc.close();
    }
}
