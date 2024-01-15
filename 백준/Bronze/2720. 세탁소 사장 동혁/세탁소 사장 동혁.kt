fun main() {
    repeat(readln().toInt()) {
        var cent = readln().toInt()
        
        val list = listOf(25, 10, 5, 1)

        for (i in list) {
            var count = 0
            while (cent - i >= 0) {
                cent -= i
                count++
            }

            print("$count ")
        }

        println()


    }
}