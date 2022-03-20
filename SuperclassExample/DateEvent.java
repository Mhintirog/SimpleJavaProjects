public class DateEvent extends Date{

  public String name;
  
  public DateEvent(int day , int month , int year , String name){
  
      super(day, month, year);
	  this.name = name; 
	  
	  }
	  
	 
	  public String toString(){
		  return String.format("%s => %s ", super.toString(), this.name);
		  
	  }
	  
	  public static void main(String[] args){
	  
	  DateEvent e1 = new DateEvent(25,3,1821,"epeteios1821");
	  DateEvent e2 = new DateEvent(28,10,1821,"epeteios1940");
	  System.out.println(e1);
	  System.out.println(e2);
	 
	  
	  }
	 
	 
}