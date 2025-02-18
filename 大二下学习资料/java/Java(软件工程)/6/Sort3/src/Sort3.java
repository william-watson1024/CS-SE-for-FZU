// Fig. 19.11: Sort3.java
// Sort a list using the custom Comparator class TimeComparator.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort3 
{
   public void printElements()
   {
      List< Time2 > list = new ArrayList< Time2 >(); // create List

      list.add( new Time2(  6, 24, 34 ) );
      list.add( new Time2( 18, 14, 58 ) );
      list.add( new Time2(  6, 05, 34 ) );
      list.add( new Time2( 12, 14, 58 ) );
      list.add( new Time2(  6, 24, 22 ) );
      
      // output List elements
      System.out.printf( "Unsorted array elements:\n%s\n", list );

      // sort in order using a comparator
      Collections.sort( list, new TimeComparator() ); 

      // output List elements
      System.out.printf( "Sorted list elements:\n%s\n", list );
   } // end method printElements
 
   public static void main( String args[] )
   {
      Sort3 sort3 = new Sort3();
      sort3.printElements();
   } // end main
} // end class Sort3


/**************************************************************************
 * (C) Copyright 1992-2009 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
