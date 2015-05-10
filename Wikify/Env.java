import java.util.*;

public class Env {
	private Hashtable<String, String> table;
	protected Env prev;
	private String name;
	
	public Env(Env p, String newName){
		table = new Hashtable<String, String>();
		prev = p;
		if (p == null) { name = newName;}
		else { name = p.name()+"."+newName;}
	}
	
	public String name(){ return this.name;}
	
	public void put(String s, String type){
		table.put(s, type);
	}
	
	public String get(String s){
		for (Env e = this; e != null; e = e.prev){
			String found = e.table.get(s);
			if (found != null) return found;
		}
		return null;
	}
    public String getLocal(String s){
    	String found = this.table.get(s);
    	if (found != null) {return found;}
    	else {return null;}
    }
    
	public void print() {
		System.out.println(this.name + ":" +table.keySet().toString());
	}
	
	
}
