object Basics1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); 
  println("hello world");$skip(24); val res$0 = 
  //Expressions
  1 + 1;System.out.println("""res0: Int(2) = """ + $show(res$0));$skip(30); 
  //Values
  val bla = "dudu";System.out.println("""bla  : java.lang.String = """ + $show(bla ));$skip(49); 
  //bla = "another dudu"
  val variable: Int = 1;System.out.println("""variable  : Int = """ + $show(variable ));$skip(18); 
  val another = 3;System.out.println("""another  : Int = """ + $show(another ));$skip(35); 

  //Variables
  var var2: Int = 2;System.out.println("""var2  : Int = """ + $show(var2 ));$skip(11); 
  var2 = 3;$skip(81); 

  //functions - actually methods
  def add3To(m: Int): Int = {
      m + 3
   };System.out.println("""add3To: (m: Int)Int""");$skip(23); 
  val five = add3To(2);System.out.println("""five  : Int = """ + $show(five ));$skip(20); 
  val a = add3To(4);System.out.println("""a  : Int = """ + $show(a ));$skip(34); 
  def noargs() = {
     2 + 1
  };System.out.println("""noargs: ()Int""");$skip(19); 
  val b = noargs();System.out.println("""b  : Int = """ + $show(b ));$skip(9); val res$1 = 
  noargs;System.out.println("""res1: Int = """ + $show(res$1));$skip(21); val res$2 = 
  add3To(3) toString;System.out.println("""res2: java.lang.String = """ + $show(res$2));$skip(61); 

  def add4To(m: Int, n: Int = 3): Int = {
    4 + m + n
  };System.out.println("""add4To: (m: Int, n: Int)Int""");$skip(12); val res$3 = 
  add4To(2);System.out.println("""res3: Int = """ + $show(res$3));$skip(15); val res$4 = 
  add4To(3, 5);System.out.println("""res4: Int = """ + $show(res$4));$skip(58); 

  //anonymous functions
  val anonim = (x: Int) => x + 1;System.out.println("""anonim  : Int => Int = """ + $show(anonim ));$skip(12); val res$5 = 
  anonim(2);System.out.println("""res5: Int = """ + $show(res$5));$skip(18); val res$6 = 
  anonim.apply(2);System.out.println("""res6: Int = """ + $show(res$6));$skip(42); 
  val anotherAnonim = () => "Hello World";System.out.println("""anotherAnonim  : () => java.lang.String = """ + $show(anotherAnonim ));$skip(16); val res$7 = 
  anotherAnonim;System.out.println("""res7: () => java.lang.String = """ + $show(res$7));$skip(76); val res$8 = 
  //wtf happened there? Maybe you do need the paranthesis
  anotherAnonim();System.out.println("""res8: java.lang.String = """ + $show(res$8));$skip(22); 
  val bibi = add3To _;System.out.println("""bibi  : Int => Int = """ + $show(bibi ));$skip(10); val res$9 = 
  bibi(3);System.out.println("""res9: Int = """ + $show(res$9));$skip(153); 

 // val noDefaultsOnAnonims= (x: Int, y: Int = 4) => x +y


  //Multiple  lines
  def multiplyBy(x: Int): Int = {
    //val inner = x + 1
    3 * x
  };System.out.println("""multiplyBy: (x: Int)Int""");$skip(16); val res$10 = 
  multiplyBy(3);System.out.println("""res10: Int = """ + $show(res$10));$skip(46); 
  println("Woking still after this line wtf");$skip(82); 


  //partial applications

  def multiply(x: Int, y: Int): Int = {
    x * y
  };System.out.println("""multiply: (x: Int, y: Int)Int""");$skip(37); 

  val timestwo = multiply(2, _:Int);System.out.println("""timestwo  : Int => Int = """ + $show(timestwo ));$skip(14); val res$11 = 
  timestwo(3);System.out.println("""res11: Int = """ + $show(res$11));$skip(17); val res$12 = 
  multiply(2, 3);System.out.println("""res12: Int = """ + $show(res$12));$skip(180); 

  //curried functions
  //sometimes it makes sense to let people apply some arguments now to you function and some later
  def theMultiplication(x: Int)(y: Int) = {
    x * y
  };System.out.println("""theMultiplication: (x: Int)(y: Int)Int""");$skip(27); val res$13 = 

  theMultiplication(2)(3);System.out.println("""res13: Int = """ + $show(res$13));$skip(46); 
  val multiply2Times = theMultiplication(2) _;System.out.println("""multiply2Times  : Int => Int = """ + $show(multiply2Times ));$skip(21); val res$14 = 

  multiply2Times(3);System.out.println("""res14: Int = """ + $show(res$14));$skip(186); 

  //variable length arguments
  //sometimes you have multiple of the same arguments, but you do not know how many
   def showAll(theArgs: Int*) = {
     theArgs.foreach(println(_))
  };System.out.println("""showAll: (theArgs: Int*)Unit""");$skip(23); 
  showAll(1,2,3,4,5,6);$skip(17); 
  showAll(1,3,5)}
  //classes



  //objects
  //constructors

  //functions vs methods

  //def vs val?

  //inheritance

  //abstract classes

  //types

}