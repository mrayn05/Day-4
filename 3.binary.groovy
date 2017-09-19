int power (int base, int exponent) {
	System.out.println("Enter a base number: ");
	int base = Integer.parseInt(System.console().readLine());
	System.out.println("Enter an exponent: ");
	int exponent = Integer.parseInt(System.console().readLine());
	int num = 0;
	
	for (i = 1; i < exponent; i++); {
		num = base * exponent;
	}
	System.out.println(num);
	return num;
}
}

//blaghgsdds