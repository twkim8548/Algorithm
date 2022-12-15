import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var answer = 0
        val string = br.readLine()
        string.forEach {
            if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
                answer++
            }
        }
        bw.write("The number of vowels in $string is $answer.\n")
    }


    bw.flush()
    bw.close()
}
