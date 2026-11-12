fun main() {
    val palavra = "Universidade"
    val vogais = listOf('a', 'e', 'i', 'o', 'u')

    print("Consoantes encontradas: ")
    for (caractere in palavra) {
        // Converte para minúsculo para garantir que o 'U' inicial também seja filtrado
        if (caractere.lowercaseChar() in vogais) {
            continue // Pula a iteração atual se for vogal
        }
        print("$caractere ")
    }
    println()
}