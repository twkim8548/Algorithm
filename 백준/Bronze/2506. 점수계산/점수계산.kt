import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var score = 1
    var answer = 0

    val token = StringTokenizer(br.readLine())
    repeat(n) {
        if (token.nextToken().toInt() == 1) {
            answer += score
            score++
        } else {
            score = 1
        }
    }

    bw.write("$answer")

    bw.flush()
    br.close()
}
