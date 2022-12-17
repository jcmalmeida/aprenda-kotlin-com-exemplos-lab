enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    AVANCADO
}

data class Usuario(var nome: String, var email: String) {
    var pontuacao: Int = 0

    fun ganharPontuacaoFormacao(nomeFormacao: String, valor: Int) {
        println("$nome concluiu a formação \"$nomeFormacao\" e recebeu $valor pontos!")
        pontuacao += valor
    }
}

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int)

data class Formacao(val nome: String, val pontuacao: Int) {

    val conteudos = mutableListOf<ConteudoEducacional>()
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun adicionarConteudo(conteudoEducacional: ConteudoEducacional) {
        conteudos.add(conteudoEducacional)
    }

    override fun toString(): String {
        var string = "\n"
        string += "Conteúdos cadastrados na formação \"$nome\":\n"
        conteudos.forEach {
            string += "Nome: ${it.nome}, Nível: ${it.nivel}, Duração: ${it.duracao} horas\n"
        }

        string += "\nUsuários cadastrados na formação \"$nome\":\n"
        inscritos.forEach {
            string += "Nome: ${it.nome}, E-mail: ${it.email}, Pontuação: ${it.pontuacao} pontos\n"
        }

        return string
    }
}

fun main() {

    // Cadastrando formação inicial
    val formacaoEducacionalInicial = Formacao("Princípios de Desenvolvimento de Software", pontuacao = 800)
    var conteudoEducacional = ConteudoEducacional(nome = "Introdução ao Desenvolvimento Moderno de Software", nivel = Nivel.BASICO, duracao = 2)
    formacaoEducacionalInicial.adicionarConteudo(conteudoEducacional)
    conteudoEducacional = ConteudoEducacional(nome = "Pensamento Computacional", nivel = Nivel.BASICO, duracao = 5)
    formacaoEducacionalInicial.adicionarConteudo(conteudoEducacional)
    conteudoEducacional = ConteudoEducacional(nome = "Entregando seu primeiro projeto", nivel = Nivel.BASICO, duracao = 1)
    formacaoEducacionalInicial.adicionarConteudo(conteudoEducacional)

    // Matriculando usuários na formação inicial
    var joao = Usuario(nome = "João", email = "joao@email.com")
    formacaoEducacionalInicial.matricular(joao)
    var maria = Usuario(nome = "Maria", email = "maria@email.com")
    formacaoEducacionalInicial.matricular(maria)
    var filomena = Usuario(nome = "Filomena", email = "filomena@email.com")
    formacaoEducacionalInicial.matricular(filomena)

    // João e Maria concluíram a formação
    with(formacaoEducacionalInicial) {
        joao.ganharPontuacaoFormacao(nome, pontuacao)
        maria.ganharPontuacaoFormacao(nome, pontuacao)
    }

    println(formacaoEducacionalInicial.toString())

    // Cadastrando formação Kotlin
    val formacaoEducacionalKotlin = Formacao(nome = "Dominando Kotlin", pontuacao = 1300)
    conteudoEducacional = ConteudoEducacional(nome = "Lógica de programação em Kotlin", nivel = Nivel.INTERMEDIARIO, duracao = 6)
    formacaoEducacionalKotlin.adicionarConteudo(conteudoEducacional)
    conteudoEducacional = ConteudoEducacional(nome = "POO em Kotlin", nivel = Nivel.INTERMEDIARIO, duracao = 3)
    formacaoEducacionalKotlin.adicionarConteudo(conteudoEducacional)
    conteudoEducacional = ConteudoEducacional(nome = "Desafios em Kotlin", nivel = Nivel.INTERMEDIARIO, duracao = 4)
    formacaoEducacionalKotlin.adicionarConteudo(conteudoEducacional)

    // Matriculando usuários na formação Kotlin
    formacaoEducacionalKotlin.matricular(joao)
    formacaoEducacionalKotlin.matricular(maria)
    formacaoEducacionalKotlin.matricular(filomena)

    // Maria e Filomena concluíram a formação
    with(formacaoEducacionalKotlin) {
        maria.ganharPontuacaoFormacao(nome, pontuacao)
        filomena.ganharPontuacaoFormacao(nome, pontuacao)
    }

    println(formacaoEducacionalKotlin.toString())

}