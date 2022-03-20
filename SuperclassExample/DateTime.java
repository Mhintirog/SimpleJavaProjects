public class DateTime extends Date{

  public int hour, minute, second;
  
  public DateTime(int day , int month , int year , int hour , int minute , int second){
  
      super(day, month, year);
	  this.hour= hour;
	  this.minute = minute;
	  this.second = second;
	  
	  }
	  
	 
	  public String toString(){
		  return String.format("%s || Time: %d:%d:%d", super.toString(), this.hour, this.minute, this.second);
		  
	  }
	  
	  public static void main(String[] args){
	  
	  DateTime dateTime = new DateTime(10, 10, 2021 , 16, 10, 34);
	  System.out.println(dateTime);
	  
	  }
	 
	 
}
	  