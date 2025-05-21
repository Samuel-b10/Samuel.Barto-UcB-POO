package instituicoes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import campeonato.Premiacao;
import rh.Jogador;

public class TimeDeFutebol {

    private String nome;
    private LocalDateTime dataCriacao;
    private Jogador jogadores[];
    private List<Premiacao> premiacoes;

    public TimeDeFutebol(String nome) {
        this.nome = nome;
        this.dataCriacao = LocalDateTime.now();
        this.jogadores = new Jogador[100]; 
        this.premiacoes = new ArrayList<>(); 
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDateTime getDataCriacao() {
        return this.dataCriacao;
    }

    public void adicionarJogador(Jogador jogador) {
        int numero = jogador.getNumeroDaCamisa();
        if (numero >= 0 && numero < jogadores.length) {
            this.jogadores[numero] = jogador;
        } else {
            System.out.println("Número da camisa inválido: " + numero);
        }
    }

    public void adicionarPremiacao(Premiacao premiacao) {
        this.premiacoes.add(premiacao); 
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }

    public Jogador getJogadorPorCamisa(int numeroDaCamisa) {
        if (numeroDaCamisa >= 0 && numeroDaCamisa < jogadores.length) {
            return this.jogadores[numeroDaCamisa];
        } else {
            System.out.println("Camisa inválida: " + numeroDaCamisa);
            return null;
        }
    }

    public List<Premiacao> getPremiacoes() {
        return this.premiacoes;
    }
}