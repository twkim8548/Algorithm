import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toDouble()
    val token = StringTokenizer(br.readLine())

    var agree = 0
    var disagree = 0
    var invalid = 0

    repeat(n.toInt()) {
        when (token.nextToken().toInt()) {
            -1 -> {
                disagree++
            }

            0 -> {
                invalid++
            }

            1 -> {
                agree++
            }
        }
    }

    if (invalid >= n/2) {
        bw.write("INVALID")
    } else if(agree > disagree) {
        bw.write("APPROVED")
    } else {
        bw.write("REJECTED")
    }

    bw.flush()
    bw.close()
}