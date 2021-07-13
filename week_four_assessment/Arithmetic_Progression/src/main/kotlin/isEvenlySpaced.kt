fun isEvenlySpaced(a: Int, b: Int, c: Int): Boolean {

    return ((a - b == b - c) || (a - c == c - b) || (a - b == c - a))
}