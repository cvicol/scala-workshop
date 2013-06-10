//lets talk about basic inheritance scala
class Fire(val fireType: String) {
  def putOutFire(amountOfWatter:Double): String = "Putting out the fire with " + amountOfWatter
}

class BushFire(fireType: String) extends Fire(fireType)

class HolyFire(fireType:String) extends Fire(fireType) {
  override def putOutFire(ammountOfWatter: Double): String = "Putting out fire with watter and blessings" + ammountOfWatter
  def putOutFire(ammountOfWatter: Double, extraIngredient: String):String = {
      "Adding extra ingredient to watter " + ammountOfWatter + "..." + extraIngredient
  }
  override def toString() = "The fire with name:" + fireType
}
val holyFire = new HolyFire("spriit dust")
val bushFire: Fire = new BushFire("yellow fire")

holyFire.putOutFire(23.2)
bushFire.putOutFire(42)

holyFire.putOutFire(12)
holyFire.putOutFire(34)


