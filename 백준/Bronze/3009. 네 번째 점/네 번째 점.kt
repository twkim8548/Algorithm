import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array1 = mutableListOf<Int>()
    val array2 = mutableListOf<Int>()
    repeat(3) {
        val token = StringTokenizer(br.readLine())
        array1.add(token.nextToken().toInt())
        array2.add(token.nextToken().toInt())
    }

    array1.sort()
    array2.sort()

    if (array1[0] == array1[1]) {
        bw.write("${array1[2]} ")
    } else {
        bw.write("${array1[0]} ")
    }

    if (array2[0] == array2[1]) {
        bw.write("${array2[2]} ")
    } else {
        bw.write("${array2[0]} ")
    }

    bw.flush()
    bw.close()
}
