import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())

    val ca = token.nextToken().toInt()
    val ba = token.nextToken().toInt()
    val pa = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())

    val c = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val p = token.nextToken().toInt()

    var answer = 0

    if (c - ca > 0) {
        answer += c - ca
    }
    if (b - ba > 0) {
        answer += b - ba
    }
    if (p - pa > 0) {
        answer += p - pa
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}