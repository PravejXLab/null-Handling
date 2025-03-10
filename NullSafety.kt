fun main() {
    // Using Safe call (?.) -- It provide null instead of throwing error. 

    print("Which is Your Favourite color: ") 
    val color = readlnOrNull()  // If input is null, output will be null not error.
    println("Your Favourite color is $color")  

    print("Who is Your Inspirational Figure: ")  // No Input or Space is not null but Empty String. 
    val figure = readlnOrNull()?.takeIf { it.isNotBlank() }  // This ensures input is neither null nor Empty.
    println("Great! Your Inspirational Figure is $figure") 

    print("What is your Roll Number: ") 
    val rollNumber1 = readlnOrNull()  // This will take Input as String. 
    println("Your Roll Number is: $rollNumber1") 

    print("What is your Roll Number: ") 
    val rollNumber2 = readln().toIntOrNull()  // This will convert input into Int, if fails throw error. 
    println("Your Roll Number is: $rollNumber2")   

    print("What is your Roll Number: ") 
    val rollNumber3 = readlnOrNull()?.toInt()  // This will detect detect null and conver to int, which will throw integer.  
    println("Your Roll Number is: $rollNumber3")    

    print("What is your Roll Number: ") 
    val rollNumber4 = readlnOrNull()?.toIntOrNull()  // This is the safest way, it will provide null but never error. 
    println("Your Roll Number is: $rollNumber4")   


    // Using Elvis operator (?:) -- It provides a default value when an expression evaluates to null. 

    print("Which is your Favouite season: ") 
    val monthName = readlnOrNull() ?: "" 
    println("Your facourite season is $monthName")  // If input is null it will still not throw error. 

    println("Which is the peak season for your job: ") 
    val peakSeason = readlnOrNull()?.takeIf { it.isNotBlank() } ?: "Winter"
    println("Peak season for your job is: $peakSeason")  // If input is blank or null, it will print Winter. 

    print("How much India scored till now: ") 
    val score = readlnOrNull()?.toIntOrNull() ?: 0 
    println("Perfect! If India scored $score")  // If user input is null or not convertible in Integer, it will show 0. 

}