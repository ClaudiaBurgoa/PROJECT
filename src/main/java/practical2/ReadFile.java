package practical2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
boolean b = false;

	public static void main(String[] args) {

		System.out.println("Enter the File Name you want to OPEN (dictionary): ");
		Scanner userInput = new Scanner(System.in);
		String FileDesired = ("C:\\Users\\claud\\October2021_Selenium\\ReadFile\\Files\\"
				+ userInput.next().toLowerCase() + ".txt");

		String text = doesFileExist(FileDesired);
		System.out.println(text);
		String str = text;
		substring(str); 
	}

//		FileInputStream inputFile = new FileInputStream ("C:\\Users\\claud\\October2021_Selenium\\ReadFile\\Files\\Dictionary.txt");  
//		Scanner in = new Scanner(inputFile);
//		
//		while(in.hasNext()) {
//		System.out.println(in.nextLine());	

	public static String doesFileExist(String file) {
		String text = "";
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				text = text + s.nextLine();
			}
			System.out.println("Your File exist!");
		} catch (FileNotFoundException e) {
			System.out.println("THIS FILE DOES NOT EXIST!!!");
		}
		return text;

	}

	private static void substring(String str)  {
		String demarcation1 = ",";
		String demarcation2 = "-";
		//String substrings1[] = str.split(/[-,]/g ); 
		
			//System.out.println("separated by comma: " + substrings1[]);
//		for (int i = 0; i<substrings1.length; i++) {
//		
//			String word1 = substrings1[i].toString();
//			
//			System.out.println(word1);
//			
//			int starIndex = 0, endIndex;
//		    endIndex = word1.indexOf(demarcation2, starIndex);
//		   
//		    while (endIndex != -1) {
//			String parts = word1.substring(starIndex, endIndex);
//			System.out.println("WORD: " + parts);
//			starIndex = endIndex + 1;
////			endIndex = str.indexOf(demarcation1, starIndex);
//		}
		//String parts = str.substring(starIndex);
		//System.out.println(parts);
		//}
//		int arr[] = new int [5];
//		System.out.println(arr);
		
	}
		
		
		
//		
//	
		
	

}
