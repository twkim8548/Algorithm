import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()

    bw.write("${findJOICnt(s)}\n${findIOICnt(s)}")
    bw.flush()
    bw.close()

    br.close()
}

fun findJOICnt(s: String): Int {
    var cnt = 0
    for (i in 0 until s.length - 2 ) {
        if (s[i] == 'J') {
            if (s[i+1] == 'O' && s[i+2] == 'I') cnt++
        }
    }
    return cnt
}

fun findIOICnt(s: String): Int {
    var cnt = 0
    for (i in 0 until s.length - 2 ) {
        if (s[i] == 'I') {
            if (s[i+1] == 'O' && s[i+2] == 'I') cnt++
        }
    }
    return cnt
}