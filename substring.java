package day3;
import java.util.Scanner;

public class substring {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	//int i=s.nextInt();
	//int j=s.nextInt();
	
String st1=in.nextLine();
String st2=in.nextLine();
int l1=st1.length();
int l2=st2.length();
String s1=st2.substring(l2-2,l2)+st1.substring(2,l1-2)+st2.substring(0,2);
String s2=st1.substring(l1-2,l1)+st2.substring(2,l2-2)+st1.substring(0,2);
System.out.println("BEFORE CHANGE STRINGS ARE:");
System.out.println(st1);
System.out.println(st2);
System.out.println("AFTER CHANGE STRINGS ARE:");
System.out.println(s1);
System.out.println(s2);
}
}