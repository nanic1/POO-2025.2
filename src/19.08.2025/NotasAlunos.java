import java.util.Scanner;
public class NotasAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alunos;
        float nota, media;
        float soma = 0;

        System.out.print("Digite o número de alunos da turma: ");
        alunos = teclado.nextInt();

        if (alunos <= 0){
            System.out.println("Número de alunos inválido");
            return;
        }

        for (int i = 1; i <= alunos; i++){
            System.out.printf("Digite a nota do aluno %d: ", i);
            nota = teclado.nextFloat();

            if (nota <0 || nota > 10){
                System.out.println("Nota inválida. Digite somente valores entre 0 e 10");
                i--;
                continue;
            }
            soma += nota;
        }
        media = soma / alunos;
        System.out.printf("Média da turma = %.1f", media);
    }
}
