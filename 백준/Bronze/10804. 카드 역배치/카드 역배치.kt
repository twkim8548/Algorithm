import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = mutableListOf<Int>()
    repeat(20) {
        array.add(it + 1)
    }

    repeat(10) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        val temp = mutableListOf<Int>()
        repeat(b-a + 1) {
            temp.add(array[a-1])
            array.removeAt(a-1)
        }

        temp.forEach {
            array.add(a-1, it)
        }
    }

    array.forEach {
        bw.write("$it ")
    }

    bw.flush()
    br.close()
}
