public class Fib{
	public static void main(String[]args){
		int first = 1;
		int second = 2;
		int sum = 0;
		int evenSum = 0;
		for(int i = 0; i < 32; i++){
			sum=first+second;
			if(second%2==0)
				evenSum+=second;
			first = second;
			second = sum;
			
		}
		System.out.println(evenSum);
	}

}
