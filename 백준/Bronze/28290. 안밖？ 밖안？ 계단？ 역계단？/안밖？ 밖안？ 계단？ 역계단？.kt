import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    when (br.readLine()) {
        "fdsajkl;" -> bw.write("in-out")
        "jkl;fdsa" -> bw.write("in-out")
        "asdf;lkj" -> bw.write("out-in")
        ";lkjasdf" -> bw.write("out-in")
        "asdfjkl;" -> bw.write("stairs")
        ";lkjfdsa" -> bw.write("reverse")
        else -> bw.write("molu")
    }
    bw.flush()
    br.close()
}
