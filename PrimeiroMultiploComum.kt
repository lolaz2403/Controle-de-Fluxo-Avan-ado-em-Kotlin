fun main() {
    var numero = 1

    while (true) {
        // Verifica divisibilidade simultânea por 7 e 13 (resto zero para ambos)
        if (numero % 7 == 0 && numero % 13 == 0) {
            println("Primeiro número divisível por 7 e 13: $numero")
            break // Encerra o laço infinito assim que encontrar
        }
        numero++ // Incrementa para testar o próximo número
    }
}