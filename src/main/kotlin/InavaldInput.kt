package org.example

fun againCall(array1 : Array<Array<Int>>,array2 : Array<Array<Int>>) {

    println("Select your vechical type \n 1  Four wheeler \n 2  Two wheeler")
    print("Enter vehicle Type :")
    val input1 : Int = readln()!!.toInt()

    if(input1 == 1){
        fourWheeler(array1,array2)
    }
    else if(input1 == 2){
        twoWheeler(array1,array2)
    }
    else {
        againCall(array1,array2)
    }
}