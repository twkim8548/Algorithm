import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate.now
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine()

    if (x.startsWith("0x")) {
        bw.write("${x.substring(2).toInt(16)}")
    } else if (x.startsWith("0")) {
        bw.write("${x.substring(1).toInt(8)}")
    } else bw.write("$x")

    bw.flush()
    bw.close()
    br.close()
}