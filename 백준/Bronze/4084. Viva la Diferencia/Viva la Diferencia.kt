import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())
        var a = token.nextToken().toInt()
        var b = token.nextToken().toInt()
        var c = token.nextToken().toInt()
        var d = token.nextToken().toInt()

        if (a == 0 && b ==0 && c ==0 && d == 0) {
            break
        }
        var answer = 0
        while(true) {
            if (a == b && b == c && c == d) {
                break
            }
            answer ++
            val tmp = a
            a = abs(a-b)
            b = abs(b-c)
            c = abs(c-d)
            d = abs(d-tmp)
        }
        bw.write("$answer\n")

    }
    bw.flush()
    bw.close()
}