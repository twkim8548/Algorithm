import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toBigInteger()
    var answer = n
    val k = br.readLine().toInt()

    repeat(k) {
        n = (n.toString() + "0").toBigInteger()
        answer += n
    }

    bw.write("$answer")

    bw.flush()
    br.close()
}
