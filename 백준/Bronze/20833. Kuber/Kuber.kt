import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var answer = 0.0
    for (i in 1 .. n) {
        answer += i.toDouble().pow(3.0)
    }

    bw.write("${answer.toInt()}")

    bw.flush()
    bw.close()
}