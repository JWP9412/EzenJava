package section03;

public class Key {
	public int number;
	public int age;
	
	public Key(int number,int age) {
		this.number = number;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.printf("Key:equals(%d), number(%d), age(%d)\n"
				,super.hashCode(), this.number,this.age);
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number && this.age == compareKey.age) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		System.out.printf("Key:hashCode(%d), number(%d), age(%d)\n",super.hashCode(), this.number ,this.age);
		return Integer.parseInt(String.valueOf(this.number) + String.valueOf(this.age));
		//return this.number;
	}
	
}
