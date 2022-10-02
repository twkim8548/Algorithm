import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val my = br.readLine()
    var cnt = 0
    repeat(br.readLine().toInt()) {
        if (my == br.readLine()) cnt++
    }
    bw.write("$cnt")

    bw.flush()
    br.close()
}
