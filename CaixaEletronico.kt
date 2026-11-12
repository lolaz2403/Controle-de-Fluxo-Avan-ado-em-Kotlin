fun main() {
    var saldo = 1000.00
    val valorSaque = 150.00

    while (true) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
            println("Saque de R$ %.2f realizado. Saldo restante: R$ %.2f".format(valorSaque, saldo))
        } else {
            println("Saldo Insuficiente (Saldo atual: R$ %.2f)".format(saldo))
            break // Encerra o caixa eletrônico
        }
    }
}