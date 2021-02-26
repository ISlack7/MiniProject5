import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//trying to get the amount of students in a class to gauge how many students need to be added
    System.out.println("How many students are in your class?");
			int numStudents = scan.nextInt();
			//setting the maximum amount of students equal to ten
			int maxStudents = 10;
			//setting the variable classSizes equal to the maximum amount of students in order to call my method
			int classSizes = classSize(maxStudents);
			System.out.println("Your class size is " + classSizes);
  }
		public static int classSize(int students){
			int class1Size = students;
			if (students == 10){
				return 10;
			}
			else if(students > 10){
				return class1Size - classSize(students - 1);
			}
					
			else {
			//If the number is less than the maximum number of students, it adds 1 to the number until it equals the maximum amount of students. It knows that the maximum amount of students is ten so if the number is less than ten, it runs this until the class size/students is equal to ten.
					return class1Size + classSize(students + 1);
			}

					
				 
		}
}