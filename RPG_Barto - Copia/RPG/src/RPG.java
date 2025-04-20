import jogo.enemy.Inimigo;
import jogo.eventos.Capitulo_1;
import jogo.eventos.Capitulo_1Cont;
import jogo.eventos.Capitulo_1Fugir;
import jogo.eventos.Capitulo_2;
import jogo.eventos.Capitulo_3;
import jogo.eventos.Final_Jogo;
import jogo.perfil.Jogador;

import java.util.Scanner;

import fight.Combate;
import fight.Combate_SemFuga;

public class RPG {

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

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String introducao = """
        Bem-vindo a Solo Leveling RPG

                "No início, pensávamos que os portais eram apenas rachaduras entre mundos. 
                Monstros passavam por eles, e caçadores se tornaram nossa única linha de defesa. 
                Mas com o tempo, percebemos... algo nos observava do outro lado." 

                Há 10 anos, portais começaram a surgir em todo o mundo, conectando a Terra a dimensões repletas de criaturas monstruosas. 
                Para combatê-las, pessoas comuns começaram a despertar habilidades sobrenaturais, tornando-se Caçadores, guerreiros 
                licenciados para invadir e limpar as dungeons que emergem dessas fendas.

                Você é um deles. Ou melhor, você era um dos mais fracos.

                Até que, em uma dungeon onde tudo deu errado, você foi deixado para morrer. Mas em vez da morte, algo diferente aconteceu. 
                Você acordou. E junto com isso, um misterioso sistema surgiu, visível apenas a você: missões diárias, níveis, habilidades 
                e recompensas.

                Agora, enquanto todos veem você como um caçador de baixo nível, você está crescendo em segredo, mais rápido, mais forte, 
                e mais perigoso do que qualquer outro.

                Mas quanto mais você sobe... mais você se aproxima da verdade por trás dos portais.
        """;

        System.out.println(introducao);

        System.out.println("\nPressione ENTER para continuar");
        scanner.nextLine();
        limparTela();
        
        // Criação do jogador
        Jogador jogador = Jogador.criarJogador();
        System.out.println("\n          " + jogador.nome + ", sua jornada começa agora!\n");

        // Criação de inimigos
        Inimigo inimigo1 = new Inimigo("Goblin", 100, 12, 5,"E");
        Inimigo inimigo2 = new Inimigo("Goblin Elite", 160, 15, 15,"D");
        Inimigo inimigo3 = new Inimigo("Lobo Negro", 120, 16, 10,"D");
        Inimigo inimigo4 = new Inimigo("Orc Rei", 230, 25, 20, "C");
        Inimigo inimigo5 = new Inimigo("Zar Nekhul", 750, 45, 38, "B");

        // Capítulo 1 - O Despertar do Caçador
        Capitulo_1.Cap_1();
        Combate.IniciarCombate(jogador, inimigo1, scanner);

        if (jogador.vida > 100) {
            
            // Capítulo 1 - Contínuação da Dungeon
            Capitulo_1Cont.Cap_1_Cont();
            Combate_SemFuga.EscolhaDoCombate(jogador, inimigo2, inimigo3, scanner);
            
        } else {
             
            // Capítulo 1 - Fuga
            jogador.AumentoDano(3);
            Capitulo_1Fugir.Cap_1_Fugir();
            Combate_SemFuga.EscolhaDoCombate(jogador, inimigo2, inimigo3, scanner);

        }

        if (jogador.estaVivo()) {
            
            // Capítulo 2 - A sala do Mini-Boss
            Capitulo_2.Cap_2();
            Combate_SemFuga.IniciarCombSemFuga(jogador, inimigo4, scanner);
            Capitulo_2.Cap_2_1();
            jogador.AumentoDano(50);
            jogador.AumentoVida(100);

        }

        if (jogador.estaVivo()) {
            
            // A Batalha final com o Boss 
            Capitulo_3.Cap_3();
            jogador.mostrarInformacoes();
            System.out.println("\nPressione ENTER para continuar");
            scanner.nextLine();
            limparTela();
            Combate_SemFuga.IniciarCombSemFuga(jogador, inimigo5, scanner);
            
        }
        
        if (jogador.estaVivo()) {
            
            // Fim do jogo    
            limparTela();
            Final_Jogo.Final();
            System.out.println("\n              Parabéns, " + jogador.nome + "! Você conseguiu vencer o jogo!\n");
            System.out.println("              Status finais: ");
            jogador.mostrarInformacoes();
            System.out.println("\nPressione ENTER para continuar");
            scanner.nextLine();
        }


    }
}

