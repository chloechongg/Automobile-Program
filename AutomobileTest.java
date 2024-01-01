public class AutomobileTest 
{
    public static final int MAX_AUTOMOBILES = 4;
    
    public static void main(String[] args) 
    {
        Automobile  automobile[] = new Automobile[MAX_AUTOMOBILES];
        
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
