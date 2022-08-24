import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val q = token.nextToken().toInt()

    val array = ArrayList<BigInteger>()
    token = StringTokenizer(br.readLine())

    repeat(n) {
        array.add(token.nextToken().toBigInteger())
    }

    repeat(q) {
        token = StringTokenizer(br.readLine())
        var answer = BigInteger.ZERO
        if (token.nextToken().toInt() == 1) {
            val a = token.nextToken().toInt()
            val b = token.nextToken().toInt()
            for (i in a - 1 until b) {
                answer += array[i]
            }
            bw.write("$answer\n")
            val temp = array[b-1]
            array[b-1] = array[a-1]
            array[a-1] = temp
        } else {
            val a = token.nextToken().toInt()
            val b = token.nextToken().toInt()
            val c = token.nextToken().toInt()
            val d = token.nextToken().toInt()

            for (i in a-1 until b) {
                answer += array[i]
            }

            for (i in c-1 until d) {
                answer -= array[i]
            }

            bw.write("$answer\n")
        }
    }
    bw.flush()
    bw.close()

    br.close()
}