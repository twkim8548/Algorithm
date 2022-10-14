import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()

    bw.write(remember2018(n))

    bw.flush()
    bw.close()
}

fun remember2018(n: String): String {
    n.forEach {
        if (it != '2' && it != '0' && it != '1' && it != '8') {
            return "0"
        }
    }
    if (n.contains('2') && n.contains('0') && n.contains('1') && n.contains('8')) {
        if (n.count { it == '2' } == n.count { it == '0' } && n.count { it == '1' } == n.count { it == '0' } && n.count { it == '1' } == n.count { it == '8' }) {
            return ("8")
        }
        return ("2")
    }
    return ("1")
}