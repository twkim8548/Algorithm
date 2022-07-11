import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

data class Key (val num: Int, val priority: Int, val c: String)


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val array = ArrayList<Key>()

    repeat(m) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken()

        val key = Key(a,b,c)
        array.add(key)
    }
    array.sortedBy { it.num }.sortedBy { it.priority }.forEach {
        bw.write("${it.c}")
    }
    bw.flush()
    bw.close()

    br.close()
}