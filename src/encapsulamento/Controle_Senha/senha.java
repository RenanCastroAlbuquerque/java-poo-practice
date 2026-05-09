package encapsulamento.Controle_Senha;

import java.util.Scanner;

public class senha {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite usa senha:");
        String senha = sc.nextLine();

        System.out.println("Confirme sua senha: ");
        String confirmar_senha = sc.nextLine();

        if (senha.equals(confirmar_senha)){
            System.out.println("Senha alterada com sucesso");
        }else{
            System.out.println("A senha precisa ser igual!");
        }

        controle c1 = new controle(senha);
    }
}
