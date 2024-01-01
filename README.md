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

Automobile {
make=Chevy
model=Camaro
year=1969
color=Silver
basePrice=12500.0
discountRate=0.1
taxRate=0.0875
}
discountedPrice=$ 11250.00
salesTax=$ 984.37
totalCost=$ 12234.38
You MUST use the main method in the “AutomobileTest” class below to test your class.
public class AutomobileTest {
public static final int MAX_AUTOMOBILES = 4;
public static void main(String[] args)
{
Automobile automobile[] = new Automobile[MAX_AUTOMOBILES];
automobile[0] = new Automobile();
automobile[0].setMake("Chevy");
automobile[0].setModel("Camaro");
automobile[0].setYear(1969);
automobile[0].setColor("Silver");
automobile[0].setBasePrice(12500.00);
automobile[0].setDiscountRate(10);
automobile[0].setTaxRate(8.75);
System.out.println(automobile[0]);
for ( int lp=1; lp<MAX_AUTOMOBILES; lp++ )
{
automobile[lp] = new Automobile();
System.out.println( "Automobile No. " + ( lp+1 ));
if ( automobile[lp].inputAll())
{
if ( automobile[lp].equals( automobile[0] ))
{
System.out.println( "Automobile Match : true" );
}
else
{
System.out.println( "Automobile Match : false" );
}
System.out.println( automobile[lp] );
}
else
{
System.out.println( "NO Information for Automobile " + ( lp+1 ));
lp = MAX_AUTOMOBILES;
}
}
}
}

Sample Output
Automobile{
make=Chevy
model=Camaro
year=1969
color=Silver
basePrice=12500.0
discountRate=0.1
taxRate=0.0875
}
discountedPrice=$ 11250.00
salesTax=$ 984.37
totalCost=$ 12234.38
Automobile No. 2
Enter Automobile Make : Chevy
Enter Automobile Model : Chevette
Enter Automobile Year : 1977
Enter Automobile Color : Red
Enter Automobile Baseline Price: $3400
Enter Automobile Discount Rate : 8
Enter Automobile Tax Rate : 8.75
Automobile Match : false
Automobile{
make=Chevy
model=Chevette
year=1977
color=Red
basePrice=3400.0
discountRate=0.08
taxRate=0.0875
}
discountedPrice=$ 3128.00
salesTax=$ 273.70
totalCost=$ 3401.70
Automobile No. 3
Enter Automobile Make :
NO Information for Automobile 3

