import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    repeat(n) {
        bw.write(" @@@   @@@ ")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write("@   @ @   @")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write("@    @    @")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write("@         @")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write(" @       @ ")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write("  @     @  ")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write("   @   @   ")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write("    @ @    ")
        bw.write(" ")
    }
    bw.write("\n")
    repeat(n) {
        bw.write("     @     ")
        bw.write(" ")
    }
    bw.write("\n")
    bw.flush()
    br.close()
}
