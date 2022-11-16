import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val aArray = IntArray(10) {token.nextToken().toInt()}
    token = StringTokenizer(br.readLine())
    val bArray = IntArray(10) {token.nextToken().toInt()}
    var aWinCnt = 0
    var bWinCnt = 0

    repeat(10) {
        if(aArray[it] >bArray[it]) aWinCnt++
        else if (aArray[it] < bArray[it]) bWinCnt++
    }

    if (aWinCnt > bWinCnt) {
        bw.write("A")
    } else if (aWinCnt < bWinCnt) {
        bw.write("B")
    } else {
        bw.write("D")
    }

    bw.flush()
    bw.close()
}