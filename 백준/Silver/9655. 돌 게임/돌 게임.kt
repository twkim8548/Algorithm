import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    if (br.readLine().toInt()%2 == 0) bw.write("CY")
    else bw.write("SK")

    bw.flush()
    bw.close()

    br.close()
}
