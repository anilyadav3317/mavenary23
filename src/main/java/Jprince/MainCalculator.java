package Jprince;


public class MainCalculator 
{
	public static void main(String args[]) 
	{
		Calculator objscientificCalculator=new Calculator();
		String StrResult=objscientificCalculator.varHi;
		
		if(StrResult.contains("Hello world")){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		int resultAddition=objscientificCalculator.addition(12, 12);
		
		if(resultAddition==24){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
	}

}
