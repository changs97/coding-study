
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val pokedex = hashMapOf<Int, String>()

    for (i in 1..n) {
        pokedex[i] = br.readLine()
    }

    val reversePokeDex = pokedex.reverse()

    repeat(m) {
        val query = br.readLine()

        query.toIntOrNull()?.let {
            bw.write(pokedex[it]!!)
        } ?: bw.write(reversePokeDex[query].toString())

        bw.newLine()
    }

    bw.flush()
    bw.close()
}

fun <K, V> Map<K, V>.reverse(): Map<V, K> {
    return this.entries.associate { it.value to it.key }
}