package casting;

public class Bus extends Vehicle { //�ڽ�Ŭ����
	int station;
	
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
		station++;
	}
	
	
	public void run(int station) {
		System.out.println("������ �޸��ϴ�. "+station);
		this.station += station;
	}
	
	int getStation() {
		return station;
	}

}
