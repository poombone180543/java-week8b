package week8b;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Dog{
	
	public static void main(String[]args) {
		
		String name;
		
		int age;
		
		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null,"Hi");
		
		System.out.print("Enter your name >>");
		
		name = input.nextLine();
		
		System.out.print("Enter your age >>");
		
		age = input.nextInt();
		
		System.out.println("I am "+name+" "+age+" year old");
		
	}
}