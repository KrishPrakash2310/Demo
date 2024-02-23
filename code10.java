package task;

public class code10 {
	public static void main(String[] arg) {
		int holidays=0;
		for(int i=1;i<=31;i++) {
			if(
					(i+1)%7==0 ||  i%7==0 ||
					i == 26 || i==25 ||
					(i>14 && i<18)
		) holidays++;
					
				
		}
		System.out.print("Number of Holidays is:"+holidays);
	}
	

}
