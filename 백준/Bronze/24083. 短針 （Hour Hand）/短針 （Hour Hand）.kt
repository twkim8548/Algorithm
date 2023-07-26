import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var a = br.readLine().toInt()
    val b = br.readLine().toInt()

    repeat(b) {
        a++
        if (a == 13) {
            a = 1
        }
    }

    bw.write("$a")

    bw.flush()
    bw.close()
}
