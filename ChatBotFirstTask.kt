//*Description
//
//Digital personal assistants help people to drive cars, plan their day, buy something online. In a sense, they are simplified versions of artificial intelligence with whom you can talk.
//
//In this project, you will develop step by step a simple bot which will help you to study programming.
//
//For the first stage, you will write a bot who displays a greeting, its name and the date of its creation.
//
//Your program must print the following lines:
//
//Hello! My name is {botName}.
//I was created in {birthYear}.
//Instead of {botName} print any name you choose and replace {birthYear} with the current year (four digits), ex:
//
//Hello! My name is Aid.
//I was created in 2020.
//You can change the text if you need but print exactly two lines.
//
//Next, we will use Aid and 2020 as your assistant's name and its birth year, but you can change it if you want.
//
//You can ignore the package bot line, you'll find out what it means later.*//

package bot

class SimpleBot(name: String, bd: Int) {

    companion object {
        fun halo(name: String = "Aid", bd: Int = 2020) {
            println("Hello! My name is $name.")
            println("I was created in $bd.")
        }
    }
}

fun main() {
    SimpleBot.halo()
}