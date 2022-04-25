import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
   
    val first = br.readLine().split(" ")
    val second = br.readLine().split(" ")
  
    bw.write("${(first[0].toInt() * 6) + (first[1].toInt() * 3) + (first[2].toInt() * 2) + (first[3].toInt() * 1) + (first[4].toInt() * 2)} ${(second[0].toInt() * 6) + (second[1].toInt() * 3) + (second[2].toInt() * 2) + (second[3].toInt() * 1) + (second[4].toInt() * 2)}")
   
    bw.flush()
    bw.close()
}
