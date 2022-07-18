import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(3)
    val token = StringTokenizer(br.readLine())
    repeat(3) {
        array[it] = token.nextToken().toInt()
    }

    array.sort()

    if (array[1] - array[0] == array[2] - array[1]) {
        bw.write("${array[2] + array[1] - array[0]}")
    } else if (array[1] - array[0] == (array[2] - array[1]) / 2) {
        bw.write("${array[1] + array[1] - array[0]}")
    } else if (array[2] - array[1] == (array[1] - array[0]) / 2) {
        bw.write("${array[0] + array[2] - array[1]}")
    }

    bw.flush()
    bw.close()

    br.close()
}
