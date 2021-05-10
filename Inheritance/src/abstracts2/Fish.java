package abstracts2;

public class Fish extends Animal {
	Fish() {
		this.kind = "물고기";
	}

	@Override
	public void move() {
		System.out.println("물고기는 헤엄친다.");
	}

	public void swim() {
		System.out.println("물고기는 헤엄친다.");
	}

	@Override
	public void sound() {
		System.out.println("물고기는 뻐끔거리나?");
	}

	@Override
	public void breath() {
		System.out.println("물고기는 아가미로 물속에 있는 산소로 호흡을 한다");
	}
}
