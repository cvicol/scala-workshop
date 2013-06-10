trait BagWithStuff[K, V] {
  def getBy(key: K): V
  def putInBag(key: K, value: V)
  def deleteThe(key: K)
}
//Methods can also have type parameters introduced.
//Generics
//def remove[K](key: K)

class CookieName(val name:String)
class Box(val noOfCookies: Int, val weight:Double)
class CookiesCache extends BagWithStuff[CookieName,Box] {
  var theBoxes: scala.collection.mutable.Map[CookieName, Box] = scala.collection.mutable.Map()

  def getBy(key: CookieName): Box = {
    theBoxes.getOrElse(key, new Box(0, 0))
  }
  def putInBag(key: CookieName, value: Box) = {
    theBoxes.put(key, value)
  }
  def deleteThe(key: CookieName) = {
  }

}




val theCookies = new CookiesCache
theCookies.putInBag(new CookieName("brownie"), new Box(2, 0.5))
theCookies.putInBag(new CookieName("ChocolateChipCookie"), new Box(15, 100))
theCookies.putInBag(new CookieName("M&M"), new Box(500, 250))
theCookies.getBy(new CookieName("M&M"))




