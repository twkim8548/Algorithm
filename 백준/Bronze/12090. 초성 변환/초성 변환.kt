import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()

    s.forEach {
    bw.write("${getInitialSound(it)}")
    }

    bw.flush()
    br.close()
}
fun getInitialSound(char: Char): String? {
    val chs = arrayOf(
        "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ",
        "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ",
        "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ",
        "ㅋ", "ㅌ", "ㅍ", "ㅎ"
    )
        if (char.toInt() >= 0xAC00) {
            val uniVal = char.toInt() - 0xAC00
            val cho = ((uniVal - (uniVal % 28))/28)/21
            return chs[cho]
        }
    return null
}
