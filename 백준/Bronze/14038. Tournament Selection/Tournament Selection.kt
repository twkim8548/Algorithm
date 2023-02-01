import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var winCnt = 0
    var loseCnt = 0
    repeat(6) {
        if (br.readLine() == "W") {
            winCnt++
        } else {
            loseCnt++
        }
    }

    if (winCnt > 4) {
        bw.write("1")
    } else if (winCnt > 2) {
        bw.write("2")
    } else if(winCnt > 0) {
        bw.write("3")
    } else {
        bw.write("-1")
    }

    bw.flush()
    br.close()
}
