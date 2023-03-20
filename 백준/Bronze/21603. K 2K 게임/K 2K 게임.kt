import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    val answer = mutableListOf<Int>()

    for (i in 1 .. n) {
        if (i.toString().last() != k.toString().last() && i.toString().last() != (k * 2).toString().last()) {
            answer.add(i)
        }
    }

    bw.write("${answer.size}\n")
    answer.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
}
