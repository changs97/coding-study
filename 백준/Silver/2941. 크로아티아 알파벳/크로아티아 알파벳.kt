fun main() {
    val list = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var str = readln()

    for (i in list) {
        str = str.replace(i, ".")
    }

    println(str.length)
}