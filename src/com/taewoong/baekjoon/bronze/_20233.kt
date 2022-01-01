import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    

    val a = br.readLine().toInt()
    val x = br.readLine().toInt()
    val b = br.readLine().toInt()
    val y = br.readLine().toInt()
    val t = br.readLine().toInt()
    
    val aMoney = (Math.max(0,(t - 30)) * x ) * 21 + a
    val bMoney = (Math.max(0,(t - 45)) * y) * 21 + b

    bw.write("$aMoney $bMoney")
    bw.flush()
    bw.close()
    
    
    
}
