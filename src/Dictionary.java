import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Dictionary {
	
		public String randomWord(){
		Random random = new Random();
		
		String line = "";
		ArrayList<String> legalWords = new ArrayList<String>();
		
			try { 
				FileReader dictionary = new FileReader("src/dictionary.txt");
				BufferedReader bufferedReader = 
		                new BufferedReader(dictionary);

		            while((line = bufferedReader.readLine()) != null) {
		            	
		            	for(int n = 0; n<line.length()-1; n++){
		                	if (line.charAt(n) == ' ' && (n> 1 || line.charAt(n) == 'A' || line.charAt(n) == 'I')){
		                		if(line.substring(n+2,n+4).equalsIgnoreCase("ab") 
		                				|| line.substring(n+2,n+4).equalsIgnoreCase("sy")
		                				|| !(line.charAt(n-1) >= 'A' 
		                				&& line.charAt(n-1) <= 'Z' 
		                				|| line.charAt(n-1) >= 'a' 
		                				&& line.charAt(n-1) <= 'z')
		                				|| (line.charAt(0) == '-')){
		                			break;

		                		}else{
		                			legalWords.add(line.substring(0,n));
		                			break;
		                		
		                		}
		                		
		                	
		                		
		                	}
		            	
		                }   
		            }

		            // Always close files.
		            bufferedReader.close();     
				}catch(FileNotFoundException ex) {
	                           
				}
	        	catch(IOException ex) {
	                    
			
	        	}
			
			return legalWords.get(random.nextInt(legalWords.size()-1));
		}
		}

