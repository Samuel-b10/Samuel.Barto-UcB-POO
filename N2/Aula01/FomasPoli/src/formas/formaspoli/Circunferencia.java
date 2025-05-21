package formas.formaspoli;

public class Circunferencia extends Forma {

    float raio;

    public Circunferencia(float raio) {
        this.raio = raio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    public float area(float raio) {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * raio);
    }
}

