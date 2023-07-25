import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine().toInt()
    var a = br.readLine().toInt()
    val b = br.readLine().toInt()
    var answer = 0
    answer += 250
    while (a < s) {
        a += b
        answer += 100
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
