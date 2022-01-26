fun main() {
    var a = 5
    var b = 3
    
    var max = if (a > b) {
        println("getting value of variable a")
        // a -> can return int
        "a is greater than b" // can return string
    } else {
        println("getting vlaue of variable b")
        "b is greater than a"
    }
    
    if (a > b) {
        max = a
    } else {
        max = b
    }
    
    println(max)
    
    when (a % 2) {
        0 -> // even
            println("$a is even")
        1 -> // odd
            println("$a is odd")
    }
    
    fun hasPrefix(x: Any) = when (x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
    
    println(hasPrefix("prefix Hello world"))
}