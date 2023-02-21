fun main() {

if(isPrime(5)){

    println("Prime number")

    }else{

        println("Not a prime number")

    }


}

fun isPrime(number:Int):Boolean{
    if (number <= 1) {


        return false

    }

    for (i in 2..number / 2)
    if (number % i == 0) {

        return false
    }


return true

}