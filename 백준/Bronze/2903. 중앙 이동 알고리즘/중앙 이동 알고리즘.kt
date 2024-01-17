fun main() {
    var bottomPoint = 2
    var point = 4

    repeat(readln().toInt()) {
        bottomPoint += bottomPoint-1
        point = bottomPoint * bottomPoint
    }

    println(point)
}