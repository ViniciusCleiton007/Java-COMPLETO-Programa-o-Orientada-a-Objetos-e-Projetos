package entities;

public class Student {
	public  String name;
	public double Grade1;
	public double Grade2;
	public double Grade3;
	
	public double notaFinal(){
		return Grade1 + Grade2 + Grade3;
	}
	
	public double resultado() {
		if (notaFinal() < 60.0) {
			return 60.0 -   notaFinal();
		} else {
			return  0.0;
		}
	}
}
