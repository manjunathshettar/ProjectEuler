public class prob6{
	public static void main(String[]args){
		int sumSquares = 0;
		int squaresSum = 0; 
		for(int i =1; i<101;i++){
			sumSquares += i*i;
		}
		for(int i = 1; i<101;i++){
			squaresSum+=i;
		}
		squaresSum = squaresSum*squaresSum;
		System.out.println(squaresSum-sumSquares);
	}

}
