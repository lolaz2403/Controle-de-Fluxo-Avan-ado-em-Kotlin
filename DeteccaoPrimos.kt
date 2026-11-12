fun main() {
    val alvo = 29
    var ehPrimo = true

    // Números menores ou iguais a 1 não são primos por definição
    if (alvo <= 1) {
        ehPrimo = false
    } else {
        // Testa divisores de 2 até (alvo - 1)
        for (divisor in 2 until alvo) {
            if (alvo % divisor == 0) {
                ehPrimo = false
                break // Interrompe no primeiro divisor encontrado para economizar processamento
            }
        }
    }

    if (ehPrimo) {
        println("O número $alvo é primo.")
    } else {
        println("O número $alvo NÃO é primo.")
    }
}