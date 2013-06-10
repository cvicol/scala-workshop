//import com.helkaerea.Rain

//APPLY METHODS
class SyntactiSugar() {
  def pourSugar() = "Pour sugar in coffe action - single action"
}

class SyntacticSugar2() {
  def apply() = {
     "Pour sugar in coffe action - single action"
  }
}
val sugar1 = new SyntactiSugar
val sugar2 = new SyntacticSugar2
sugar1.pourSugar()
sugar2.apply()

//OR
sugar2()
class Clouds
object CloudMaker {
  def apply() = new Clouds
}
val newClouds = CloudMaker()

class Rain
object Rain {
  def apply() = new Rain
  def makeItRain: String = "It is Raining"
  var count = 0
  def addInstance = count + 2
}


//import com.helkaerea.Rain
val theRain = Rain()
Rain.makeItRain
Rain.addInstance
Rain.count