fun main() {
    // 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.

    while (true) {
        val n = readln().toInt()

        if (n == -1) return

        val list = mutableListOf<Int>()

        for (i in 1..n) {
            if (n % i == 0) list.add(i)
        }

        list.remove(n)

        if (n == list.sum()) {
            print("$n = ")
            print(list.joinToString(separator = " + "))
            println()
        } else {
            println("$n is NOT perfect.")
        }

    }




}