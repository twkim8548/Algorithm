import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val array = IntArray(m) { token.nextToken().toInt() }

    var answer = 0

    for (i in 1..n) {
        for (j in array.indices)
            if (i % array[j] == 0) {
                answer += i
                break
            }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
