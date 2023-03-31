import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val array = mutableListOf<String>()
        for (i in 1..n / 2) {
            if (i != (n - i)) {
                array.add("$i ${n - i}")
            }
        }
//        array.forEach {
//            println(it)
//        }
        bw.write(array.joinToString(", " , "Pairs for ${n}: "))
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}