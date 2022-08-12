import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val chicken = br.readLine().toInt()

    if ((a + b) >= (chicken * 2))
        bw.write("${(a+b) - (chicken*2)}")
    else
        bw.write("${a+b}")

    bw.flush()
    bw.close()

    br.close()
}