fun main() {

    // Any e Count
    val data = geraDados()
//
//    println("Tem dados?  ${if(data.any()) "Sim" else "Não"}")
//    println("Tenho ${data.count()} elementos")

    // ----------------------------------------------------

    // First e Last
/*
    println("Primeira Receita:  ${data.first().nome}")
    println("Ultima Receita:  ${data.last().nome}")

    println( listOf<Int>().firstOrNull())// Se a lista for vazia tem que usar o first or null
    println( listOf<Int>().lastOrNull())// Se a lista for vazia tem que usar o last or null*/

    //----------------------------------------------------

/*
    // sum e sumOf

    println(listOf(1,2,3,4,5).sum())

    //Uso o sumOf para objetos basicamete
    // it é como se fosse o this é uma referencia ao objeto

    println(data.sumOf { it.calorias })


    println(data.filter { it.calorias > 500 })
    println("----------------------------------------------")
    println(data.any { it.calorias > 500 })
    println("----------------------------------------------")
    println(data.count { it.calorias > 500 })
*/

    // take e takelast
//    println(data.take(2))// Quero as duas primeiras receitas
//    println(data.takeLast(2))// Quero as duas Ultimas receitas

/*    // foreach
    data.forEach{ println(it.nome)}
    println("-----------------------------------------")
    data.filter { it.calorias >500 }.forEach{ println(it.nome) }
        data.filter { it.calorias >500 }.forEach{ println("Nome:  ${it.nome}, Caloria:  ${it.calorias}, Ingredientes:  ${it.ingredientes}") }


    */

/*    // Max e Min
    println(data.maxOf { it.calorias })
    println(data.minOf { it.calorias })

    // Para mostrar tbm o objeto deve usar o By

    println(data.minByOrNull { it.calorias })*/




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