package section03.deepclone;

import java.util.Arrays;


/*[��������]
 * 
 */
public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���� ���� ���縦 �ؼ� name,age�� �����Ѵ�
		Member cloned = (Member)super.clone();
		//scores�� ���� �����Ѵ�
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}

	public Member getMember() {
		Member clonedMember = null;
		try {
			clonedMember = (Member) clone();

		} catch (CloneNotSupportedException e) {
		}
		return clonedMember;
	}
	
}
