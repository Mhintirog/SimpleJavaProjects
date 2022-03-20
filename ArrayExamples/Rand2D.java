import java.util.*;

public class Rand2D {

public static void main(String[] args) {
    
	int values[][] = new int[3][4];
    
	for (int i = 0; i < values.length; i++) {
       
        for (int j = 0; j < values[i].length; j++) {
           
            values[i][j] = ((int) (Math.random() *5));
            System.out.print(values[i][j] +"\t");
        }
        
        System.out.println();
    }

}
}


