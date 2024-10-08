package org.example

fun fourWheeler(array1 : Array<Array<Int>>,array2 : Array<Array<Int>>) {
    var fourAvailableSlots : Int = 0
    var list1 : MutableList<Int> = mutableListOf()
    for(i in 0..1) {
        for(j in 0..1){
            if(i==0 && j==0 && array1[0][0] == 0) {
                list1.add(1)
                fourAvailableSlots++
            }
            else if(i==0 && j==1 && array1[0][1]==0){
                list1.add(2)
                fourAvailableSlots++
            }
            else if(i==1 && j==0 && array1[1][0]==0) {
                list1.add(3)
                fourAvailableSlots++
            }
            else if(i==1 && j==1 && array1[1][1]==0){
                list1.add(4)
                fourAvailableSlots++
            }
        }
    }
    if(fourAvailableSlots!=0) {
        println("Available Four Wheeler slots are = $fourAvailableSlots")
        println(list1)
        println("Enter slot number to park your vehicle")
        checkFourWheeler(readln()!!.toInt(),array1,array2)
    }
    else {
        println("Sorry,Four wheeler parking full")
    }
}