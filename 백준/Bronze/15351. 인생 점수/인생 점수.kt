import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var answer = 0

        br.readLine().replace(" ", "").forEach {
            answer += it.toInt() - 64
        }

        if (answer == 100) bw.write("PERFECT LIFE\n")
        else bw.write("$answer\n")
    }
    bw.flush()
    bw.close()

    br.close()
}
