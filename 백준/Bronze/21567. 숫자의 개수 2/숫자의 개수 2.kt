import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toBigInteger()
    val b = br.readLine().toBigInteger()
    val c = br.readLine().toBigInteger()
    for (i in 0 until 10) {
        bw.write("${(a * b * c).toString().count { it.toString() == i.toString() }}\n")
    }
    
    bw.flush()

    br.close()
}
