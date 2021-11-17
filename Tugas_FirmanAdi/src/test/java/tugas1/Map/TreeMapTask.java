package tugas1.Map;

import java.util.TreeMap;

public class TreeMapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tMap = new TreeMap<Integer,String>();
		tMap.put(23, "Tomori");
		tMap.put(11, "Ibrahimovic");
		tMap.put(17, "Leao");
				
		tMap.remove(17);
		tMap.put(3, "Maldini");
				
		for(Integer item : tMap.keySet()) {
			System.out.println(tMap.get(item));
		}
	}

}
