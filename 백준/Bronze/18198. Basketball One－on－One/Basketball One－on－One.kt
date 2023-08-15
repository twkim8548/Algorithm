import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()
    var aCnt = 0
    var bCnt = 0

    var choiceTeam: Char = 'A'
    var isTie = false

    str.forEachIndexed Break@{ index, c ->
        if (index % 2 == 0) {
            choiceTeam = c
        } else {
            if (choiceTeam == 'A') {
                aCnt += c.toString().toInt()
            } else {
                bCnt += c.toString().toInt()
            }
        }
        if (!isTie) {
            if (aCnt == 10 && bCnt == 10) {
                isTie = true
            } else if (aCnt >= 11) {
                bw.write("A")
                return@Break
            } else if (bCnt >= 11) {
                bw.write("B")
                return@Break
            }
        } else {
            if (aCnt >= bCnt + 2) {
                bw.write("A")
                return@Break
            } else if (bCnt >= aCnt + 2) {
                bw.write("B")
                return@Break
            }
        }
    }

    bw.flush()
    br.close()
}
