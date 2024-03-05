
fun main() {
    val str = readln()

    var zipSize = 1
    val set = hashSetOf<String>()

    while (zipSize <= str.length) {
        var zipStartIndex = 0

        while (zipStartIndex + zipSize  <= str.length) {
            set.add(str.substring(zipStartIndex, zipStartIndex+zipSize))

            zipStartIndex++
        }

        zipSize++
    }

    println(set.size)

}


