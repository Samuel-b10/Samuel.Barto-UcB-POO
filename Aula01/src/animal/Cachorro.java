package animal;
public class Cachorro {

    private String nome;
    private String raca;
    private String pelo;
    private float altura;
    private float peso;
    private int idade;

    public Cachorro(String nome, String raca, String pelo, float altura, float peso) {
        
        this.nome = nome;
        this.raca = raca;
        this.pelo = pelo;
        this.altura = altura;
        this.peso = peso;
        this.idade = 0;

    }

    public void Aniversario() {

        this.idade++;

    }

    public float comeu(float pesoDaComida) {

        this.peso = this.peso + pesoDaComida;
        return this.peso;

    }

    public void setAltura(float altura) {

        this.altura = altura;

    }

    public void setPeso(float peso) {

        this.peso = peso;

    }

    public String getNome() {

        return this.nome;

    }

    public String toString() {

        return "Nome: " + nome + 
        "\nIdade: " + idade + 
        "\nPeso: " + peso + "Kg" + 
        "\nAltura: " + altura + "cm" +
        "\nRaça: " + raca +
        "\nCor do pelo: " + pelo;
    }

}
