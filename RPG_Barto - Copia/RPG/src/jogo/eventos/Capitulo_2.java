package jogo.eventos;

import java.util.Scanner;

public class Capitulo_2 {

    public static void Cap_2() {
        
        Scanner scanner = new Scanner(System.in);

        String miniBoss = """
        
                    ─────────────────────────────────────────────
                    Capítulo 2: O Mini-Boss
                    ─────────────────────────────────────────────
                    Após uma batalha intensa, você observa os corpos caídos do Goblin Elite e do Lobo Negro.
                    Sua respiração ainda está pesada, e seu corpo coberto de arranhões e sangue — parte seu, parte deles.

                    Mas você venceu.

                    Ainda assim, algo dentro da dungeon parece chamá-lo para continuar. 
                    Uma sensação estranha... como se algo maior ainda estivesse à sua espera.

                    Você avança pelos corredores úmidos e escuros da dungeon. 
                    O silêncio agora parece mais denso, como se até o ar estivesse segurando a respiração.

                    Ao virar uma esquina, você sente o chão tremer levemente.

                    Passos... pesados... rítmicos.

                    E então você o vê.

                    Uma sala larga, iluminada apenas por tochas antigas que dançam sombras nas paredes. 
                    No centro dela, um ser colossal se ergue — pele grossa, esverdeada, cicatrizes cruzando o peito largo. 
                    Um machado maior que seu corpo descansa nos ombros de uma criatura com olhos brilhando em vermelho-sangue.

                    [MINI BOSS ENCONTRADO: ORC REI]

                    Com um rugido que faz as pedras vibrarem, ele avança.

                    Essa não é apenas mais uma luta... 
                    É o teste que separa os fracos dos verdadeiros caçadores.
                    
                    Prepare-se para o combate mais difícil até agora.

        """;

        System.out.println(miniBoss);

        System.out.println("\nPressione ENTER para continuar");
        scanner.nextLine();

    }

    public static void Cap_2_1() {

        Scanner scanner = new Scanner(System.in);

        String recompensaBoss = """

                    ─────────────────────────────────────────────
                    Capítulo 2: Os Drops do Mini-Boss Orc Rei
                    ─────────────────────────────────────────────

                    O Orc Rei solta um último rugido antes de cair pesadamente ao chão.

                    A sala silencia. Você venceu.

                    No meio dos escombros deixados pela batalha, algo brilha entre as pedras.

                    Você se aproxima e encontra os despojos do inimigo:

                    Manto das Sombras Eternas [+100 Vida]  
                    Gêmeas da Lua Sangrenta, duas adagas negras como a noite [+50 Dano]  

                    Suas mãos tremem — de exaustão, mas também de empolgação.

                    Essa dungeon mudou tudo.

                    Agora... você não é mais apenas um Caçador de Rank F. 

        """;

        System.out.println(recompensaBoss);

        System.out.println("\nPressione ENTER para continuar");
        scanner.nextLine();
    }
}
