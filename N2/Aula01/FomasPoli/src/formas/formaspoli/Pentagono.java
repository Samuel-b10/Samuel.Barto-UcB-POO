package formas.formaspoli;

public class Pentagono extends Forma {

    float lado, apotema;

    public Pentagono(float lado, float apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public float area() {
        return (perimetro() * apotema) / 2;
    }

    public float area(float lado, float apotema) {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public float perimetro() {
        return 5 * lado;
    }
}

