package jogo.enemy;

import java.util.Random;

import jogo.Personagem;

public class Inimigo extends Personagem{

    public Inimigo(String nome, int vida, int dano, int nivel, String rank) {

        super(nome, vida, dano, nivel, rank);

    }

    public int atacar() {

        Random random = new Random();
        int variacao = random.nextInt(7) - 3;
        int danoFinal = dano + variacao;
        return Math.max(danoFinal, 0);

    }

    public void receberDano(int dano) {

        this.vida -= dano;

    }    

    public String getNome() {

        return nome;

    }

    public String getVida() {

        return Integer.toString(vida);

    }

    public String getDano() {

        return Integer.toString(dano);

    }

}
