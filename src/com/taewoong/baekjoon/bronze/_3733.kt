import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main(args: Array<String>) {
    val sb = StringBuilder()
    val sc = Scanner(System.`in`)
    var n: Int
    var s: Int
    while (sc.hasNext()) {
        n = sc.nextInt()
        s = sc.nextInt()
        sb.append(s / (n + 1)).append("\n")
    }
    if (sb.isNotEmpty()) {
        sb.setLength(sb.length - 1)
    }
    print(sb)
}
