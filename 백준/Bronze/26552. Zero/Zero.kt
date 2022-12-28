import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toInt()
        while (true) {
            n++
            if (!n.toString().contains("0")) {
                bw.write("$n\n")
                break
            }
        }
    }

    bw.flush()
    bw.close()
}
