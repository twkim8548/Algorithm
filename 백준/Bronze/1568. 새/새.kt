import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var sing = 1
    var cnt = 0
    while (n > 0) {
        if (sing > n) sing = 1
        n -= sing
        sing++
        cnt++
    }

    bw.write("$cnt")

    bw.flush()
    br.close()
}
