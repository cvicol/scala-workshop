//val name = "Dad"
//if(name == "Dad") "he is the dad"
//else if (name == "Momn") "MOmmy"
//else "Some other dude"
//
//1 to 10
//
//1 until 10
//
//1 to 20 by 3
var x = 0
for( x <- 1 to 10) println(x)









 val theList = List(1,2,4,5,6,7)
for(x <- theList) println(x)




val anotherList = for{x <- theList
                      if x %10 ==2;
if x%10 ==1} yield x
for(a <- anotherList) println(a)






