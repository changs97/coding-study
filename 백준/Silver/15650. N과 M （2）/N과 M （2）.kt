import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

lateinit var visit : BooleanArray
lateinit var bw : BufferedWriter
var N = 0
var M = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())

    N = st.nextToken().toInt()
    M = st.nextToken().toInt()

    visit = BooleanArray(N+1)
    for(i in 1 .. N){
        dfs(i.toString(),i,1)
    }

    bw.flush()
    bw.close()
}

fun dfs(num: String,next: Int,count: Int){

    if(count == M){
        bw.appendLine(num)
        return
    }

    for(i in next+1 .. N){
        if(visit[i])continue
        visit[i] = true
        dfs("$num $i",i,count+1)
        visit[i] = false
    }

}