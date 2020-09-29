import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class neckDB {
	public static List<String> getWordList() {
		 String line;
		 String fName="wordList.txt";
		 List<String> wordList = new ArrayList<String>(); // Create an ArrayList object 
		 
		 try {
			FileReader fileReader=new FileReader(fName);
			BufferedReader bufferedReader=new BufferedReader(fileReader);

			while((line=bufferedReader.readLine())!=null) {
				wordList.add(line);		
			}   
			bufferedReader.close();
		}
		catch(IOException ex){
			System.out.println("File "+fName+" could not be read");
			System.exit(0);
		}	
		 return wordList;
	}

}
