package week3.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int a=13;
		boolean flag = false;
		
		for (int i = 2; i <=a/2; i++) {
		
		if (a%3==0) {
			
			flag=true;
			
			break;
			
		}
		
	}
	  if(flag!=true) {
		  
		  System.out.println("Prime Number");
		  
		}
	  
	  else
	  {
		  System.out.println("Not Prime Number");
		
	}
	  
	}
}
	
	
		
	