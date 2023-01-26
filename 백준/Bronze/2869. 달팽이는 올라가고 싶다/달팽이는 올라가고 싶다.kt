import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val v = token.nextToken().toInt()

    val tmp1 = v - a
    val tmp2 = a - b

    var answer = tmp1 / tmp2 + 1
    if (tmp1 % tmp2 != 0) {
        answer += 1
    }

    bw.write("$answer")
    bw.flush()
    br.close()
}
