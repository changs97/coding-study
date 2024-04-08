import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val stars = Array(n) { CharArray(n) }

    setStars(stars, 0, 0, n) // NxN 패턴 별을 그린다

    val answer = StringBuilder()
    stars.forEach { charArray ->
        charArray.forEach {
            answer.append(it)
        }

        answer.appendLine()
    }

    print(answer)
}

// 왼쪽 위의 점인 stars[row][col]에서부터 size * size만큼 별 저장 
fun setStars(stars: Array<CharArray>, row: Int, col: Int, size: Int) {

    // 크기가 3일 때까지 나누어 들어가다가, 3이 되면 해당 영역에 3x3 패턴을 저장하고 종료한다.
    if (size == 3) {
        set3Pattern(stars, row, col, size)
        return
    }

    val dividedSize = size / 3

    // 0행
    setStars(stars, row, col, dividedSize)
    setStars(stars, row, col + dividedSize, dividedSize)
    setStars(stars, row, col + 2*dividedSize, dividedSize)
    
    // 1행
    setStars(stars, row + dividedSize, col, dividedSize)
    setSpace(stars, row + dividedSize, col + dividedSize, dividedSize) // 공백
    setStars(stars, row + dividedSize, col + 2*dividedSize, dividedSize)

    // 2행
    setStars(stars, row + 2*dividedSize, col, dividedSize)
    setStars(stars, row + 2*dividedSize, col + dividedSize, dividedSize)
    setStars(stars, row + 2*dividedSize, col + 2*dividedSize, dividedSize)
}

// 3 * 3 패턴 별 저장
fun set3Pattern(stars: Array<CharArray>, startRow: Int, startCol: Int, size: Int) {
    for (row in startRow until startRow + size){
        for (col in startCol until startCol + size){
            stars[row][col] = '*'
        }
    }

    stars[startRow + 1][startCol + 1] = ' '
}

// 공백 저장
fun setSpace(stars: Array<CharArray>, startRow: Int, startCol: Int, size: Int) {
    for (row in startRow until startRow + size){
        for (col in startCol until startCol + size){
            stars[row][col] = ' '
        }
    }
}