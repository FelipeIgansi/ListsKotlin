fun main() {
    // Map é uma lista de chave-valor
    val map1 = mapOf<String, String>(
        Pair("França", "Paris"),
        Pair("Alemanha", "Berlin"),
        Pair("Brasil", "Brasilia")
    )
    val map2 = mutableMapOf<String, String>(
        Pair("França", "Paris"),
        Pair("Alemanha", "Berlin"),
        Pair("Brasil", "Brasilia"))

    println(map1)
    println(map1.entries)// ids
    println(map1.values)// valores

    map2["Portugal"] = "Lisboa"
    println(map2)
    map2.remove("Brasil")
    map2.contains("Brasil")
}