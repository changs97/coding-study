import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine())
    val num = st.nextToken().toLong()
    val k = st.nextToken().toLong()
    val mod = 1000000007L

    fun pow(base: Long, expo: Long): Long { // 지수 구하는 함수, base: 밑, expo: 지수
        if (expo == 1L) {
            return base % mod
        }

        val tmp = pow(base, expo / 2) // 구하려던 지수의 절반이 되는 값

        /*
        홀수인 경우 구했던 값의 제곱에 base를 한번 더 곱한 값을 반환 한다.
        짝수인 경우 구했던 값의 제곱을 반환 한다.
         */
        return if (expo % 2 == 1L) {
            tmp * tmp % mod * base % mod
        } else {
            tmp * tmp % mod
        }
    }

    fun factorial(n: Long): Long {
        return if (n <= 1L) 1L
        else (n * factorial(n - 1)) % mod
    }

    val top = factorial(num) // 분자
    val bottom = (factorial(k) * factorial(num - k)) % mod // 분모

    bw.write("${top * pow(bottom, mod - 2) % mod}") // 분자 * 분모의 역원
    bw.flush()
    bw.close()
    br.close()
}