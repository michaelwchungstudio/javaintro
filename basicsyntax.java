// Java Syntax

// The 'main' method
// The main() method is required and any code inside will be executed.
/*
public static void main(String[] args)
*/

// Java Variables - containers for storing data values
// When creating variables, you must specify the type and assign it a value.
/*
1. String - stores text, surrounded by double quotes
  String myText = "Hello";
2. int - stores integers
  int myNum = 5;
3. float - stores floating point numbers, e.g. decimals
  float myFloat = 5.99f;
4. char - stores single characters
  char myLetter = 'M';
5. boolean - stores values with two states: true or false
  boolean myBool = true;
*/
// To declare multiple variables of the same type, use a comma-separated list.
/*
int x = 5, y = 6, z = 50;
*/

// Java Identifiers
// Variables must be identified with unique names.
/*
 - can contain letters, digits, underscores, dollar signs.
 - should begin with a lowercase letter
 - case-sensitive
 - no whitespace
 - no reserved words (e.g. int or String)
*/

// Java Data Types
// https://www.w3schools.com/java/java_data_types.asp

// Primitive: byte, short, int, long, float, double, boolean, char
// Primitive types always have a value.
// Start with lowercase letter.
// Size depends on data type.
/*
long myNum = 15000000000L;
float myFloat = 5.75f;
double myDouble = 19.99d;
*/
// Scientific Numbers, 'e' indicates power of 10
/*
float f1 = 35e3f;
double d1 = 12E4d;
*/

// Non-primitive: String, Arrays, Classes, Interface
// String
// Non-primitive data type because it refers to an OBJECT.
// Has methods used to perform certain operations on strings.
// Value can be 'null'.
// Non-primitive types start with an uppercase letter.

// Java Type Casting
// Assigning a value of one primitive data type to another.
// 1. Widening Casting (automatic) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
/*
  int myInt = 9;
  double myDouble = myInt; => produces '9.0'
*/
// 2. Narrowing Casting (manual) - converting a larger type to a smaller type size
// double -> float -> long -> int -> char -> short -> byte
// This is done by placing the type in parentheses in front of the value.
/*
  double myDouble = 9.78;
  int myInt = (int) myDouble; => produces '9'
*/

// Java Operators
// https://www.tutorialspoint.com/java/java_basic_operators

// Java Strings
/*
  String txt = "herpaderpderp";
  txt.length()
  txt.toUpperCase(), txt.toLowerCase()
  txt.indexOf("derp")
*/
// The backslash escape character (\) turns special characters (ex. ", \, ') into string characters.
// Adding a string and number results in string concatenation.

// Java Math class
// https://www.w3schools.com/java/java_ref_math.asp
/*
  Math.max(x,y), Math.min(x,y)
  Math.sqrt(x)
  Math.abs(x)
  Math.random() => returns a random number between 0 (incl.) and 1 (excl.)
*/

// Java Conditions, If Else statements
/*
  if (condition1) { }
  else if (condition2) { }
  else { }
*/
// If you only have one statement to execute (one for 'if', one for 'else'), you can use a single line format.
/*
  variable = (condition) ? expressionTrue : expressionFalse;
  ex. String result = (time < 18) ? "Good day." : "Good evening.";
*/

// Java Switch statement
// Used to select one of many code blocks to be executed.
/*
  switch(expression) {
    case x:
      // code block
      break;
    case y:
      // code block
      break;
    default:
      // code block
}
*/
// > switch expression is evaluated once.
// > value of expression compared with case values.
// 'break' exits the code block.
// 'default' specifies code block to run if there is no case match (similar to else).

// Java While Loop
// executes as long as the specified condition is true.
// variable in condition should change within the code block, otherwise infinite looping can occur.
/*
  while (condition) {
    // code block
  }
*/
// Do/While Loop
// executes a block of code ONCE before checking if the condition is true, then it will repeat the loop as long as the condition is true.
/*
  do {
    // code block
}
while (condition);
*/

// Java For Loop
// Order: single execute (often setting a variable); condition; executed after code block
/*
  for (int i = 0; i < 5; i++) { }
*/
// Java For-Each Loop
// Executes a statement once for each member in an iterable: array/hashmap/collection/set/list
/*
  for(loop-variable-declaration:array) { }
  for(String fname:fnames) { do something with fname }
*/

// Arrays / Multidimensional Arrays
/*
  float [] theVals1 = new float[3];
  float [] theVals2 = { 10.0f, 11.0f, 12.0f };
*/
/*
  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7 8}, {9, 10, 11, 12} };
*/

---
  
// Encapsulation & Access Modifiers
/*
no modifier => visible within package
public => everywhere
private => only within class
*/

// Classes
  
// Establishing Initial State
// Three mechanisms: (1) field initializers, (2) constructors, (3) initialization blocks
/* (2) Constructors: executable code used during object creation to set initial state
 - no return type
 - at least one present in every class (if not explicitly written, Java will provide one)
 - can have multiple constructors with the EXCEPTION that each has a DIFFERENT PARAMETER LIST (see: signatures)
   Chaining Constructors & Constructor Visibility
 - one constructor can call another using the 'this' keyword followed by the parameter list
 - use access modifiers to control constructor visibility to limit what code can perform specific creations
 - ex. public Passenger(int freeBags) {
   =>     this(freeBags > 1 ? 25.0d : 50.0d);
          this.freeBags = freeBags;
       }
       public Passenger(int freeBags, int checkedBags) {
   =>     this(freeBags);
          this.checkedBags = checkedBags;
       }
   =>  private Passenger(double perBagFee) {
          this.perBagFee = perBagFee;
       }
*/
/* (3) Initialization Blocks
 - code that can be shared across ALL constructors
 - executed as if the code were placed at the start of each constructor
 * enclose statements in brackets outside of any method or constructor
 - ex. public class Flight {
          ...init...variables...
          private boolean[] isSeatAvailable;
    =>    {
            isSeatAvailable = new boolean[seats]
            for(int i = 0; i < seats; i++)
               isSeatAvailable[i] = true;
    =?    }
          ...other constructors...
       }
  
// Method Basics
/*
  return-type name(typed-parameter-list) { statements }
  * return type should be void if no value is returned
*/

// Accessors (getter) & Mutators (setter)
/*
Helpful for controlling field access, hide implementation details
Accessor: retrieves field value
Mutator: modifies field value
*/





























































//
