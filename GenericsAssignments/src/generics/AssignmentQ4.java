package generics;

public class AssignmentQ4<K,V> {
	
	private K key1 ;
	
	private V value1;

	public AssignmentQ4(K key1, V value1) {
		super();
		this.key1 = key1;
		this.value1 = value1;
	}
	
	
	public K getKey1() {
		return key1;
	}


	public V getValue1() {
		return value1;
	}

	public static void main(String[] args) {
		AssignmentQ4<String, String> sd = new AssignmentQ4<>("Welcome","Generics");
		System.out.println(sd.key1);
		System.out.println(sd.value1);

	}

}
