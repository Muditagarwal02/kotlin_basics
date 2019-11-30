package week1

fun display (x: Char = 'x', y: Int = 10) {

    repeat(y){
        println(x)
    }
}

fun main() {
    display()

    display(x='M')

    display(y=2)
}