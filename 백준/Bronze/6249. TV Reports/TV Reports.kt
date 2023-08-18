import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    var p = token.nextToken().toInt()
    var h = token.nextToken().toInt()

    repeat(n) {
        val money = br.readLine().toInt()
        if (money > h) {
            bw.write("BBTV: Dollar reached $money Oshloobs, A record!\n")
            h = money
        } else if (money < p) {
            bw.write("NTV: Dollar dropped by ${p - money} Oshloobs\n")
        }
        p = money
    }

    bw.flush()
    bw.close()
}