fun filterVowel(input: String): String {

    var result: String = ""

    for (i in 0..input.length - 1) {
        if (input[i] != 'a' &&
            input[i] != 'e' &&
            input[i] != 'i' &&
            input[i] != 'o' &&
            input[i] != 'u' &&
            input[i] != 'A' &&
            input[i] != 'E' &&
            input[i] != 'I' &&
            input[i] != 'O' &&
            input[i] != 'U'
        )

            result = result + input[i]
    }
    return result

}