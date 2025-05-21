package fomas.formaspoli;

public class FomasPoli {
    public static void main(String[] args) throws Exception {
        
        Forma a = new Quadrado(2);
        Triagulo b = new Triagulo(4, 3, 3);

        imprimir(a);

        imprimir(b);

        System.out.println("Área bh: " + b.area(2, (float) Math.sqrt(5)));
    }

    private static void imprimir(Forma f) {

        System.out.println("Tipo de Figura: " + f.getClass());
        System.out.println("Área: " + f.area());
        System.out.println("Perímetro: " + f.perimetro());

    } 
}
