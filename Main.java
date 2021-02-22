import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//trying to get the amount of students in a class to gauge how many students need to be added
    System.out.println("how many students are in your class?");
			int numStudents = scan.nextInt();
			//trying to get the maximum number of students to figure out how many students can be in one class
		System.out.println("what is the maximum number of students allowed?");
			int maxStudents = scan.nextInt();
			//setting the variable classSizes equal to the maximum amount of students in order to call my method
			int classSizes = classSize(maxStudents);
			System.out.println("Your class size is " + classSizes);
  }
		public static int classSize(int students){
			int class1Size = students;
			if (students == 10)
					return 10;		
			else 
			//If the number is less than the maximum number of students, it adds 1 to the number until it equals the maximum amount of students.
					return class1Size + classSize(students + 1);
				 
		}
}