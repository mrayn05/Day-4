System.out.println("Enter 1 for Binary to Decimal, enter 2 for Decimal to Binary: " );
String choice = System.console().readLine();
if (choice.charAt(0) == "1") {
	System.out.println("Enter a binary number: ")
	String bin = System.console().readLine();
	println binary2decimal(bin);
} else if (choice.charAt(0) == "2") {
	System.out.println("Enter a decimal number: ")
	int dec = Integer.parseInt(System.console().readLine());
	println decimal2binary(dec);
}

	
int power (int base, int exponent) {
	int num = 1;	
	for (i = 1; i <= exponent; i++) {
		num = num * base;
	}
	return num;
}


int power2(int exponent) {
	return power(2, exponent)
}


int binary2decimal(String binary) {
	int num = 0;
	int count = -1;
	for (int i = binary.length(); i-- > 0;)	{
		count ++;
		if (binary.charAt(count) == "1") {
			num = num + power2(i);
			
		}
	}
	return num;
}


String decimal2binary(int decimal) {
	String binary = ""
	while (decimal > 0 ) {
		if (decimal % 2 == 1) {
			binary = binary + "1"
		}else if (decimal % 2 == 0) {
			binary = binary + "0"
		}
		decimal = decimal / 2
	}
	binary = binary.reverse()
	return binary
}	








