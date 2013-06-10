//welcome to TRAITS
//remeber the interface?

trait Animus {
  val power: Int
  def drainPowerBy(rage:Int): Int
  def KO:String = if(power > 35) "Doing OK" else "Not enough rage!"
}

trait Race {
  val specialPowers: String
}

trait NightElf extends Race {
  val specialPowers = "stars rain"
}
trait BloodElf extends Race {
  val specialPowers = "Arcane Rage"
}

class Player(powerLevel:Int, special:String) extends Animus {
  val power = powerLevel
  def drainPowerBy(rage: Int) = power -rage
  override def KO: String = if(power > 20) "doing ok" else "Really not enough rage"
}
val theWarrior = new Player(34, "Skul Bash") with NightElf
theWarrior.power
theWarrior.drainPowerBy(15)
theWarrior.KO
theWarrior.specialPowers

