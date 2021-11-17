package tugas1.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTask {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		linkedHashMap.put(23, "Tomori");
		linkedHashMap.put(11, "Ibrahimovic");
		linkedHashMap.put(17, "Leao");
		
		for(Integer key : linkedHashMap.keySet()) {
			System.out.println(linkedHashMap.get(key));
		}
	}

}
