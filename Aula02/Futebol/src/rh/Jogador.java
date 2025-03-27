package rh;

public class Jogador {

    private String nome;
    private int idade;
    private int numeroCamisa;
    private String posicao;

    public Jogador( String nome, int idade, int numeroDaCamisa, String posicao) {

        this.nome = nome;
        this.idade = idade;
        this.numeroCamisa = numeroDaCamisa;
        this.posicao = posicao;
        
    }

    public String getNome() {

        return this.nome;

    }

    public int getIdade() {

        return idade;

    }

    public int getNumeroDaCamisa() {

        return this.numeroCamisa;

    }

    public void setNumeroCamisa(int numeroCamisa) {

        this.numeroCamisa = numeroCamisa;

    }

    public String getPosicao() {

        return this.posicao;

    }

    public void setposicao(String posicao) {

        this.posicao = posicao;

    } 

    public void aniversario() {

        this.idade++;

    }

}
