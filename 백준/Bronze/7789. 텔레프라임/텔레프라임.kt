import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.pow


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val phone = token.nextToken()
    val new = token.nextToken()

    if (isPrime(phone.toInt()) && isPrime((new+phone).toInt())) bw.write("Yes")
    else bw.write("No")


    bw.flush()
    br.close()
}
fun isPrime(n: Int): Boolean {
    var i = 2
    while (i * i <= n) {
        if (n%i++ == 0) return false
    }
    return true
}