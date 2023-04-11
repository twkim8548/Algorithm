import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    repeat(br.readLine().toInt()) {
        if (br.readLine().split("-")[1].toInt() <= 90) {
            answer++
        }
    }
    bw.write("$answer")
    bw.flush()
    bw.close()
}