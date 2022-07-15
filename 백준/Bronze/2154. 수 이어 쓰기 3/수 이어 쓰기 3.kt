import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()

    val sb = StringBuilder()

    for (i in 1 .. n.toInt()) sb.append(i)

    bw.write("${sb.indexOf(n.toString()) + 1}")

    bw.flush()
    bw.close()

    br.close()
}