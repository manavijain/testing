package hashmap;
import java.util.HashMap;
import java.util.Map.Entry;
public class hashmap2 {

	public static void main(String[] args) {
		
		HashMap<Integer,student> s = new HashMap<>();
		
		student s1 = new student("Sameer",101,26);
		student s2 = new student("Simran",102,16);
		
		s.put(s1.id,s1);
		s.put(s2.id,s2);
		
		System.out.println("Iterating Over HashMap :");
		
		for(Entry<Integer,student> e : s.entrySet())
		{
			student s4 = e.getValue();
			System.out.println("ID : "+e.getKey()+" Name : "+s4.name+" Age : "+s4.age);
		}

	}

}
