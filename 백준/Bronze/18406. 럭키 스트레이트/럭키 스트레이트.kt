import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val left = n.substring(0, n.length/2)
    val right = n.substring(n.length/2)

    var leftCnt= 0
    var rightCnt = 0
    repeat(left.length) {
        leftCnt += left[it].toString().toInt()
        rightCnt += right[it].toString().toInt()
    }

    if (leftCnt == rightCnt) {
        bw.write("LUCKY")
    } else {
        bw.write("READY")
    }
    bw.flush()
    br.close()
}