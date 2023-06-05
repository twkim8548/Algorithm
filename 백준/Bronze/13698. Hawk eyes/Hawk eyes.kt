import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = intArrayOf(1,0,0,2)
    val str = br.readLine()
    str.forEach {
        when (it) {
            'A' -> {
                val tmp = array[1]
                array[1] = array[0]
                array[0] = tmp
            }
            'B' -> {
                val tmp = array[2]
                array[2] = array[0]
                array[0] = tmp
            }
            'C' -> {
                val tmp = array[3]
                array[3] = array[0]
                array[0] = tmp
            }
            'D' -> {
                val tmp = array[2]
                array[2] = array[1]
                array[1] = tmp
            }
            'E' -> {
                val tmp = array[3]
                array[3] = array[1]
                array[1] = tmp
            }
            'F' -> {
                val tmp = array[3]
                array[3] = array[2]
                array[2] = tmp
            }
        }
    }
    bw.write("${array.indexOf(1) + 1}\n${array.indexOf(2) + 1}")

    bw.flush()
    bw.close()
}