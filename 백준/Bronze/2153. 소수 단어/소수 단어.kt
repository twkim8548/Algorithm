import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = br.readLine()
    var num = 0
    string.forEach {
        num += if (it.isUpperCase()) {
            it.code - 38
        } else {
            it.code - 96
        }
    }
    if (isPrime(num)) bw.write("It is a prime word.")
    else bw.write("It is not a prime word.")

    bw.flush()
    bw.close()
}

fun isPrime(n: Int): Boolean {
    if (n == 1) return true
    var i = 2
    while (i * i <= n) {
        if (n % i++ == 0) return false
    }
    return true
}