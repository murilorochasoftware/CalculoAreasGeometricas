public class CalculoAreasGeometricas {

    public static void main(String[] args) {
        float resultado = 0f;

        // Cálculo da área do quadrado
        float tamanhoLadoQuadrado = 20.0f;
        resultado = tamanhoLadoQuadrado * tamanhoLadoQuadrado;
        System.out.printf("A área do quadrado é: %.2f", resultado);

        // Cálculo da área do retângulo
        float tamanhoBaseRetangulo = 10f;
        float tamanhoAlturaRetangulo = 5f;
        resultado = tamanhoBaseRetangulo * tamanhoAlturaRetangulo;
        System.out.printf("\n\nA área do retângulo é: %.2f", resultado);

        // Cálculo da área do círculo
        float pi = 3.14f;
        float raioCirculo = 10f;
        resultado = pi * (raioCirculo * raioCirculo);
        System.out.printf("\n\nA área do círculo é: %.2f", resultado);

        // Cálculo da área do triângulo
        float tamanhoBaseTriangulo = 5.51f;
        float tamanhoAlturaTriangulo = 11.22f;
        resultado = (tamanhoBaseTriangulo * tamanhoAlturaTriangulo) / 2;
        System.out.printf("\n\nA área do triângulo é: %.2f", resultado);
    }
}
