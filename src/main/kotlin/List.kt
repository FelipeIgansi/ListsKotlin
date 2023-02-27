fun main(args: Array<String>) {
     // list
    val list1 : List<Int> = listOf(1,2,3,4,5)
    val list2 : MutableList<Int> = mutableListOf(1,2,3,4,5)

    println("List 1 : $list1")
    println("List 2 : $list2")
    println("Tamanho lista 2: $list2.size")

//    list1.add(1)//não pode
    list2.add(9)
    println(list2)
    list2.remove(0)
}