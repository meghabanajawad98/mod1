package task3;

public class Driver {
	public static void main(String[] args) {
		CarRacing carRacing = new CarRacing(2);
		String s1=carRacing.carEntry(new Car(1,50));
		String s2=carRacing.carEntry(new Car(1,80));
		String s3=carRacing.carEntry(new Car(2,83));
		String s4=carRacing.carEntry(new Car(3,83));
		

		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		
		
	}
}
