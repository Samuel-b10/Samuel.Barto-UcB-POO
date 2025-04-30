package fight;

import java.util.Scanner;
import jogo.perfil.Jogador;
import jogo.enemy.Inimigo;

public class Combate {

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela.");
        }
    }

    public static void IniciarCombate(Jogador jogador, Inimigo inimigo, Scanner scanner) {

        jogador.mostrarInformacoes();

        System.out.println("\nPressione ENTER para continuar");
        scanner.nextLine();
        limparTela();

        System.out.println("\nO combate comecou!\n");

        System.out.println("Seu inimigo eh: " + inimigo.getNome());
        System.out.println("vida eh: " + inimigo.getVida());
        System.out.println("dano eh: " + inimigo.getDano());
        System.out.println("\nSua vida eh: " + jogador.getVida());
        System.out.println("Seu dano eh: " + jogador.getDano());

        int opcao = -1;
        int turno = 1;
        int DanoInimigoTotal = 0;

        // Loop para entrada segura
        while (true) {
            System.out.println("\nEscolha uma opcao:\n");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpa o ENTER
                if (opcao == 1 || opcao == 2) {
                    break;
                } else {
                    System.out.println("Opcao invalida. Tente novamente.");
                }
            } else {
                System.out.println("Entrada invalida. Digite um numero.");
                scanner.nextLine(); // limpa entrada errada
            }
        }

        do {
            limparTela();
            
            if (opcao == 1) {

                System.out.println("\nTurno " + turno++);
                int danoJogador = jogador.atacar();
                inimigo.receberDano(danoJogador);
                System.out.println("\nVoce atacou o inimigo e causou " + danoJogador + " de dano. Vida do inimigo: " + inimigo.getVida());

            } else if (opcao == 2) {

                System.out.println("Voce fugiu do combate.");
                System.out.println("\nPressione ENTER para continuar");
                scanner.nextLine();
                limparTela();
                break;

            }

            if (!inimigo.estaVivo()) {
                System.err.println("\n" + inimigo.getNome() + " Morreu!");
                System.err.println("Suas habilidades aumentaram!");

                switch (inimigo.getNome()) {
                    case "Goblin":
                        jogador.ganharNivelGoblin();
                        break;
                    
                }

                jogador.RecuperarVida(DanoInimigoTotal);
                jogador.ganharRank();
                jogador.mostrarInformacoes();
                System.out.println("\nVida recuperada: " + DanoInimigoTotal);
                System.out.println("Dano total que o inimigo causou: " + DanoInimigoTotal);

                System.out.println("\nPressione ENTER para continuar");
                scanner.nextLine();
                limparTela();
                break;
            }

            int danoInimigo = inimigo.atacar();
            jogador.receberDano(danoInimigo);
            DanoInimigoTotal += danoInimigo;
            System.out.println("O inimigo atacou voce e causou " + danoInimigo + " de dano. Sua vida: " + jogador.getVida());

            if (!jogador.estaVivo()) {
                String gameOver = """

                
                ═══════════════════════════════════════════════════════════
                                VOCÊ FOI DERROTADO...

                Seu corpo cai lentamente ao chão enquanto a visão escurece.
                A dor desaparece, e só resta o som da sua respiração fraca.

                Você lutou com tudo o que tinha...
                Mas, desta vez, não foi o suficiente.

                Enquanto a Dungeon se fecha, uma única pergunta ecoa:
                "Se eu tivesse sido um pouco mais forte..."

                Mas este... não é o fim.
                Cada queda é uma chance de se levantar mais forte.

                ═══════════════════════════════════════════════════════════  
                """;
                System.out.println(gameOver);
                break;
            }

            System.out.println("\nPressione ENTER para continuar");
            scanner.nextLine();
            limparTela();

        } while (true);
    }

}