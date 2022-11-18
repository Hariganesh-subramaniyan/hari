package control;

public class ifelse {
public static void main(String[] args) {
	int age=10;
	int marks=25;
			if(age>=18) {
				if(marks>=45) {
					System.out.println("person eligible to apply for exam");
					}
				else {
					System.out.println("low marks");
				}
			}
				else{
					System.out.println("not eligible");
				}
}
}

