
fun main() {
    val br = System.`in`.bufferedReader()
    
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    
    val setA = br.readLine().split(" ").map { it.toInt() }.toHashSet()
    val setB = br.readLine().split(" ").map { it.toInt() }.toHashSet()
     
    val setC = (setA - setB) + (setB - setA)
    
    println(setC.size)
}


