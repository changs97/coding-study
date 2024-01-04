fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val numList = br.readLine().split(" ").map { it.toInt() }
    
    val sum = numList.sum().toString()
    
    bw.write(sum)
    bw.close()
}