fun main() {
    print("Enter customers points:")
    val points = 20
    if (points >= 0 && points <= 100){
        println("you dont qualify")
    }else if (points >= 101 && points <= 400 ){
        println("you win a smartphone ")
    }else if (points >= 401 && points <= 1000){
        println("you win a laptop")
    }else if (points >= 1001){
        println("you win a trip to Canada")
    }else{
        println("invalid points")
    }
    
}