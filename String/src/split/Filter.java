package split;
import java.lang.*;
import java.util.*;
class Filter{
	String Result="";
	static String abuseControl(String word) {
		String has="";
		for(int i = 0;i<word.length();i++)
			has+="#";
		return has;
	}

	String StringSensor(String data,String[] array) {
		String[] wordset = data.split(" ");
		for(int i = 0; i<wordset.length;i++) {
			if(Arrays.asList(array).contains(wordset[i])) {
				wordset[i]=abuseControl(wordset[i]);
			}
			
		}
		
		for(String s:wordset)
			Result+=s+" ";
		return Result;
	}
}
