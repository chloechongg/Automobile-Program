# Automobile-Program
Being able to design, create and utilize classes and objects.

The main objective of this project is to be able to design, create and utilize classes and objects. I will write a
class based on the following UML diagram. My class will be called “Automobile” and reside in a source file
named “Automobile.java”.

Automobile class
- make: String
- model: String
- year: int
- color: String
- basePrice: double
- discount: double
- taxRate: double
+ setMake( String )
+ getMake(): String
+ setModel( String )
+ getModel(): String
+ setYear( int )
+ getYear(): int
+ setColor( String )
+ getColor(): String
+ setBasePrice( double )
+ getBasePrice(): double
+ setDiscountRate( double )
+ getDiscountRate(): double
+ setTaxRate( double )
+ getTaxRate(): double
+ retrieveDiscountedPrice(): double
+ retrieveCalculatedTax(): double
+ retrieveTotalCost(): double
+ inputAll(): boolean
+ equals( Automobile ): boolean
+ toString(): String
  
A project called AutomobileTest is created. Two template files, Automobile.java and
AutomobileTest.java, are included and are used to begin the program.

The class Automobile will be used to define or instantiate objects that contain the fields and the methods defined
in the UML diagram above. 

The “set” methods will allow data to be passed into an object. 
The “get” methods will allow data to be retrieved from an object.
The “retrieve” methods are used to calculate the necessary monetary values.
The “inputAll” methods will allow data to be entered (from the keyboard) by a user directly into the instant
variables of an object. I used the Scanner class to handle keyboard input. The “inputAll” method
first prompts for the Automobile make. If no make is entered, the inputAll should return ‘false’, which will
terminate the application.
The “equals” method will return true if the make, model and color of the current object are equal to the make,
model and color of the objects passed as an argument. If either the make, model or color do not match, the
method will return false.
The “toString” method will return a string containing the formatted output. The format of the output is up to you,
but it should contain all of the required information.
