package formas.formaspoli;

public class Retangulo extends Forma {

    float largura, altura;

    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public float area() {
        return largura * altura;
    }

    // Sobrecarga do método area com parâmetros
    public float area(float largura, float altura) {
        return largura * altura;
    }

    @Override
    public float perimetro() {
        return 2 * (largura + altura);
    }
}

