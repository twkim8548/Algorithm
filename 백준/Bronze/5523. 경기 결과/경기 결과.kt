import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var aCnt = 0
    var bCnt = 0

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        if (a < b) {
            bCnt++
        }else if (a > b) {
            aCnt++
        }
    }

    bw.write("$aCnt $bCnt")

    bw.flush()
    br.close()
}
