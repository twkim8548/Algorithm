import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    
    bw.write("${b/a * 3 * c}")
    
    bw.flush()
    bw.close()
}
