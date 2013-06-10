val numberOfTimes = 1

numberOfTimes match {
  case 1 => "one"
  case 3 => "three"
  case _ => "any other number"
}



numberOfTimes match {
  case value if value < 2 => "smalller then 2"
  case value if value >=2 => "bigger or equal then 2"
  case _ => "Who cares?"
}

def aComparisonFunction(arg: Any): Any = {
  arg match {
    case value: Int if value <=1 => value - 1
    case value: Int => value + 2
    case char: Char => char
    case _ => "Tudum"
  }
}
aComparisonFunction('c')
aComparisonFunction("dudu")



