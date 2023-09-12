import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val first = br.readLine()
    val second = br.readLine()
    first.forEachIndexed { index, c ->
        if (c.toString().toInt() > second[index].toString().toInt()) {
            bw.write("$c")
        } else {
            bw.write("${second[index]}")
        }
    }

    bw.flush()
    bw.close()
}