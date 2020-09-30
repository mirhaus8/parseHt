import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner; // Import the Scanner class to read text files



public class Parser {	
	
	
	public Parser() {
		
	}
	public LinkedList<String> names(String str){
		 LinkedList<String> l = new LinkedList<String>();
		try {
		    File myObj = new File("filename.txt");
		    Scanner myReader = new Scanner(myObj);
		   
		    	 while (myReader.hasNextLine()) {
				      String data = myReader.nextLine();
				      //data = data.substring(0, data.length()-1);
				      if(str.length() < data.length()){
				    	  System.out.println(data+" " +data.charAt(data.length()-2)+" "+str.length());
				    	  continue;
				      }
				      for(int i = 1; i<= str.length();i++){
				    	  for(int j=0;j<str.length()-i+1;j++){
				    		  String substr = str.substring(j, j+i);
				    		  if(substr.equals(data)){
				    			  l.add(data);
				    		  }
				    	  }
				      }
				      /*for(int j = 1; j < data.length()+1;j++){
				    	 
				    	  for(int k = 0; k < data.length()-j+1;k++){
				    		  //System.out.println(j+k+"fdfd");
				    		  String substr = str.substring(k, j+k);
				    		 // System.out.println(k+" "+ j+" "+(k+data.length()-j-2)+" "+(j+1 < data.length()+1)+" "+(k+1 < data.length()-j-2));
				    		  //System.out.println(substr +" "+j+k);
				    		  System.out.println("input: "+substr+ " line: "+" "+data);
				    		  if(substr.equals(data)){
				    			  l.add(data);
				    		  }
				    		 // System.out.println(substr +" "+j+k);
				    	  }
				      }*/
		    	 }
		    
		    myReader.close();
	   } catch (FileNotFoundException e) {
		    System.out.println("a1");
	   }
		return l;
	}
	public HashMap<String,Integer> numOfSubstr(int n){
		HashMap<String,Integer> a = new HashMap<String,Integer>();
		int count = 0;
		int size = 0;
		try {
		    File myObj = new File("filename.txt");
		    Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		      String data = myReader.nextLine();
		      size = n;
		      
		      int size2 = data.length();
		      for(int i = 0; i < size2-n;i++){
		    	  String substr = data.substring(i, size+i);
		    	  if(a.get(substr) != null)
		    		  a.put(substr, a.get(substr) + 1);
		    	  else
		    		  a.put(substr, 1);
		      }
		    }
		    myReader.close();
	   } catch (FileNotFoundException e) {
		    System.out.println(count);
	   }
		return a;
	}
	
	public int CountNumOfOccur(String s){
		int count = 0;
		int size = 0;
		try {
		    File myObj = new File("filename.txt");
		    Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		      String data = myReader.nextLine();
		      size = s.length();
		      int size2 = data.length();
		      for(int i = 0; i < size2-size; i++){
		    	  String substr = data.substring(i, size+i);
		    	  if(substr.equals(s)){
		    		  count++;
		    		  break;
		    	  }
		    	  
		      }
		      
		     
		    }
		    myReader.close();
	   } catch (FileNotFoundException e) {
		    System.out.println(count);
	   }
		
	return count;
	}
}