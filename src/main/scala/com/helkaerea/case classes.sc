case class Child(name:String, age: Int)

val chibi = new Child("ChibiChibi", 12)
val chibi2 = new Child("ChibiChibi2", 9)
val chibi3 = new Child("ChibiChibi3", 14)

def childType(aChild: Child) = aChild match {
  case  Child("ChibiChibi", 12) => "She is more then 10"
  case Child("ChibiChibi2", 10) => "important child"
//  case _ =>"alien child"
 // case Child(_, _) => "alien"
  case Child(name, age) => "This child:" + name + "with age"+ age
}
childType(chibi3)


val chibi4 = new Child("ChibiChibi4", 14)