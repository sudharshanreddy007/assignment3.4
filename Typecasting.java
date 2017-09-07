package typecastingbtwdifferentvariables;

public class Typecasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we have taken short and byte to initialize the values\\	
		short s = 20;
		byte b = 30;
		int I = (int)s + (int)b;
		// here by casting the values of short and byte we are inserting these values in integer data type,
		//by adding these values we are assigning them in integer " i " data type
				
		System.out.println("value of int I is  "+I);
		long L = (long)I + (long)s;
		//by taking long data type we are inserting the the values of integer  and short in them,
		//by adding we assign them in "l"
		
		System.out.println("value of long L is  "+L);
		float F = (float)I + (float)L; 
		// the values of long and integer are converted into float  and by adding these values ,
		//we are  assigning to the variable of float that is "F". 
		
		System.out.println("value of float F is  "+F);
		double D =(double)F + (double)L;
		//the values of float and long are converted into long and these values are added ,
		//then the value is assigned to the variable of double that is "D". 
		
		System.out.println("value of double D is  "+D);
		

	}

}

