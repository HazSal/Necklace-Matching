
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainCalc {
	
	public static void checkNeckMatch(){
		System.out.println("Please enter the first string.");
		Scanner sc = new Scanner(System.in);
		String firstMsg = sc.nextLine();
		//List<String> firstMsg =  new ArrayList<String>(Arrays.asList(input.split("")));
		String msgCheck = "";
		
		
		System.out.println("Please enter the second string.");
		sc = new Scanner(System.in);
		String secondMsg = sc.nextLine();
		boolean isMatch = true;
	
		for(int i = 0; i<firstMsg.length(); i++){
			if(i==0){
				isMatch=false;
				msgCheck = firstMsg.substring(0,firstMsg.length());
				//System.out.println(msgCheck);
				if(msgCheck.equals(secondMsg)){
					isMatch=true;
					break;
				}
			}else{
				msgCheck = firstMsg.substring(0,firstMsg.length()-i);
				msgCheck = firstMsg.substring(firstMsg.length()-i,firstMsg.length())+msgCheck;
				//System.out.println(msgCheck);
				if(msgCheck.equals(secondMsg)){
					isMatch=true;
					break;
				}
			}
		}
		
		if(isMatch == true){
			System.out.println("The two necklace strings describe the same necklace.");
			
		}else{
			System.out.println("The two necklace strings DO NOT describe the same necklace.");
	
		}
	}
	
	public static void checkNeckRepeat(){
		System.out.println("Please enter a string that repeats itself when shifted to the right.");
		Scanner sc = new Scanner(System.in);
		String firstMsg = sc.nextLine();
		String msgCheck = "";
		int count = 0;
	
		for(int i = 0; i<firstMsg.length(); i++){
				msgCheck = firstMsg.substring(0,firstMsg.length()-i);
				msgCheck = firstMsg.substring(firstMsg.length()-i,firstMsg.length())+msgCheck;
				//System.out.println(msgCheck);
				if(msgCheck.equals(firstMsg) || msgCheck.equals("")){
					count++;
				}
		}
		System.out.println("The amount of times the string repeats itself is: " +count);
	}
	
	public static void checkNeckList(){
			List<String> wList =neckDB.getWordList();
			String msgCheck = "";
			boolean isMatch = true;
			int count = 0;
			final long startTime = System.currentTimeMillis();
			System.out.println("Calculating matching word sets...");

			for(int i = 0; i<wList.size(); i++){
				for(int x = i; x < wList.size(); x++){
					if (i != x){
						msgCheck = wList.get(x).substring(0,wList.size());
					}
			}
		}
			
			System.out.println("The amount of matching sets were: " + count);
			final long endTime = System.currentTimeMillis();
			System.out.println("Total execution time: " + (endTime - startTime)/1000 + " seconds.");
	}
}