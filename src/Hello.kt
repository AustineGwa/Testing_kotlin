/**
 * Created by gwaza on 5/13/2018.
 */

fun main(args : Array<String>){
    var name = "Austine"  // creating a mutable variable and assigning it a value
    val teacher = "Dr. Omieno" //"Dr. Omieno"  //creating an imutable variable and assigning it a final value
    println("GoodMorning ${name}")

    //teacher = "Dr.mieno"  //: this will throw an error since teacher was initialilized as final (immutable)
    getTeacher(teacher)
}

fun getTeacher(teacher: String) {

    println("your teacher is  $teacher")
}

