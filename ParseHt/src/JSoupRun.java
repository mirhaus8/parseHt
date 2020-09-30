import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


public class JSoupRun {
	
	public JSoupRun() {

	}	
	public void calc(String instruction) {
	
		Parser pa = new Parser();
		switch (instruction) {

		case "count":
			String str = reader.nextLine();
			System.out.println(pa.CountNumOfOccur(str));
			break;
		case "num":
			String str2 = reader.nextLine();
			HashMap<String,Integer> a = pa.numOfSubstr(Integer.parseInt(str2));
			for (Map.Entry<String, Integer> entry : a.entrySet()) {
			    System.out.println(entry.getKey()+" : "+entry.getValue());
			}
			break;
		case "size":
			String str3 = reader.nextLine();
			HashMap<String,Integer> a2 = pa.numOfSubstr(Integer.parseInt(str3));
			HashMap<String,Integer> a3 = new HashMap<String,Integer>();
			int max = 0 ;
			for (Map.Entry<String, Integer> entry : a2.entrySet()) {
				if(entry.getValue() == max)
					a3.put(entry.getKey(), entry.getValue());
				else{
					if(entry.getValue() > max){
						max = entry.getValue();
						a3 = new HashMap<String,Integer>();
						a3.put(entry.getKey(), entry.getValue());
					}
					
				}
			}
			for (Map.Entry<String, Integer> entry : a3.entrySet()) {		
			    System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		    break;
		case "names":
			String str4 = reader.nextLine();
			LinkedList<String> l = pa.names(str4);
			//System.out.println(l.size());
			for(int i = 0; i< l.size();i++){
				System.out.println(l.get(i));
			}
			break;
		default:
			System.err.println("Please enter valid action");
			break;
		}

		
		
	}

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Sets namesAnalysis\n==========================");
		JSoupRun ca = new JSoupRun();

		while (true) {
			String instruction = reader.nextLine();
			ca.calc(instruction);
			System.out.println();
		}
	}

}
