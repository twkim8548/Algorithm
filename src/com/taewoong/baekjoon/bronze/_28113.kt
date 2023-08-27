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
    
    val n = token.nextToken().toInt()
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    
    if (b > a) {
        bw.write("Bus")
    } else if (a > b) {
        bw.write("Subway")
    } else {
        bw.write("Anything")
    }


    bw.flush()
    bw.close()
}
