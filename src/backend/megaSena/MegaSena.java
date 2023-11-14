package backend.megaSena;

import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        int[] numerosEscolhidos = new int[7];
        int[] numerosSorteados = new int[7];
        int numeroEscolhido;

        boolean isRunning = true;

        System.out.println(new Random().nextInt(101));

        String errorMessage = "Por favor digite os 7 números válidos.";


        System.out.println("Escolha seus 7 números entre 0 e 100, sem repeti-los.");
        while(isRunning){
            try {
                Scanner scan = new Scanner(System.in);

                //ADICIONANDO NÚMEROS DO USUÁRIO
                for (int i = 0; i < 7; i++) {
                    numeroEscolhido = Integer.parseInt(scan.next());
                    numerosEscolhidos[i] = numeroEscolhido;

                    if(numeroEscolhido < 0 || numeroEscolhido > 100) throw new NumberFormatException();

                    for(int j = 0; j<i; j++){
                        if(numerosEscolhidos[j] == numeroEscolhido) throw new NumberFormatException();
                    }
                    System.out.printf("%d° escolhido: %d\n", i+1, numeroEscolhido);
                }

                //GERANDO OS NÚMEROS SORTEADOS
                for (int k = 0; k < 7; k++) {
                    int random = new Random().nextInt(101);
                    if(random == numerosSorteados[k]) {
                        random = new Random().nextInt(101);
                        k--;
                    }
                    numerosSorteados[k] = random;
                }

                //VERIFICANDO ACERTOS
                int numeroAcertos = 0;
                for(int i = 0; i<7;i++){
                    for(int j = 0;j<=i;j++){
                        if(numerosEscolhidos[j] == numerosSorteados[i]){
                            numeroAcertos++;
                            break;
                        }
                    }
                }

                if(numeroAcertos == 5) System.out.println("Parabéns! Você acertou 5 números e vai receber 10 mil reais!!");
                else if (numeroAcertos == 6) {
                    System.out.println("Parabéns! Você acertou 6 números e vai receber 50 mil reais!!");
                } else if (numeroAcertos == 7) {
                    System.out.println("Parabéns! Você acertou 7 números e vai receber 200 mil reais!!");
                } else {
                    System.out.println("Que pena, você não ganhou nada.");
                }

                scan.close();
                isRunning = false;
                System.out.println("\nPrograma fechado");
            }
            //ACHANDO POSSÍVEIS ERROS DO USUÁRIO AO ADICIONAR OS NÚMEROS
            catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
}
