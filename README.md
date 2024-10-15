# Testes Unitários para Classe `Triangulo`

Este projeto contém testes unitários para a classe `Triangulo` utilizando JUnit 5. A classe `TrianguloTest` verifica a validação dos diferentes tipos de triângulos e as condições matemáticas necessárias para que os lados formem um triângulo válido.

## Estrutura do Projeto

- **Pacote:** `estudodetestes.model`
- **Classe:** `TrianguloTest`
- **Biblioteca de Teste:** JUnit 5

## Funcionalidades Testadas

### Tipos de Triângulo:

1. **Triângulo Escaleno:** Todos os lados têm medidas diferentes.
   - Teste: `testTrianguloEscalenoValido`
2. **Triângulo Isósceles:** Dois lados têm medidas iguais.
   - Testes: `testTrianguloIsoscelesValido`, `testTrianguloIsoscelesPermutacao1`, `testTrianguloIsoscelesPermutacao2`
3. **Triângulo Equilátero:** Todos os lados têm medidas iguais.
   - Teste: `testTrianguloEquilateroValido`

### Validação de Lados:

1. **Lados maiores que zero:** 
   - Testes: `testTrianguloComValorZero`, `testTrianguloComValorNegativo`, `testTodosOsLadosZero`, `testLadoAZero`, `testLadoBNegativo`, `testLadoCZero`
   
2. **Soma de dois lados maior que o terceiro:**
   - Testes: `testSomaDeDoisLadosIgualAoTerceiro`, `testSomaDeDoisLadosMenorQueOTerceiro`, `testSomaLadoAComLadoCMenorQueLadoB`, `testSomaLadoBComLadoCMenorQueLadoA`

## Como Executar os Testes

1. **Via IDE:**
   - Importe o projeto em uma IDE com suporte ao JUnit 5 (Eclipse, IntelliJ, etc).
   - Execute a classe `TrianguloTest` como "JUnit Test".

2. **Via Maven:**
   - Certifique-se de que o Maven está configurado.
   - Rode o comando: `mvn test`.
   
## Dependências Maven

O projeto utiliza as seguintes dependências, especificadas no arquivo **pom.xml**:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

```

## Plugin de Cobertura de Código com JaCoCo

Para gerar relatórios de cobertura de código, o projeto utiliza o plugin JaCoCo. A configuração para gerar o relatório está no **pom.xml**:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.jacoco</groupId>
            <artifactId>jacoco-maven-plugin</artifactId>
            <version>0.8.8</version>
            <executions>
                <execution>
                    <id>prepare-agent</id>
                    <goals>
                        <goal>prepare-agent</goal>
                    </goals>
                </execution>
                <execution>
                    <id>report</id>
                    <phase>prepare-package</phase>
                    <goals>
                        <goal>report</goal>
                    </goals>
                </execution>
                <execution>
                    <id>post-unit-test</id>
                    <phase>test</phase>
                    <goals>
                        <goal>report</goal>
                    </goals>
                    <configuration>
                        <dataFile>target/jacoco.exec</dataFile>
                        <outputDirectory>target/my-reports</outputDirectory>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

```

## Como Gerar Relatório de Cobertura:

Após a execução dos testes com mvn test, o relatório de cobertura de código será gerado no diretório target/my-reports. Para visualizar o relatório:

1. Navegue até target/my-reports.
2. Abra o arquivo index.html no navegador.


### Teste de Triângulo Escaleno:
```java
@Test
public void testTrianguloEscalenoValido() {
    Triangulo triangulo = new Triangulo(3, 4, 5);
    assertEquals("Escaleno", triangulo.tipoDeTriangulo());
}
```

## Requisitos

- JDK 8 ou superior.
- JUnit 5.
- Maven 3.x ou superior.

## Contribuições

Contribuições para melhorar ou expandir os testes são bem-vindas. Por favor, envie um pull request ou abra uma issue para discutir mudanças.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE.md para mais informações.

```java
Este arquivo fornece uma visão geral dos testes unitários implementados para a classe `Triangulo`, descrevendo os diferentes tipos de triângulos que são validados, as condições de validação, e instruções sobre como executar os testes.
```
