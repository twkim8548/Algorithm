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
    
    var answer = 0
    repeat(br.readLine().toInt()) {
        answer += br.readLine().toInt()
    }
    
    bw.write("$answer")

    bw.flush()
    bw.close()
}