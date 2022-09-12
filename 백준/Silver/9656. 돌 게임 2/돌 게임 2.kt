import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    if (n % 2 == 0) {
        bw.write("SK")
    } else {
        bw.write("CY")
    }

    bw.flush()
    bw.close()

    br.close()
}
