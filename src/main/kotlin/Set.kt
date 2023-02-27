fun main() {
    // Set é uma lista não ordenada que não guarda ids e não aceita valores repetidos
    val set1: Set<String> = setOf("Paris", "Berlin", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("São Paulo")
    println(set2)
    set2.remove("Sao Paulo")
    println(set2)
    set2.contains("São Paulo")
    set2.size
    set2.clear()
}