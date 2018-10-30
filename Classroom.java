class Classroom
{
	int noOfStudents;
	static String department;
	static String proffesor;
	int noOfBoys;
	int noOfGirls;
	String nameOfTheStudent;
	int studentId;
	int numOfStudentsPassed;
	int numOfStudentsFailed;
}
class Room
{
	public static void main(String[] args) 
	{
		Classroom.department="Computer Science";
		Classroom.proffesor="Dr.Pittman";

		Classroom s=new Classroom();
		Classroom s1=new Classroom();
		Classroom s2=new Classroom();

		s.noOfStudents=25;
		s.noOfBoys=14;
		s.noOfGirls=11;
		s.numOfStudentsPassed=20;
		s.numOfStudentsFailed=5;

		s1.nameOfTheStudent="Deepthi";
		s1.studentId=8125;

		s2.nameOfTheStudent="Lavanya";
		s2.studentId=8113;

		
		System.out.println("Number of Students ="+s.noOfStudents);
		System.out.println("Number of Boys ="+s.noOfBoys);
		System.out.println("Number of Girls ="+s.noOfGirls);
		System.out.println("Number of Students Passed ="+s.numOfStudentsPassed);
		System.out.println("Number of Students failed ="+s.numOfStudentsFailed);

		System.out.println("First Rank Student = "+s1.nameOfTheStudent);
		System.out.println("First Ranker ID number ="+s1.studentId);
		System.out.println("Seccond Rank Student ="+s2.nameOfTheStudent);
		System.out.println("Second Rank Student ="+s2.studentId);

		System.out.println("Department="+Classroom.department);
		System.out.println("Proffesor="+Classroom.proffesor);

		
	}
}

Output

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>javac Classroom.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java Room
Number of Students =25
Number of Boys =14
Number of Girls =11
Number of Students Passed =20
Number of Students failed =5
First Rank Student = Deepthi
First Ranker ID number =8125
Seccond Rank Student =Lavanya
Second Rank Student =8113
Department=Computer Science
Proffesor=Dr.Pittman
