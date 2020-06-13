//*At this stage, you will program the bot to count from 0 to any positive number you entered.
//
//Here is an example of a dialogue with the new version of the bot. Input lines are started with ">" symbol.
//
//Hello! My name is Aid.
//I was created in 2020.
//Please, remind me your name.
//> Max​​​​​​​
//What a great name you have, Max!
//Let me guess your age.
//Say me remainders of dividing your age by 3, 5 and 7.
//> 1 2 1
//Your age is 22; that's a good time to start programming!
//Now I will prove to you that I can count to any number you want.
//> 5
//0!
//1!
//2!
//3!
//4!
//5!
//Completed, have a nice day!
//Note, each number starts with a new line, and after a number, the bot should print the exclamation mark. Do not output any extra characters in these lines with numbers.
//
//Use the provided template to simplify your work. You can change the text if you want, but be especially careful with counting numbers.*//

package bot

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

    println("Your age is " + age + "; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    // read a number and count to it here

    println("Completed, have a nice day!")
}