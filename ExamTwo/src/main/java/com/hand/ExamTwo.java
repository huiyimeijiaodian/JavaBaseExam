package com.hand;
import java.util.Scanner;
public class ExamTwo {
	public static void main( String[] args ){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入工资：");
		double salary=input.nextDouble();
		double output=0;
		double money=salary-3500;
		if(money>0&&money<1500){
			output=money*0.03;
		}else if(money<4500){
			output=(money-1500)*0.1+1500*0.03;
		}else if(money<9000){
			output=(money-4500)*0.2+3000*0.1+1500*0.03;
		}else if(money<35000){
			output=(money-9000)*0.25+4500*0.2+3000*0.1+1500*0.03;
		}else if(money<55000){
			output=(money-35000)*0.3+9000*0.25+4500*0.2+3000*0.1+1500*0.03;
		}else if(money<80000){
			output=(money-55000)*0.35+35000*0.3+9000*0.25+4500*0.2+3000*0.1+1500*0.03;
		}else{
			output=(money-80000)*0.45+80000*0.35+35000*0.3+9000*0.25+4500*0.2+3000*0.1+1500*0.03;
		}
		System.out.println("所需要缴纳的税费为:"+output);
	}
	
}