package exam03;

public class Container2<T1, T2> {
	private T1 t1;
	private T2 t2;
	
	public void set(T1 t1,T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public T1 getKey(){
		return t1;
	}
	
	public T2 getValue(){
		return t2;
	}
}
