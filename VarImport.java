import java.util.Scanner;
class Classroom
{
	int noOfStudents;
	int noOfBoys;
	int noOfGirls;
	String sex;
	String studentName;
	int studentId;
	String grade;
	int numOfStudentsPassed;
	int numOfStudentsFailed;
	
}

class Room
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Classroom s=new Classroom();
		
		System.out.println("Students in Class ");
		s.noOfStudents=sc.nextInt();
		System.out.println("Boys ");
		s.noOfBoys=sc.nextInt();
		System.out.println("Girls ");
		s.noOfGirls=sc.nextInt();
		System.out.println("Passed");
		s.numOfStudentsPassed=sc.nextInt();
		System.out.println("Failed");
		s.numOfStudentsFailed=sc.nextInt();
		System.out.println("First Ranker");
		s.studentName=sc.next();


		System.out.println("Number of Students ="+s.noOfStudents);
		System.out.println("Number of Boys ="+s.noOfBoys);
		System.out.println("Number of Girls ="+s.noOfGirls);
		System.out.println("Number of Students Passed ="+s.numOfStudentsPassed);
		System.out.println("Number of Students failed ="+s.numOfStudentsFailed);
		System.out.println("Name of First Ranker="+s.studentName);

	}
}

