open class Vehicle ( var driver : Driver ?= null ) {

    open fun drive(){

    }
}

class MilitaryTank : Vehicle() {
    var avstandtank = 2000
    override fun drive() {
        if (driver == null) {
            println("Militarytank didn’t drive - there’s no driver!")
            println()
            println()
        }
        else if (driver != null && driver!!.age < 25) {
            println("Militarytank didn't drive - ${driver!!.namn} is ${driver!!.age}, but must be 25 or older to drive")
            println()
            println()
        }
        else {
            avstandtank = avstandtank - 5
            println("Militarytank drove 5 miles")
            println("$avstandtank miles to go!")
            println()
            println()
        }
    }
}

class Car : Vehicle() {
    var avstandcar = 2000
    override fun drive() {
        if (driver == null) {
            println("The car didn’t drive - there’s no driver!")
            println()
            println()
        }
        else if (driver != null && driver!!.age < 18) {
            println("The car didn't drive - ${driver!!.namn} is ${driver!!.age}, but must be 18 or older to drive")
            println()
            println()
        }
        else {
            avstandcar = avstandcar - 10
            println("The car drove 10 miles")
            println("$avstandcar miles to go!")
            println()
            println()
        }
    }
}