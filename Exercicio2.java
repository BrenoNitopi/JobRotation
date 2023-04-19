import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor inteiro que deseja verificar na sequência de Fibonacci: ");
        int resposta = entrada.nextInt();

        int[] sequencia = new int[48];

        sequencia[0] = 0;
        sequencia[1] = 1;

        boolean acerto = false;

        for (int i = 2; i < sequencia.length - 1; i++){
            sequencia[i] = sequencia [i - 1] + sequencia[i - 2];
            if (sequencia[i] == resposta){
                acerto = true;
                break;
            }
        }

        if (acerto == true){
            System.out.printf("%d está presente na sequência",resposta);
        } else {
            System.out.printf("%d não está presente na sequência",resposta);
        }

        entrada.close();
    }
}
