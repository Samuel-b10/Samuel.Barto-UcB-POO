package jogo.perfil;

import java.util.Random;
import java.util.Scanner;

import jogo.Personagem;

public class Jogador extends Personagem{

    public Jogador(String nome) {
        super(nome, 100, 14,1,"E");
    }

    public static Jogador criarJogador() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();
        return new Jogador(nome);
    }

    public void mostrarInformacoes() {
        System.out.println("\n──────────────────────────────────────");
        System.out.println("           Seus Status: \n");
        System.out.println("            Nome: " + nome);
        System.out.println("            Vida: " + vida);
        System.out.println("            Dano: " + dano);
        System.out.println("            Nivel: " + nivel);
        System.out.println("            Rank: " + rank);
        System.out.println("──────────────────────────────────────");
    }

    public void ganharRank(){

        if (nivel <= 5) {
            this.rank = "E";
        } else if (nivel <= 20) {
            this.rank = "D";
        } else if (nivel <= 40) {
            this.rank = "C";
        } else if (nivel <= 60) {
            this.rank = "B";
        } else if (nivel <= 80) {
            this.rank = "A";
        } else if (nivel <= 100) {
            this.rank = "S";
        }

    }

    public void ganharNivelGoblin() {
        this.nivel += 2;
        this.vida += 10;
        this.dano += 6;
    }


    public void ganharNivelLobo_negro() {
        this.nivel += 5;
        this.vida += 20;
        this.dano += 8;
    }
    
    public void ganharNivelGoblin_Elite() {
        this.nivel += 8;
        this.vida += 40;
        this.dano += 10;
    }
    
    public void ganharNivelOrcRei() {
        this.nivel += 15;
        this.vida += 60;
        this.dano += 25;
    }

    public void ganharNivelSerpente() {
        this.nivel += 30;
        this.vida += 100;
        this.dano += 32;
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

    public void RecuperarVida(int vida) {

        this.vida += vida;

    }

    public void AumentoDano(int dano) {

        this.dano += dano;

    }

    public void AumentoVida(int vida) {

        this.vida += vida;

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
