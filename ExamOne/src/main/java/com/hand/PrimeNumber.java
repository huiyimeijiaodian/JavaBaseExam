package com.hand;

public class PrimeNumber {
	public static void main( String[] args ){
		int count=0;
		int[] primeArray=new int[50];
		for(int j=100;j<=200;j++){
			if(isPrime(j)){
				primeArray[count]=j;
				count++;
			}
		}
		System.out.print( "101-200¼ä×Ü¹²ÓÐ"+count+"¸öËØÊý,·Ö±ðÊÇ:" );
		for(int k=0;k<primeArray.length;k++){
			System.out.print(primeArray[k]+",");
		}
        
    }
	public static boolean isPrime(int number){
		for(int i = 2;i<number/2;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	
}
