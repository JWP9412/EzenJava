package section03.cloneobject;

/*[��������]
 * ��ü�� �����ϱ� ���ؼ��� Cloneable �������̽��� ���� Ŭ������ �����ؾ� �Ѵ�
 * - Object.clone()�� ���
 * - CloneNotSupportedException ���ܸ� ó��
 * - ������ ��ü�� ���۷�Ʈ �ּҸ� ����
 */
public class Member implements Cloneable {

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member cloneMember() {
		Member clonedMember = new Member(id, name, password, age, adult);
		return clonedMember;
	}

	public Member getMember() {
		Member clonedMember = null;
		try {
			clonedMember = (Member) clone();

		} catch (CloneNotSupportedException e) {
		}
		return clonedMember;
	}

	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

}
