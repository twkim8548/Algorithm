
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.* 

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    
    
    bw.write("${(token.nextToken().toInt() * 5) + (token.nextToken().toInt() * 5) + (token.nextToken().toInt() * 5)+ (token.nextToken().toInt() * 5) + (token.nextToken().toInt() * 5) + (token.nextToken().toInt() * 5)}")
    bw.flush()
    bw.close()
    
}
