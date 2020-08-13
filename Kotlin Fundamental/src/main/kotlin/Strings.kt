fun main(){
    val wordOne = "modern"
    val wordTwo = "Concise"
    val wordThree = "Pragmatic"
    val wordFour = "Safe"
    val text = """
        kotlin is $wordOne
        kotlin is $wordTwo
        kotlin is $wordThree
        kotlin is $wordFour
        """.trimIndent()

    print(text)
}