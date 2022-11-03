import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = IntArray(n) { br.readLine().toInt() }

    array.forEachIndexed { index, i ->
        array[index] = i.toString().replace("6", "9").replace("0", "9").toInt()
        if (array[index] > 100) {
            array[index] = 100
        }
    }

    bw.write("${round(array.average())}")

    bw.flush()
    bw.close()
}
