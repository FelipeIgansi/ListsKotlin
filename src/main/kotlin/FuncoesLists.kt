fun main() {

    // Any e Count
    val data = geraDados()

    println("Tem dados?  ${if(data.any()) "Sim" else "Não"}")
    println("Tenho ${data.count()} elementos")

    // ----------------------------------------------------

}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 5),
                Ingrediente("Molho de tomate", 1),
                Ingrediente("Manjericao", 10)
            )
        ),
        Receita("Panqueca", 5000),
        Receita("Omelete", 2000),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijões", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 1),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1),
            ),
        ),
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf()) {
}

data class Ingrediente(val nome: String, val quantidade: Int)