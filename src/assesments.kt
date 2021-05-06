fun main() {

    var intro=Introduction("Hellen",19)
    println(intro)
    serves(10)
    serves(4)
    serves(3)
    Names()

}
fun Introduction(name:String,age:Int){
    var intro=("My name is$name and I am $age years old")



}
fun serves(age: Int){
        if(age<6){
            println("milk")
        }
        else if(age>6 && age<15){
            println("fanta")
        }
        else("cocacola")
}
fun Names(){
    var nameArrays= arrayOf("Mercy","Jane","Ann","Angela","Rebecca")
    nameArrays.forEach { name->4 }
    return
}
fun multiply(){

}
