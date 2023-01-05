import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val string = br.readLine()
        if (string == ".") {
            break
        }

        val array = mutableListOf<Char>()

        string.forEach {
            if ((it == ')' && array.isNotEmpty() && array.last() == '(') || (it == ']' && array.isNotEmpty() && array.last() == '[')) {
                array.removeLast()
            } else if (it == '(' || it == '[' || it == ')' || it == ']') {
                array.add(it)
            }
        }
        if (array.size == 0) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
    }

    bw.flush()
    bw.close()
}
