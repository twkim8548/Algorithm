import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val array = ArrayList<Int>()
        var sum = 0
        repeat(7) {
            val n = token.nextToken().toInt()
            if (n % 2 == 0) {
                array.add(n)
                sum += n
            }
        }
        bw.write("$sum ${array.sorted()[0]}\n")

    }

    bw.flush()
    bw.close()
}