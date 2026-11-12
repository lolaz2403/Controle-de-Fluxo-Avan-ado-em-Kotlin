fun main() {
    for (numero in 1..50) {
        // Verifica se o último dígito é 7 através do resto da divisão por 10
        if (numero % 10 == 7) {
            continue // Pula os números terminados em 7
        }
        print("$numero ")
    }
    println()
}