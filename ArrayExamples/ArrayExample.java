public class ArrayExample {

public static void main (String args[]){


int[] a = new int[10];


//Gia gemisma tou pinaka 
    for (int i=0; i<a.length; i++)
   {
	a[i] = i +1;
   }

    for(int i = 0; i<a.length; i++)
   {
	System.out.println(a[i]);
   }


     int [][] b = new int[3][2];
		
     int k = 1;
		
       for ( int i = 0; i<b.length; i++)
		{
		for ( int j = 0; j <b[i].length; j++)
			{
				b[i][j] = k;
				k++;
		    }
		}
		
      for ( int i = 0; i<b.length; i++)
		{
		 for ( int j = 0; j <b[i].length; j++)
			{
				
				System.out.println(b[i][j] + "\t");
		    }
			
			System.out.println("\n");
		}


    int[][] c = new int [10][];

     
	 for (int i= 0; i<c.length; i++){
	    c[i] = new int [i+1];
       }

       for ( int i = 0; i<c.length; i++)
		{
			for ( int j = 0; j <c[i].length; j++)
			{
				c[i][j] = j + 1;
				System.out.println(c[i][j] + "\t");
			}
			System.out.println();
		} 
		
}
}
