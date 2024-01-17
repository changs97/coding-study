fun main() {
    val n = readln().toInt()

    if (n == 1) {
        println("1/1")
        return
    }

    var i = 2
    var pre = 1
    var direction = true

    var cal = pre+i

    while (n > cal) {
        direction = !direction
        i++
        pre = cal
        cal = pre+i
    }

    var molecule = 1
    var denominator = 1

    if (direction) {
        molecule += i-1
    } else {
        denominator += i-1
    }

    while (cal != n) {
        cal--

        if (direction) {
            molecule--
            denominator++
        } else {
            molecule++
            denominator--
        }
    }

    println("$molecule/$denominator")
}