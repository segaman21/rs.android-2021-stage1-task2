package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var newA: String = ""
        for (i in a.indices) {
            if (b.contains(a[i].toUpperCase())) newA += a[i].toUpperCase()
        }
        return if (newA == b) "YES" else "NO"
    }
}
