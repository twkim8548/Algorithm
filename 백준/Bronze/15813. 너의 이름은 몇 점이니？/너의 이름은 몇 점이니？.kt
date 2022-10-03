import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val length = br.readLine().toInt()
    val name = br.readLine()
    var answer = 0
    name.forEach {
        answer += it.toInt() - 64
    }
    bw.write("$answer")
    bw.flush()
    br.close()
}
