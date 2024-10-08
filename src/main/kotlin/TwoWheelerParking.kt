package org.example

fun twoWheeler(array1 : Array<Array<Int>>,array2 : Array<Array<Int>>) {
    var twoWheelerAvailableSlots : Int = 0
    var list2 : MutableList<Int> = mutableListOf()
    for(i in 0..1) {
        for(j in 0..1){
            if(i==0 && j==0 && array2[0][0] == 0) {
                list2.add(1)
                twoWheelerAvailableSlots++
            }
            else if(i==0 && j==1 && array2[0][1]==0){
                list2.add(2)
                twoWheelerAvailableSlots++
            }
            else if(i==1 && j==0 && array2[1][0]==0) {
                list2.add(3)
                twoWheelerAvailableSlots++
            }
            else if(i==1 && j==1 && array2[1][1]==0){
                list2.add(4)
                twoWheelerAvailableSlots++
            }
        }
    }
    if(twoWheelerAvailableSlots!=0) {
        println("Available Two Wheeler slots are = $twoWheelerAvailableSlots")
        println(list2)
        println("Enter slot number to park your vehicle")
        checkTwoWheeler(readLine()!!.toInt(),array1,array2)
    }
    else {
        println("Sorry,Two wheeler parking full")
    }
}
