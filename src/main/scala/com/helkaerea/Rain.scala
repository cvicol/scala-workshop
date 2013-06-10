package com.helkaerea
class Rain
object Rain {
  def apply() = new Rain
  def makeItRain: String = "It is Raining"
  var count = 0
  def addInstance = count + 2
}


//
//val theRain = Rain()
//
//Rain.makeItRain
//Rain.addInstance
//Rain.count