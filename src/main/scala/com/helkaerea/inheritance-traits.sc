abstract class Duck(val canIFly: Boolean){

  def sing(): String
  def nameMe(initials: String): String
  val surname: String
}
class mallardDuck(override val canIFly: Boolean) extends Duck(canIFly) {
  def sing(): String = "quak"
  def nameMe(initials: String) = if(initials =="L") "LittleBoy" else "LittleGirl"
  val surname = "TheDuck"
}
val ducky = new mallardDuck(true)
ducky.nameMe("L")
ducky.sing
ducky.surname


//what happens when we have vals in abstract classes
//what ahppens when we have constructors? can we?
// why do we need ovveride for vals?
 // play arround can you actually have multiple custructors,
 // and wich one would you extend?

// can you have another constructor, and call a different one on the extends?

// traits - kind of like interfaces  a collections of fields an methods

//a class can extend a trait, or mixinn multiple traits

trait Animus {
  val power: Int
  def drainPowerBy(rage: Int): Int
  def KO:String = if(power > 35) "Doing KO" else "Not enough rage!"
}

trait Race {
  val specialPowers: String
}

trait NightElf extends Race {
  override val specialPowers = "stars rain"
}
trait BloodElf extends Race {
  override val specialPowers = "arcane Rain"
}

class Player(powerLevel: Int, specials: String) extends Animus with Race {
   val power = powerLevel
   val specialPowers = specials
   def drainPowerBy(rage:Int):Int = power - rage
   override def KO:String = if(power > 25) "Doing KO" else "Not enough rage!"
}

class AnotherPlayer (powerLevel: Int, specials: String) extends Animus {
  val power = powerLevel
  def drainPowerBy(rage:Int):Int = power - rage
  override def KO:String = if(power > 25) "Doing KO" else "Not enough rage!"
}

val theWarrior = new Player(34, "SkullBash")
theWarrior.power
theWarrior.specialPowers
theWarrior.drainPowerBy(15)
theWarrior.KO

val thePriest = new Player(34, "Renew") with NightElf
thePriest.specialPowers

//loads of questions to be answered here, it can go on forever, did traits solve the
//problem with is-a vs has-a, but maybe that is too much object oriented design and not functional.
//but still, the question remains, do we need to go all the way to functional and forget the objects?
// i dunno the answer to this question -- maybe a future video, to go into detail. please share your opinions















