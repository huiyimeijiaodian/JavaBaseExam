package javaexam;
import java.util.Scanner;
public class ExamThree {
	public static void main( String[] args ){
		   int year, month, day;
	       int days = 0;
	       int dayCount = 0;
	       Scanner input=new Scanner(System.in);
	       System.out.print("请输入日期：");
	       String myDate=input.next();
	       String[] arrayDate=myDate.split("-");
//	       System.out.println(arrayDate[0]+","+arrayDate[1]+s","+arrayDate[2]);
	       year=Integer.parseInt(arrayDate[0]);
	       month=Integer.parseInt(arrayDate[1]);
	       day=Integer.parseInt(arrayDate[2]);
	       for (int i = 0; i < month; i++ ) {
           switch (i) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
              days = 31;
              break;
           case 4:
           case 6:
           case 9:
           case 11:
              days = 30;
              break;
           case 2:
              if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                  days = 29;
              } else{
                  days = 28;
              }
              break;
           }
           dayCount += days;
       }
	   System.out.println("你输入的日期是当年的第"+ (dayCount + day) + "天。");

	}
}
