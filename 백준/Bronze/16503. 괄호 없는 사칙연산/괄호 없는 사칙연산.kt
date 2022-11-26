import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken()
    val c = token.nextToken().toInt()
    val d = token.nextToken()
    val e = token.nextToken().toInt()

    val array = IntArray(2)

    array[0] = getAnswer(getAnswer(a, b, c), d, e)
    array[1] = getAnswer(a, b, getAnswer(c, d, e))

    array.sorted().forEach {
        bw.write("$it\n")
    }

    bw.flush()
    br.close()
}

fun getAnswer(a: Int, b: String, c: Int): Int {
    return when (b) {
        "+" -> {
            return a + c
        }
        "-" -> {
            return a - c
        }
        "*" -> {
            return a * c
        }
        "/" -> {
            return a / c
        }
        else -> {
            0
        }
    }
}