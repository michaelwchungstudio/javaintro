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




































































//
