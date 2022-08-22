import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = br.readLine().split(" ")
    val array = arrayOf("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili")

    word.forEachIndexed { index, it ->
        if (index == 0 || !array.contains(it)) bw.write(it[0].toString().uppercase())
    }

    bw.flush()
    bw.close()

    br.close()
}