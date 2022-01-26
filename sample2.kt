fun main() {
    var arr = arrayOf(2, 4, 6, 8)
    for (a in arr) {
        print("$a ")
    }
    println()
    
    for (a in arr.indices) {
        print("$a ")
    }
    println()
    
    for (a in arr.indices) {
        arr[a] += 1
        print(arr[a])
        print(" ")
    }
    println()
    
    for ((idx, value) in arr.withIndex()) {
        println("$idx -> $value")
    }
    
    var x = 1
    while (x < 5) {
        println(x)
        x++
    }
}