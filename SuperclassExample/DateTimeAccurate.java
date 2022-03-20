public class DateTimeAccurate extends DateTime{
	
	 public int millisecond;
  
     public DateTimeAccurate(int day , int month , int year , int hour , int minute , int second, int millisecond){
  
      super(day, month, year, hour, minute, second);
	  this.millisecond = millisecond;
	  
	  }

	  public String toString(){
		  return String.format("%s:%d", super.toString() ,this.millisecond);
		  
	  }
	  
	  public static void main(String[] args){
	  
	  DateTimeAccurate dateTimeAccurate = new DateTimeAccurate(10, 10, 2021 , 16, 10, 34, 56);
	  System.out.println(dateTimeAccurate);
	  
	  }
	  
}