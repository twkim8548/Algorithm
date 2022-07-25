import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate.now
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val array = IntArray(26)

    s.forEach {
        array[it.code-97]++
    }

    array.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    br.close()
}