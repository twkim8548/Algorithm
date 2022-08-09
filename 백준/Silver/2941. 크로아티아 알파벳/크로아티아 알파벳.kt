import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var string = br.readLine()
    val croatiaAlphabet = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    croatiaAlphabet.forEach {
        string = string.replace(it, "Z")
    }

    bw.write("${string.length}")
    bw.flush()
    bw.close()
    br.close()
}