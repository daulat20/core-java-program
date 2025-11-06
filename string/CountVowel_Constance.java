package string;

import java.util.Scanner;
//WAP to accept name of the user and print no of characters, 
//no of vowels and no of consonants in it

public class CountVowel_Constance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str=sc.nextLine();
		int count=0;
		int vowel=0;
		int consonants=0;
		int space=0;
		
		for(int i=1;i<str.length();i++) {
			str.charAt(i);
			count++;
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
					||str.charAt(i)=='u') {
				vowel++;
				
			}else if(str.charAt(i)==' '){
				space++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Number of Charecter : "+count);
		System.out.println("Number of vowel : "+vowel);
		System.out.println("Number of Consonants : "+consonants);
		System.out.println("Number of Space : "+space);

		

		
	}

}
