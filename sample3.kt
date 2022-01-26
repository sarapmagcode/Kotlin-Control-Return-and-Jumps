fun main() {
    // break and continue labels:
    loop@ for (i in 1..5) {
        println(i)
        for (j in 20..25) {
            println(j)
            if (j == 23) continue@loop
            println("asdsawqe")
        }
    }
    
    // return at labels:
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return
            print(it)
        }
        println("This point is unreachable")
    }
    
    foo()
    
}