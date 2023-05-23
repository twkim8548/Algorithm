import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a  = token.nextToken().toInt()
    val b = token.nextToken()
    val c = token.nextToken().toInt()
    val d = token.nextToken()
    val e = token.nextToken().toInt()

    when(b) {
        "+" -> {
            if (a+c == e) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        }
        "-" -> {
            if (a-c == e) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        }
        "*" -> {
            if (a*c == e) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        }
        "/" -> {
            if (a/c == e) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        }
        "%" -> {
            if (a%c == e) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        }
    }


    bw.flush()
    bw.close()
}