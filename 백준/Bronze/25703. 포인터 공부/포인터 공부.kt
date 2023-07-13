import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    bw.write("int a;\n" +
            "int *ptr = &a;\n")
    repeat(n - 1) {
        bw.write("int ")
        repeat(it + 2) {
            bw.write("*")
        }
        bw.write("ptr${it + 2}")
        bw.write(" = &ptr${if (it+1 > 1) it + 1 else ""};\n")
    }
    bw.flush()
    bw.close()
}
