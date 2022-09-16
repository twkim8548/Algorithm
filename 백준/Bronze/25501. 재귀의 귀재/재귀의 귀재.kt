import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var cnt = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        cnt = 0
        bw.write("${isPalindrome(br.readLine())} $cnt\n")
    }

    bw.flush()
    br.close()
}

fun recursion(s: String, l: Int, r: Int): Int {
    cnt++
    return if (l >= r) 1
    else if (s[l] != s[r]) 0
    else {
        recursion(s, l + 1, r - 1)
    }
}

fun isPalindrome(s: String): Int {
    return recursion(s, 0, s.length - 1)
}