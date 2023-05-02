fun main(){
    details("Cynthia",19,"Kenya")
   var numbers= sum(1,2,3,4)
    println(numbers)
    println(average(2,3,4,5,6))
    var m=personRecords("Angelah mumo wambua",18,"0713504579","angelahmumoh@gmail.com",56.8F,true or false)

}
//1. Create and invoke a function that takes in a users name, age, and nationality and
// prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
// I am 23 years old and I am from Kenya” (2 points)
fun details(userName:String,age:Int,nationality:String){
    println("Hello,my name is ${userName},i am ${age} and I am  from ${nationality}")
}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun sum(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum=num1+num2+num3+num4
    return sum
}

//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun average(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int): Int {
    var numbers = 5
    val sum = num1 + num2 + num3 + num4 + num5
    return sum / numbers

}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personRecords(fullName:String,age: Int,phoneNumber: String,email:String,weight:Float,citizen:Boolean){
    println("My name is ${fullName},phoneNumber is ${phoneNumber},email is ${email},i have ${weight}kgs and i am a  Kenyan")

}


