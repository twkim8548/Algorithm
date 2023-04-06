import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val s = br.readLine()

    var answer = 0
    s.forEach {
        if (it == 'a' || it =='e' || it=='i' || it=='o' || it=='u'){
            answer++
        }
    }
    bw.write("$answer")
    bw.flush()
    bw.close()
}