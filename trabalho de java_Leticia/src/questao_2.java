import java.util.Scanner;
public class questao_2 {
public static void main(String[] args) {
	double a = 4.2;
	double b = 5.6;
	double c = 8.7;
	double PI = 3.14159 ;
	double areat = (a * c) / 2;
	double areac = PI * (c*c);
	double areatr = (a + b) * c / 2 ; 
	double areaq = b * b ;
	double arear = a * b;
	System.out.println("area do triangulo igual á: " + areat);
	System.out.println("area do circulo igual á: " + areac);
	System.out.println("area do trapezio igual á: " + areatr);
	System.out.println("area do quadrado igual á: " + areaq);
	System.out.println("area do retăngulo igual á: " + arear);
	}
}
