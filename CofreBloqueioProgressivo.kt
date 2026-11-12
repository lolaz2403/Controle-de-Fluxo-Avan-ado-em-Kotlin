fun main() {
    val senhaCorreta = "KOTLIN2026"
    // Simulação de 5 tentativas (como as 3 primeiras estão erradas, o cofre bloqueará antes da 4ª)
    val tentativasSimuladas = listOf("1234", "admin", "senha123", "KOTLIN2026", "0000")
    var errosConsecutivos = 0

    for (tentativa in 1..5) {
        val senhaDigitada = tentativasSimuladas[tentativa - 1]
        println("Tentativa $tentativa de 5 - Senha testada: '$senhaDigitada'")

        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido! Cofre aberto.")
            break
        } else {
            errosConsecutivos++
            println("Senha incorreta!")

            // Bloqueia na terceira falha consecutiva, impedindo as tentativas 4 e 5
            if (errosConsecutivos == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }
}