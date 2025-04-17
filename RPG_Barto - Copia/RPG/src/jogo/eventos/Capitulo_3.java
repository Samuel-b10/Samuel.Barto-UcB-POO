package jogo.eventos;

import java.util.Scanner;

public class Capitulo_3 {

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

    public static void Cap_3() {

        limparTela();
        
        
        String SalaFinal = """

                    ─────────────────────────────────────────────
                    Capítulo 3: A Sala Final
                    ─────────────────────────────────────────────

                    Com os olhos ainda fixos nas recompensas recém-adquiridas, você respira fundo e se põe de pé.

                    A energia do Manto das Sombras Eternas pulsa em suas costas. As Gêmeas da Lua Sangrenta parecem vibrar em suas mãos, sedentas por mais.  
                    A Poção de Cura Antiga repousa em seu cinto, sua última carta, caso o pior aconteça.

                    À sua frente, um novo caminho se revela. Portões antigos e cobertos de inscrições esquecidas se abrem com um rangido sombrio.  
                    Um vento frio sopra de dentro da câmara final, carregando o cheiro de umidade, sangue... e algo mais.

                    Você caminha por entre colunas quebradas e estátuas antigas até chegar ao centro da imensa sala circular.

                    Então, o chão estremece.

                    Das sombras profundas, ergue-se uma criatura colossal — escamas negras como carvão, 
                    olhos dourados como o próprio sol, e presas capazes de triturar rocha sólida.

                     Zar Nekhul, o Devorador de Mundos 

                    A Serpente Ancestral que devorou exércitos inteiros no passado.

                    Seus olhos fixam-se em você. Não com fúria... mas com reconhecimento.

                    Como se soubesse que você era o último obstáculo entre ela... e o mundo.

                    A batalha final começa agora.
                    
        """;

        System.out.println(SalaFinal);

    }
}   
