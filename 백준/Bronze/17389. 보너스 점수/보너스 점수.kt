import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val s = br.readLine()
    var bonus = 0
    var answer = 0
    s.forEachIndexed { index, c ->
        if (c == 'X') {
            bonus = 0
        } else {
            answer += index + 1
            answer += bonus
            bonus++
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
