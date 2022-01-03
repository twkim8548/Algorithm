import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token1 = StringTokenizer(br.readLine())
    
    val t1 = token1.nextToken().toInt()
    val v1 = token1.nextToken().toInt()
    
    val token2 = StringTokenizer(br.readLine())
    
    val t2 = token2.nextToken().toInt()
    val v2 = token2.nextToken().toInt()
    
    if (t2 < 0 && v2 >= 10) {
        bw.write("A storm warning for tomorrow! Be careful and stay home if possible!")
    } else if (t2 < t1) {
        bw.write("MCHS warns! Low temperature is expected tomorrow.")
    } else if (v2 > v1) {
        bw.write("MCHS warns! Strong wind is expected tomorrow.")
    } else {
        bw.write("No message")
    }
    
    bw.flush()
    bw.close()
}
