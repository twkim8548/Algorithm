import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().replace(" ", "").toInt()

    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            bw.write("DeadMan\n")
        } else if (i % 3 == 0) {
            bw.write("Dead\n")
        } else if (i % 5 == 0) {
            bw.write("Man\n")
        } else {
            bw.write("$i ")
        }
    }

    bw.flush()
    br.close()
}
