import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate
import java.util.Date
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()
    val token = StringTokenizer(str)
    
    val h = token.nextToken().toInt()
    val i = token.nextToken().toInt()
    val a = token.nextToken().toInt()
        val r = token.nextToken().toInt()
        val c = token.nextToken().toInt()
    bw.write("${h*i - a*r*c}")


    bw.flush()
    bw.close()
}
