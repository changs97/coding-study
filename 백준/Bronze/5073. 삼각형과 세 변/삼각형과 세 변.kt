fun main() {
    val br = System.`in`.bufferedReader()

    while (true) {
        val list = br.readLine().split(" ").map { it.toInt() }.toMutableList()

        if (list.count { it == 0 } == 3) return

        list.sort()

        if (list[2] >= (list[0] + list[1])) {
            println(Type.Invalid.name)
        } else if (list[0] == list[1] && list[0] == list[2]) {
            println(Type.Equilateral.name)
        } else if (list[0] == list[1] || list[0] == list[2] || list[1] == list[2]) {
            println(Type.Isosceles.name)
        } else {
            println(Type.Scalene.name)
        }
    }
}

enum class Type {
    Equilateral, Isosceles, Scalene, Invalid
}