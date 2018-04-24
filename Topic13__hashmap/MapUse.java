package topic13_hashmap;

import java.util.ArrayList;

public class MapUse {
	
	
	
	public static String maxFreqWord(String input){
		CustomHashMap<String, Integer> map = new CustomHashMap<>();	
		String[] inputArray =  input.split(" ");
		for(String currentString: inputArray){
			if(map.get(currentString)==null){
				map.put(currentString, 1);
			}else{
				map.put(currentString, map.get(currentString)+1);
			}
		}		
		ArrayList<String> keys= map.getKeys();
		int maxFreq = 0;
		String maxFreqString=null;
		for(String key:keys){
			int freq = map.get(key);
			if(freq>maxFreq){
				maxFreq = freq;
				maxFreqString = key;
			}
		}	
		return maxFreqString;
	}
	
	public static void main(String[] args) {
//		CustomHashMap<String,String> map = new CustomHashMap <>();
//		map.put("a","1");
//		map.put("b", "2");
//		map.put("c", "3");
//		map.put("d", "4");
//		map.put("d", "5");
//		map.put("e", "6");
//		
//		System.out.println(map.get("a"));
		
		String input = "hi hi hello hi world code code hi hello hello hi good diwali hi";
		System.out.println(maxFreqWord(input));
	}
}
