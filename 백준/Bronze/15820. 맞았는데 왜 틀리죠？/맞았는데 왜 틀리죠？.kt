import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val s1 = token.nextToken().toInt()
    val s2 = token.nextToken().toInt()

    var isSamplePass = true
    var isSystemPass = true

    repeat(s1) {
        token = StringTokenizer(br.readLine())

        val answer = token.nextToken().toInt()
        val submission = token.nextToken().toInt()

        if (answer != submission) isSamplePass = false
    }

    repeat(s2) {
        token = StringTokenizer(br.readLine())

        val answer = token.nextToken().toInt()
        val submission = token.nextToken().toInt()

        if (answer != submission) isSystemPass = false
    }

    if (isSamplePass && !isSystemPass) bw.write("Why Wrong!!!")
    if (isSamplePass && isSystemPass) bw.write("Accepted")
    if (!isSamplePass) bw.write("Wrong Answer")



    bw.flush()
    bw.close()

    br.close()
}
