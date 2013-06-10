def threeMultiplyedBy(x: Int): Int = {
  3 * x
}

threeMultiplyedBy(2)

val result = threeMultiplyedBy(45)

def threeMultpliedWith(x: Int) = 3 * x

def justSaying = "hello Wolrd"

justSaying

def sayingHello {
  println("inside the method")
  "Hi there!"
}

sayingHello

val theFunction = (x: Int) => {x + 1}

theFunction.apply(3)
theFunction(3)

def multiplication(x: Int , y: Int = 1) = {
  println("x:" + x + "y:" + y)
  x * y
}

multiplication(3, 4)


multiplication(2)


//varied length arguments
def showAll(theArgs: Int*) = {
  theArgs.foreach(println)
}

showAll(1,3,4,4)






showAll(1,2)


def multiply(x: Int, y:Int) = {
  x * y
}

val timestwo = multiply(2, _:Int)
timestwo(3)
timestwo(4)

def theMultiplication(x:Int)(y:Int):Int = {
  x * y
}
theMultiplication(2)(3)

val aMultiplication = theMultiplication(2) _

//do something
aMultiplication(3)





