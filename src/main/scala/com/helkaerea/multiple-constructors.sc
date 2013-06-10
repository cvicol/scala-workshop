class Duck(val name: String) {
  var bla : String = _

  def this(initials: Char) = {
    this(getNameBasedOnInitials(initials))
    def getNameBasedOnInitials(initials: Char): String = {
      if(initials.equals('D')) "Ducky" else "TheDuck"
    }
  }

  var someThing: Int = _
  def this(something: Int) = {
     this("A default Name")
    someThing = something
  }
  def aMethod() = {
    val bla: Int = 2
    another()
    def another() = {
      someThing + 1
      bla
    }
  }
  val color: String = if(name =="Ducky") "red" else "yellow"
  override def toString = "A duck by name:" + name + " and color:" + color
}


val theDuck = new Duck('c')


theDuck.aMethod()



val another = new Duck("Ducky")














