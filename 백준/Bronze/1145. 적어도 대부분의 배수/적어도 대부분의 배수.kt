import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val array = IntArray(5) {token.nextToken().toInt()}
    array.sort()

    val answer = mutableListOf<Int>()
    var cnt = array[0] * 2

    while (answer.size < 3) {
        answer.clear()
        for (i in 0 until 5) {
            if (cnt % array[i] == 0 ) answer.add(array[i])
        }
        cnt++
    }
    bw.write("${cnt - 1}")
    bw.flush()

    br.close()
}
