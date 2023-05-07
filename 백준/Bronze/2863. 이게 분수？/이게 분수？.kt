import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = arrayOf(DoubleArray(2), DoubleArray(2))

    var token = StringTokenizer(br.readLine())
    array[0][0] = token.nextToken().toDouble()
    array[0][1] = token.nextToken().toDouble()
    token = StringTokenizer(br.readLine())
    array[1][0] = token.nextToken().toDouble()
    array[1][1] = token.nextToken().toDouble()

    val answer = mutableMapOf<Int, Double>()

    repeat(4) {
        val a = array[0][0]
        val b = array[0][1]
        val c = array[1][0]
        val d = array[1][1]
        answer[it] = (a / c) + (b / d)

        val tmp = array[0][0]
        val tmp2 = array[0][1]
        array[0][0] = array[1][0]
        array[0][1] = tmp
        array[1][0] = array[1][1]
        array[1][1] = tmp2
    }


    bw.write("${answer.toList().maxByOrNull { it.second }!!.first}")

    bw.flush()
    bw.close()
}