import java.lang.Long.max
import java.lang.Long.min

/*
* 최대공약수(GCD, Greatest Common Divisor) 란,
* 두 개 혹은 그 이상의 수 간의 공통의 약수들 중 최대, 가장 큰 값을 의미한다.
* */

/*
* 유클리드 호제법:
* 2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b),
* a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 이 성질에 따라,
* b를 r로 나눈 나머지 r'를 구하고,
* 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여
* 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.
*
*
* 최대공약수는 유클리드 호제법을 사용하면 간단하게 구할 수 있으며,
* 구한 최대공약수를 이용하여 최소공배수 또한 구할 수 있다.
*
* 최소 공배수는 두 수의 곱을 최대 공약수로 나누는 것으로 구할 수 있다.
*
* 유클리드 알고리즘:
* fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
* */

fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }

    val maximum = max(a, b)
    val minimum = min(a, b)

    val lcm = a * b / gcd(maximum, minimum)
    println(lcm)

}

/**
 * @param a: b보다 큰 자연수
 * @param b: b보다 작은 자연수
 * */
private fun gcd(a: Long, b: Long): Long = if (b != 0L) gcd(b, a % b) else a