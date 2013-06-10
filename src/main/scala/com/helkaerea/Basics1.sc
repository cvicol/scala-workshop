object Basics1 {
  println("hello world")                          //> hello world
  //Expressions
  1 + 1                                           //> res0: Int(2) = 2
  //Values
  val bla = "dudu"                                //> bla  : java.lang.String = dudu
  //bla = "another dudu"
  val variable: Int = 1                           //> variable  : Int = 1
  val another = 3                                 //> another  : Int = 3

  //Variables
  var var2: Int = 2                               //> var2  : Int = 2
  var2 = 3

  //functions - actually methods
  def add3To(m: Int): Int = {
      m + 3
   }                                              //> add3To: (m: Int)Int
  val five = add3To(2)                            //> five  : Int = 5
  val a = add3To(4)                               //> a  : Int = 7
  def noargs() = {
     2 + 1
  }                                               //> noargs: ()Int
  val b = noargs()                                //> b  : Int = 3
  noargs                                          //> res1: Int = 3
  add3To(3) toString                              //> res2: java.lang.String = 6

  def add4To(m: Int, n: Int = 3): Int = {
    4 + m + n
  }                                               //> add4To: (m: Int, n: Int)Int
  add4To(2)                                       //> res3: Int = 9
  add4To(3, 5)                                    //> res4: Int = 12

  //anonymous functions
  val anonim = (x: Int) => x + 1                  //> anonim  : Int => Int = <function1>
  anonim(2)                                       //> res5: Int = 3
  anonim.apply(2)                                 //> res6: Int = 3
  val anotherAnonim = () => "Hello World"         //> anotherAnonim  : () => java.lang.String = <function0>
  anotherAnonim                                   //> res7: () => java.lang.String = <function0>
  //wtf happened there? Maybe you do need the paranthesis
  anotherAnonim()                                 //> res8: java.lang.String = Hello World
  val bibi = add3To _                             //> bibi  : Int => Int = <function1>
  bibi(3)                                         //> res9: Int = 6

 // val noDefaultsOnAnonims= (x: Int, y: Int = 4) => x +y


  //Multiple  lines
  def multiplyBy(x: Int): Int = {
    //val inner = x + 1
    3 * x
  }                                               //> multiplyBy: (x: Int)Int
  multiplyBy(3)                                   //> res10: Int = 9
  println("Woking still after this line wtf")     //> Woking still after this line wtf


  //partial applications

  def multiply(x: Int, y: Int): Int = {
    x * y
  }                                               //> multiply: (x: Int, y: Int)Int

  val timestwo = multiply(2, _:Int)               //> timestwo  : Int => Int = <function1>
  timestwo(3)                                     //> res11: Int = 6
  multiply(2, 3)                                  //> res12: Int = 6

  //curried functions
  //sometimes it makes sense to let people apply some arguments now to you function and some later
  def theMultiplication(x: Int)(y: Int) = {
    x * y
  }                                               //> theMultiplication: (x: Int)(y: Int)Int

  theMultiplication(2)(3)                         //> res13: Int = 6
  val multiply2Times = theMultiplication(2) _     //> multiply2Times  : Int => Int = <function1>

  multiply2Times(3)                               //> res14: Int = 6

  //variable length arguments
  //sometimes you have multiple of the same arguments, but you do not know how many
   def showAll(theArgs: Int*) = {
     theArgs.foreach(println(_))
  }                                               //> showAll: (theArgs: Int*)Unit
  showAll(1,2,3,4,5,6)                            //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
  showAll(1,3,5)                                  //> 1
                                                  //| 3
                                                  //| 5
  //classes



  //objects
  //constructors

  //functions vs methods

  //def vs val?

  //inheritance

  //abstract classes

  //types

}