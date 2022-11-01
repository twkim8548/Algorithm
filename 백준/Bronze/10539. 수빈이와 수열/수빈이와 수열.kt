import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val token = StringTokenizer(br.readLine())

    val array = IntArray(n) {token.nextToken().toInt()}
    val answer = IntArray(n)

    repeat(n) {
        var sum = 0

        for (i in 0 until n) {
            sum += answer[i]
        }

        answer[it] = (array[it] * (it+1)) - sum
    }
    answer.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
}
