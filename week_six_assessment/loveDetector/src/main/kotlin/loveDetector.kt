fun loveDetector(firstFlower: Int, secondFlower: Int): Boolean {
    return firstFlower % 2 != secondFlower % 2
}
fun main(){
    print(loveDetector(51,45))
}
