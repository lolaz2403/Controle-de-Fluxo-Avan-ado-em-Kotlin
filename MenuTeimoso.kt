fun main() {
    // Simulação de entradas sequenciais do usuário para execução automática
    val entradasSimuladas = listOf(1, 3, 2, 9, 0)
    var indice = 0

    while (true) {
        val opcao = entradasSimuladas[indice]
        indice++

        println("Opção selecionada: $opcao")

        when (opcao) {
            1, 2 -> println("Processando...")
            3 -> {
                println("Módulo em manutenção")
                continue // Volta imediatamente para o início do laço
            }
            0 -> {
                println("Encerrando o menu...")
                break // Sai do laço infinito
            }
            else -> println("Opção inválida.")
        }
    }
}