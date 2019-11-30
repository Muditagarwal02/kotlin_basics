package week1


fun  main(){
    val list1 = mutableListOf("element1")
    list1.add("element2")
    println(list1)


    val list2 = listOf("element1")
    //listOf() is final...non modifiable list
    //list2.add("element2")
    println(list2)

    println(listOf('a','b','c').joinToString(separator = "", prefix = "(", postfix = ")"))

    println(listOf('a','b','c').joinToString(prefix = "(", postfix = ")"))
}