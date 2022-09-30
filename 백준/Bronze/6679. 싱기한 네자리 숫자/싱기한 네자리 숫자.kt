import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1000 .. 9999) {
        if (sum(i.toString(16), 16) == sum(i.toString(12), 12) && sum(i.toString(16), 16) == sum(i.toString(10), 10)) {
            bw.write("$i\n")
        }
    }

    bw.flush()
    br.close()
}

fun sum(s: String, i: Int): Int {
    var sum = 0
    s.forEach {
        sum += it.toString().toInt(i)
    }
    return sum
}