import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        when (string) {
            "CU" -> {
                bw.write("see you\n")
            }

            ":-)" -> {
                bw.write("I’m happy\n")
            }

            ":-(" -> {
                bw.write("I’m unhappy\n")
            }

            ";-)" -> {
                bw.write("wink\n")
            }

            ":-P" -> {
                bw.write("stick out my tongue\n")
            }

            "(~.~)" -> {
                bw.write("sleepy\n")
            }

            "TA" -> {
                bw.write("totally awesome\n")
            }

            "CCC" -> {
                bw.write("Canadian Computing Competition\n")
            }

            "CUZ" -> {
                bw.write("because\n")
            }

            "TY" -> {
                bw.write("thank-you\n")
            }

            "YW" -> {
                bw.write("you’re welcome\n")
            }

            "TTYL" -> {
                bw.write("talk to you later\n")
                break
            }

            else -> {
                bw.write("$string\n")
            }
        }
    }

    bw.flush()
    bw.close()
}