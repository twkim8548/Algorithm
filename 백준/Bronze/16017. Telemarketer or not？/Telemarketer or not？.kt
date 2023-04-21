import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val one = br.readLine().toInt()
    val two = br.readLine().toInt()
    val three = br.readLine().toInt()
    val four = br.readLine().toInt()

    if ((one == 9 || one == 8) && (four == 9 || four == 8) && (two == three)) {
        bw.write("ignore")
    } else {
        bw.write("answer")
    }

    bw.flush()
    br.close()
}
