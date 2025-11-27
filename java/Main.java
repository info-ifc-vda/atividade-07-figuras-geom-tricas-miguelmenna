public class Main {
    public static void main(String[] args) {

        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica quadrado = new Quadrado(4);
        FiguraGeometrica triangulo = new Triangulo(3, 4, 3, 4, 5);

        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nQuadrado:");
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());

        System.out.println("\nTriângulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}
