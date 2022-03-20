import java.util.ArrayList;

public class ListExample{
  
   public static void main(String[] args){
   
    ArrayList<String> myArrayList = new ArrayList<String>();
	
	myArrayList.add("One");
	myArrayList.add("Two");
	myArrayList.add("Three");
	
	for (int i = 0; i < myArrayList.size(); i++){
		System.out.println(myArrayList.get(i) + "\n");
		
	}
	
	/*myArrayList.add(0, "Minus One");
	myArrayList.add(1, "Zero");*/
	
	myArrayList.remove(1);
	
	for (int i = 0; i < myArrayList.size(); i++){
		System.out.println(myArrayList.get(i));
		
	}
	
	for(String value : myArrayList){
		System.out.println(value);
		
	}
    
   }

}
