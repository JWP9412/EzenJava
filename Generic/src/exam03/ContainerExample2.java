package exam03;

public class ContainerExample2 {

	public static void main(String[] args) {
		Container2<String, String> c1 = new Container2<String,String>();
		c1.set("kim", "sniper");
		String name1 = c1.getKey();
		String job = c1.getValue();
		System.out.printf("c1 name1(%s) job(%s)\n",name1,job);
		
		Container2<String, Integer> c2 = new Container2<String,Integer>();
		c2.set("lee", 35);
		String name2 = c2.getKey();
		int age = c2.getValue();
		System.out.printf("c2 name2(%s) age(%d)\n",name2,age);
		
	}

}
