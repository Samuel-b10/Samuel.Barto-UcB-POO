package instituicoes;

import java.time.LocalDateTime;

import campeonato.Premiacao;
import rh.Jogador;

public class TimeDeFutebol {

    private String nome;
    private LocalDateTime dataCriacao;
    private Jogador jogadores[];
    private Premiacao premiacao[];

    public TimeDeFutebol (String nome) {

        this.nome = nome;
        this.dataCriacao = LocalDateTime.now();
        this.jogadores = new Jogador[100];
        this.premiacao = new Premiacao[50];
    }

    public String getnome() {

        return this.nome;

    }

    public LocalDateTime getDateTime9() {

        return this.dataCriacao;

    }

    public void adicionarJogador(Jogador jogador) {

        this.jogadores[jogador.getNumeroDaCamisa()] = jogador;

    }

    public void adicionarPremiacao(Premiacao premiacao) {

        this.premiacao[premiacao.getAno()] = premiacao;

    }

    public Jogador[] getJogadores() {

        return this.jogadores;

    }

    public Jogador getJogadorPorCamisa(int numeroDaCamisa) {

        return this.jogadores[numeroDaCamisa];

    }
}
