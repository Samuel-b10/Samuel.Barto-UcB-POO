package jogo;

import java.util.Random;

public class Personagem {

    public String nome; 
    public int vida;
    public int dano;
    public int nivel;
    public String rank;

    public Personagem(String nome, int vida, int dano, int nivel, String rank) {

        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.nivel = nivel;
        this.rank = rank;

    } 

    public int atacar() {
        Random random = new Random();
        int variacao = random.nextInt(5);
        int danoFinal = dano + variacao;
        return Math.max(danoFinal, 0); 
    } 
    
    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

}
