import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true) {
        val string = br.readLine()
        if (string == "0 0")
            break
        val token = StringTokenizer(string)
        bw.write("${token.nextToken().toInt() + token.nextToken().toInt()}\n")
    }

    bw.flush()
    br.close()
}
