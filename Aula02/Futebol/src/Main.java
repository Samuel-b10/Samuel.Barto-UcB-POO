import campeonato.Premiacao;
import instituicoes.TimeDeFutebol;
import rh.Jogador;

public class Main {
    public static void main(String[] args) throws Exception {
        
        TimeDeFutebol barcelona = new TimeDeFutebol("FC Barcelona");

        Jogador jogador1 = new Jogador("Lionel Messi", 27, 10, "PD");
        Jogador jogador2 = new Jogador("Neymar Jr", 23, 11, "PE");
        Jogador jogador3 = new Jogador("Luiz Suárez", 28, 9, "ATA");


        barcelona.adicionarJogador(jogador1);
        barcelona.adicionarJogador(jogador2);
        barcelona.adicionarJogador(jogador3);

        Premiacao premiacao1 = new Premiacao("Liga dos Campeões da UEFA", 2015);
        Premiacao premiacao2 = new Premiacao("La Liga", 2015);

        barcelona.adicionarPremiacao(premiacao1);
        barcelona.adicionarPremiacao(premiacao2);

    }
}
