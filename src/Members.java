import java.util.*;
public class Members {
	private String name;
	private  String Id;
	private  long phono;

	HashMap<String,String> map = new HashMap<>();
	Members(){
		
	}
	public void add(String name,String id,long phono){
		this.name=name;
		this.Id=id;
		this.phono=phono;
		map.put(id, name);
	}
	public void showMem() {
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public  boolean alreadMem(String id) {
		if(map.containsKey(id)) {
			return true;
		}
		return false;
	}
	public String getName(String id) {
		if(map.containsKey(id)) {
			return map.get(id);
		}
		else {
			return null;
		}
	}

	
}
