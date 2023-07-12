import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val array = IntArray(3) {token.nextToken().toInt()}

    var isOdd = false
    var answer = 1
    var answer2 = 1
    array.forEach { 
        if (it % 2 == 1) {
            answer *= it
            isOdd = true
        } else {
            answer2 *= it
        }
    }
    
    if (isOdd) {
        bw.write("$answer")
    } else {
        bw.write("$answer2")   
    }
    

    bw.flush()
    bw.close()
}
