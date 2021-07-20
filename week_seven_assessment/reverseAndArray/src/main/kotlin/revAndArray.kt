fun revAndArray(num: Int): ArrayList<Int> {
    var numToStr = num.toString()
    var arrOfNumber = ArrayList<Int>()

    for (i in numToStr.length - 1 downTo 0) {
        arrOfNumber.add(Integer.parseInt(numToStr[i].toString()))
    }
    return arrOfNumber
}