import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var answer = 0
    for (i in 1 .. n) {
        answer++
        if (i.toString().contains("50")) {
            answer++
            if (i == n && n.toString().contains("50")) {
                answer--
            }
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}
