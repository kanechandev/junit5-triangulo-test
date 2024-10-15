package estudodetestes.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    public void testTrianguloEscalenoValido() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        assertEquals("Escaleno", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTrianguloIsoscelesValido() {
        Triangulo triangulo = new Triangulo(5, 5, 8);
        assertEquals("Isósceles", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTrianguloEquilateroValido() {
        Triangulo triangulo = new Triangulo(6, 6, 6);
        assertEquals("Equilátero", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTrianguloIsoscelesPermutacao1() {
        Triangulo triangulo = new Triangulo(8, 5, 5);
        assertEquals("Isósceles", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTrianguloIsoscelesPermutacao2() {
        Triangulo triangulo = new Triangulo(5, 8, 5);
        assertEquals("Isósceles", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTrianguloComValorZero() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(0, 5, 7));
        assertEquals("Os lados devem ser maiores que zero.", thrown.getMessage());
    }

    @Test
    public void testTrianguloComValorNegativo() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(-3, 5, 7));
        assertEquals("Os lados devem ser maiores que zero.", thrown.getMessage());
    }

    @Test
    public void testSomaDeDoisLadosIgualAoTerceiro() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(4, 4, 8));
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", thrown.getMessage());
    }

    @Test
    public void testSomaDeDoisLadosMenorQueOTerceiro() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(3, 4, 10));
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", thrown.getMessage());
    }

    @Test
    public void testTodosOsLadosZero() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(0, 0, 0));
        assertEquals("Os lados devem ser maiores que zero.", thrown.getMessage());
    }
    
    @Test
    public void testLadoAZero() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(0, 4, 5));
        assertEquals("Os lados devem ser maiores que zero.", thrown.getMessage());
    }

    @Test
    public void testLadoBNegativo() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(3, -4, 5));
        assertEquals("Os lados devem ser maiores que zero.", thrown.getMessage());
    }

    @Test
    public void testLadoCZero() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(3, 4, 0));
        assertEquals("Os lados devem ser maiores que zero.", thrown.getMessage());
    }
    
    @Test
    public void testSomaLadoAComLadoCMenorQueLadoB() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(3, 10, 6));
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", thrown.getMessage());
    }

    @Test
    public void testSomaLadoBComLadoCMenorQueLadoA() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class, () -> new Triangulo(10, 4, 3));
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", thrown.getMessage());
    }


}
