package triangle;

public class TestArr {

	public static void main(String[] args) {
		String a[][] = new String [9][9];
		for(int i=0;i<a.length;i++) {
			for(int k = 0;k<a.length;k++) {
				if(i+k==4 || i+k==6|| i+k==8|| i+k==10|| i+k==12) {
					a[i][k] = "*";
					if( i+k==5 || i+k==7 || i+k==9 || i+k ==11 ) {
						a[i][k]=" ";
					}
					
				}else {
					a[i][k] = " ";
				}
				System.out.print(a[i][k]);
				if(k==8) {
					System.out.println("»Ð");
					}
			
			}
		}

	}

}
