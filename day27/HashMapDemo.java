package day27;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//Creating HashMap Object
		HashMap<Integer, String> map=new HashMap();
		
		//adding entries in hashmap
		map.put(101, "John");
		map.put(102, "David");
		map.put(103, "Smith");
		map.put(104, "Scott");
		map.put(105, "Alison");
		
		//add more entries
		map.put(106, "Steve");
		map.put(107, "Mike");
		
		System.out.println("Initial Map :"+map);
		
		//size of Map
		System.out.println("Size : "+map.size());
		
		//Get Value from Map
		System.out.println("Value for 103 :"+map.get(103));
		
		//Replace Value
		map.replace(106, "Updated Steve");
		System.out.println("Updated Map :"+map);
		
		map.put(101, "Carla");
		System.out.println("Same Key and Different Value :"+map);
		
		//Remove Entries
		map.remove(101);
		map.remove(102);
		map.remove(103);
		
		System.out.println("After Removing 3 entries :"+map);
		
		//Contains Key
		System.out.println("Contains Key 104 ? :"+map.containsKey(104));
		
		//Contains Value
		System.out.println("Contains Value Alison ? :"+map.containsValue("Alison"));
		
		
		//Only Keys -- keySet () --> returns all keys
		System.out.println("Keys : ");
		for(Integer key: map.keySet())
		{
			System.out.println(key);
		}
		
		//Only Values -- values() ---> returns all values
		System.out.println("Values : ");
		for(String value: map.values())
		{
			System.out.println(value);
		}
		
		//entrySet() ---> return key value pair
		System.out.println("Key - Value Pair :");
		for(Entry<Integer, String> x : map.entrySet())
		{
			System.out.println(x);
			
			System.out.println(x.getKey()+" ---> "+x.getValue());
		}

		//clear
		map.clear();
		System.out.println("After Clear : "+map);
	}

}











