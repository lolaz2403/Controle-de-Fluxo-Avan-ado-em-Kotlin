fun main() {
    var total = 0

    for (numero in 1..100) {
        if (numero % 10 == 0) {
            continue // Ignora múltiplos de 10 sem somá-los
        }

        total += numero

        // Interrompe imediatamente se o limite de 500 for ultrapassado
        if (total > 500) {
            println("Limite de 500 ultrapassado no número $numero.")
            break
        }
    }

    println("Valor final acumulado: $total")
}