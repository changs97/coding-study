fun main() = with(System.`in`.bufferedReader()) {
    var n = readln().toInt()
    var count = 0

    while (true) {
        if (n - 5 >= 0 && (n % 5 == 3 || n % 5 == 0)) {
            n -= 5
            count++
            continue
        } else if (n - 3 >= 0) {
            n -= 3
            count++
            continue
        } else if (n == 0) {
            print(count)
            return
        } else {
            print(-1)
            return
        }

    }
}