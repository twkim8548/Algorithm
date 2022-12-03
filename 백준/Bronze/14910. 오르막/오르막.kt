import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = br.readLine().split(" ")
    var isAscent = true
    for (i in 1 until array.size) {
        if (array[i - 1].toBigInteger() > array[i].toBigInteger()) {
            isAscent = false
            break
        }
    }

    if (isAscent)
        bw.write("Good")
    else
        bw.write("Bad")

    bw.flush()
    bw.close()
}
