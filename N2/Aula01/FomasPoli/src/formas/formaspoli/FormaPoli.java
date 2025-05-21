package formas.formaspoli;

public class FormaPoli {
    public static void main(String[] args) throws Exception {

        // Retângulo
        Forma ret = new Retangulo(5, 3);
        imprimir(ret);

        // Triângulo
        Forma tri = new Triangulo(4, 3, 3);
        imprimir(tri);
        System.out.println("Área (base x altura / 2): " + ((Triangulo) tri).area(2, (float) Math.sqrt(5)));

        // Pentágono
        Forma pent = new Pentagono(6, 4);
        imprimir(pent);
        System.out.println("Área (lado x apótema): " + ((Pentagono) pent).area(6, 4));

        // Circunferência
        Forma circ = new Circunferencia(7);
        imprimir(circ);
        System.out.println("Área (raio): " + ((Circunferencia) circ).area(7));
    }

    private static void imprimir(Forma f) {
        System.out.println("\nTipo de Figura: " + f.getClass().getSimpleName());
        System.out.println("Área: " + f.area());
        System.out.println("Perímetro: " + f.perimetro());
    }
}

