import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var k = br.readLine().toInt()
    val n = br.readLine().toInt()

    repeat(n) {
        if (it == n - 1) {
            bw.write("$k")
        } else {
            bw.write("${it + 1}\n")
            k -= it + 1
        }
    }

    bw.flush()
    bw.close()
}