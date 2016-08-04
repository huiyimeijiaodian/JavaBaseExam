package com.hand;

public class PrimeNumber {
	public static void main( String[] args ){
		int count=0;
		int[] primeArray=new int[21];
		for(int j=100;j<=200;j++){
			if(isPrime(j)){
				primeArray[count]=j;
				count++;
			}
		}
		System.out.print( "101-200总共有"+count+"¸个素数，分别是:" );
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
