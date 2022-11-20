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

    val array = mutableListOf<Int>()
    repeat(n) {
        array.add(it + 1)
    }

    repeat(m) {
        token = StringTokenizer(br.readLine())

        val i = token.nextToken().toInt()
        val j = token.nextToken().toInt()
        val k = token.nextToken().toInt()
        repeat(k-i) {
            array.add(k + (j-k), array[i-1])
            array.removeAt(i-1)
        }
    }

    array.forEach {
        bw.write("$it ")
    }
    bw.flush()
    bw.close()
}