import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine()
    val array = br.readLine().split(" ")

    a.forEach {
        if (array.contains(it.toString())) {
            bw.write("${it.toString().lowercase()}")
        } else {
            bw.write("$it")
        }
    }

    bw.flush()
    bw.close()
}
