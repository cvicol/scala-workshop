//abstract classes -

abstract class Duck(val canFly: Boolean = false) {
  def sing(): String
  def nameMe(initials: String): String
  val surName: String
}

abstract class Sky {
  def colorOfSky: String
}

class MallardDuck(canFly: Boolean) extends Duck(canFly) {
  def sing(): String = {
    "I can Sing"
  }
  def nameMe(initials: String): String = {
    if(initials.equals("dk")) "Ducky" else "Missy"
  }
  val surName = "The Surname"
  override def toString = "The duck: " + surName
}

val theDuck = new MallardDuck(true)
theDuck.sing()
theDuck.nameMe("dk")
theDuck.canFly

val theDuck2 = new MallardDuck(false)
theDuck2.canFly
val theDuck3 = new MallardDuck(true)


