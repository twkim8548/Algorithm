import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val num = token.nextToken().toInt()
        val char = token.nextToken().single()
        var charToInt = char.toInt()

        var cnt = 1
        for (i in 1..num) {
            repeat(cnt) {
                bw.write("${charToInt.toChar()}")
            }
            cnt++
            if (charToInt == 90) {
                charToInt = 65
            } else {
                charToInt++
            }
            bw.write("\n")
        }
        bw.write("\n")
    }
    bw.flush()
    br.close()
}
