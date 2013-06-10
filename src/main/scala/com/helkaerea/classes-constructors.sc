class Duck

class MallardDuck(@scala.reflect.BeanProperty var name:String) {

  println("inside the constructor")
  val color: String = {
    if(name == "Ducky") "red"
    else if(name == "Iffy") "pink"
    else "yellow"
  }
  println("still inside the constructor")

  def sing = {
    if(name == "Ducky") "squeak"
    else if(name == "Iffy") "hickup"
    else "mute"
  }
  val surnName = "The Duck"

  def getTheRealName = name
  override def toString = "A duck by the name:" + name + " and color:" + color + " that sings:" + sing
}

val theDuck = new Duck
val aSpecialDuck = new MallardDuck("Ducky")

//  HOMEWORK what happens if you define a method with teh name getName and your field is defined by var, val

println("It's Color:" + aSpecialDuck.color)
println("It's song:" + aSpecialDuck.sing)
println("It's surname:" + aSpecialDuck.surnName)
println("It's name:" + aSpecialDuck.getTheRealName)

aSpecialDuck.name = "Mara"
aSpecialDuck

//what happens if i make a constructor private

class Flamingo private (val name:String) {
  val color: String = {
    if(name == "LittleMan") "red"
    else if(name == "BidBird") "pink"
    else "yellow"
  }

  def this(initials: Char) = {
    this(computeRealName(initials))
    def computeRealName(initials: Char):String = {
      if(initials == 'L') "LittleMan"
      else if(initials == 'B') "BidBird"
      else "anonim"
    }
  }

  override def toString = "A flaming called:" + name
}
val theFlamingo = new Flamingo('L')
theFlamingo.name

//what ahppens when you define amother constructor that takes, a parameter, initials on type String

//you might not always want to use vals
//we usually use def's even for the normal fields, and they will get evaluated when you need them
//if the fields are independent, and once they are sent will not be influenced by one another, use vals.




