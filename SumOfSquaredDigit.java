import java.util.Scanner;
public class SumOfSquaredDigit{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter three digit number: ");
	int threeDigitNumber = input.nextInt();
	int sum = 0;
	int firstDigit = 0;
	int secondDigit = 0;
	int thirdDigit = 0;



while(threeDigitNumber > 99 && threeDigitNumber < 1000 ){
	thirdDigit = threeDigitNumber % 10;
	secondDigit = Math.floor((threeDigitNumber - thirdDigit) / 10) % 10;
	firstDigit = Math.floor(threeDigitNumber / 100);
while(threeDigitNumber == 0){
		sum = Math.pow(firstDigit, 2) +  Math.pow(secondDigit, 2) +  Math.pow(thirdDigit, 2);
	}


}
if(sum == threeDigitNumber ){
	System.out.printf("The squared sum of %d %d %d is equal to %d", firstDigit, secondDigit, thirdDigit, threeDigitNumber);

}
else{
	System.out.printf("The squared sum of %d %d %d is not equal to %d", firstDigit, secondDigit, thirdDigit, threeDigitNumber);
	
}

	
	}

}