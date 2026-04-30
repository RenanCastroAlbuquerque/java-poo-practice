package calculo_notas;

public class aluno {
    String nome;
    double nota1, nota2, nota3;

    public void exibir_nota(){
        double media = (this.nota1 + this.nota2 + this.nota3) / 3;

        if (media >= 7){
            System.out.printf("Parábens %s, você foi aprovado!", nome + " Media: " + media);
        } else if(media >= 6){
            System.out.printf("%s, você ficou de recuperação!", nome + " Media: " + media);
        } else if(media <= 3){
            System.out.printf("%s, você foi reprovado!", nome + " Media: " + media);
        }
    }
}
