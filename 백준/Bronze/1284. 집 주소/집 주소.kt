import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine()
        if (n == "0") break
        var answer = 1
        n.forEach {
            answer += when (it) {
                '1' -> 2
                '0' -> 4
                else -> 3
            }
            answer += 1
        }
        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
