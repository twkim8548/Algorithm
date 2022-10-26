import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val m = br.readLine().toInt()

    var token = StringTokenizer(br.readLine())
    val targets = IntArray(m) { token.nextToken().toInt() }
    val scores = IntArray(n)

    repeat(m) {
        token = StringTokenizer(br.readLine())

        val array = IntArray(n) { token.nextToken().toInt() }
        array.forEachIndexed { index, i ->
            if (targets[it] == i) {
                scores[index] += 1
            } else {
                scores[targets[it] - 1] += 1
            }
        }


    }

    scores.forEach {
        bw.write("${it}\n")
    }

    bw.flush()
    bw.close()
}
