import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
	This is a Student class.
	In this class basic information of single/multiple students can be read from StudentDetails text file.
	After reading the basic information one can update student information by id and can save the updated information in file.
*/

public class Student
{
	int id; //contains roll of a student
	String name; //contains name of a student
	String department; //contains department of a student
	String university; //contains university of a student
	String skip; //a string to skip unused line from file
	double [] GPAsInVariousTerms = new double[8]; //contains GPAs in various term
	double	CGPA; //contains CGPA of a student
	/**
		default constructor
		initializes default values
	*/
	public Student()
	{
		id = 0;
		name = "";
		department = "";
		university = "";
		skip = "";
		for(int i=0; i<GPAsInVariousTerms.length; i++)
			GPAsInVariousTerms[i] = 0.0;
		CGPA = 0.0;
	}
	/**
		load students from StudentDetails text file
	*/
	public int loadStudents(int temp1) throws Exception
	{
		int temp = 0;
		try
		{
			int i = 0;
			File inputFile = new File("StudentDetails.txt");
			Scanner input = new Scanner(inputFile);
			if(temp1 > 0)
			{
				
				for(int j=1; j<=temp1; j++)
				{
					skip = input.nextLine();
				}
			}
			skip = input.nextLine(); //skip Id: line from StudentDetails text file
			System.out.println(skip); //print Id: in console
			id = Integer.parseInt(input.nextLine()); //takes Id from file as a string and converts it to integer
			System.out.println(id); //print Id
			skip = input.nextLine(); //skip Name: line from StudentDetails text file
			System.out.println(skip); //print Name: in console
			name = input.nextLine(); //takes name from file as a string 
			System.out.println(name); //print name
			skip = input.nextLine(); //skip Department: line from StudentDetails text file
			System.out.println(skip); //print Department: in console
			department = input.nextLine(); //takes department from file as a string
			System.out.println(department); //print department
			skip = input.nextLine(); //skip University: line from StudentDetails text file
			System.out.println(skip); //print University: in console
			university = input.nextLine(); //takes university from file as a string
			System.out.println(university); //print university
			skip = input.nextLine(); //skip GPAs in various terms: line from StudentDetails text file
			System.out.println(skip); //print GPAs in various terms: in console
			while(input.hasNextDouble() == true) //runs the loop until there is no GPAs in the line
			{
				GPAsInVariousTerms[i] = input.nextDouble(); //takes GPAs one by one from file
				i++;
			}
			for(int j=0; GPAsInVariousTerms[j]!=0; j++) //prints the GPAs in various terms
			{
				System.out.print(GPAsInVariousTerms[j] + " ");
			}
			System.out.println(); //prints a new line
			if(input.hasNextLine() == true)
				temp = 10;
			else
				temp = 20;
			input.close();
		}
		catch(Exception e)
		{
			
		}
		return temp;
	}
	/**
		method that update student term result
	*/
	public void updateStudentById()
	{
		int temp = 0;
		double GPA = 0.0;
		double [] sub11 = new double[9]; //array that contains grade point of 1st semester 1st term
		double [] sub12 = new double[10]; //array that contains grade point of 1st semester 2nd term
		double [] sub21 = new double[8]; //array that contains grade point of 2nd semester 1st term
		for(int i=0; GPAsInVariousTerms[i]!=0; i++) //counts the term of a student which needed to be updated
		{
			temp = i+1;
		}
		if(temp == 0)
		{
			System.out.println("1st semester 1st term");
			Scanner in = new Scanner(System.in);
			System.out.print("CSE 1100 : Introduction to Computer Systems\tCredit: 1.50\tGrade point: ");
			sub11[0] = in.nextDouble();
			System.out.print("CSE 1107 : Discrete Mathematics\tCredit: 3.00\tGrade point: ");
			sub11[1] = in.nextDouble();
			System.out.print("EEE 1107 : Basic Electrical Engineering\tCredit: 3.00\tGrade point: ");
			sub11[2] = in.nextDouble();
			System.out.print("EEE 1108 : Basic Electrical Engineering Laboratory\tCredit: 1.50\tGrade point: ");
			sub11[3] = in.nextDouble();
			System.out.print("HUM 1107 : English and Human Communication\tCredit: 3.00\tGrade point: ");
			sub11[4] = in.nextDouble();
			System.out.print("HUM 1108 : English Skills Laboratory\tCredit: 0.75\tGrade point: ");
			sub11[5] = in.nextDouble();
			System.out.print("MATH 1107 : Differential and Integral Calculus\tCredit: 3.00\tGrade point: ");
			sub11[6] = in.nextDouble();
			System.out.print("PHY 1107 : Physics\tCredit: 3.00\tGrade point: ");
			sub11[7] = in.nextDouble();
			System.out.print("PHY 1108 : Physics Laboratory\tCredit: 1.50\tGrade point: ");
			sub11[8] = in.nextDouble();
			GPA = (1.50*sub11[0]+3.00*sub11[1]+3.00*sub11[2]+1.50*sub11[3]+3.00*sub11[4]+0.75*sub11[5]+3.00*sub11[6]+3.00*sub11[7]+1.50*sub11[8])/20.25;
			GPAsInVariousTerms[temp] = GPA;
		}
		if(temp == 1)
		{
			System.out.println("1st semester 2nd term");
			Scanner in = new Scanner(System.in);
			System.out.print("CHEM 1207 : Chemistry\tCredit: 3.00\tGrade point: ");
			sub12[0] = in.nextDouble();
			System.out.print("CHEM 1208 : Chemistry Laboratory\tCredit: 0.75\tGrade point: ");
			sub12[1] = in.nextDouble();
			System.out.print("CSE 1201 : Structured Programming\tCredit: 3.00\tGrade point: ");
			sub12[2] = in.nextDouble();
			System.out.print("CSE 1202 : Structured Programming Laboratory\tCredit: 1.50\tGrade point: ");
			sub12[3] = in.nextDouble();
			System.out.print("CSE 1203 : Digital Logic Design\tCredit: 3.00\tGrade point: ");
			sub12[4] = in.nextDouble();
			System.out.print("CSE 1204 : Digital Logic Design Laboratory\tCredit: 1.50\tGrade point: ");
			sub12[5] = in.nextDouble();
			System.out.print("EEE 1217 : Analog Electronics\tCredit: 3.00\tGrade point: ");
			sub12[6] = in.nextDouble();
			System.out.print("EEE 1218 : Analog Electronics Laboratory\tCredit: 0.75\tGrade point: ");
			sub12[7] = in.nextDouble();
			System.out.print("MATH 1207 : Coordinate Geometry and Differential Equations\tCredit: 3.00\tGrade point: ");
			sub12[8] = in.nextDouble();
			System.out.print("ME 1270 : Computer Aided Design Laboratory\tCredit: 0.75\tGrade point: ");
			sub12[9] = in.nextDouble();
			GPA = (3.00*sub12[0]+0.75*sub12[1]+3.00*sub12[2]+1.50*sub12[3]+3.00*sub12[4]+1.50*sub12[5]+3.00*sub12[6]+0.75*sub12[7]+3.00*sub12[8]+0.75*sub12[9])/20.25;
			GPAsInVariousTerms[temp] = GPA;
		}
		if(temp == 2)
		{
			System.out.println("2nd semester 1st term");
			Scanner in = new Scanner(System.in);
			System.out.print("CSE 2101 : Object Oriented Programming\tCredit: 3.00\tGrade point: ");
			sub21[0] = in.nextDouble();
			System.out.print("CSE 2102 : Object Oriented Programming Laboratory\tCredit: 1.50\tGrade point: ");
			sub21[1] = in.nextDouble();
			System.out.print("CSE 2105 : Data Structures and Algorithms\tCredit: 3.00\tGrade point: ");
			sub21[2] = in.nextDouble();
			System.out.print("CSE 2106 : Data Structures and Algorithms Laboratory\tCredit: 1.50\tGrade point: ");
			sub21[3] = in.nextDouble();
			System.out.print("CSE 2113 : Computer Architecture\tCredit: 3.00\tGrade point: ");
			sub21[4] = in.nextDouble();
			System.out.print("EEE 2113 : Digital Electronics\tCredit: 3.00\tGrade point: ");
			sub21[5] = in.nextDouble();
			System.out.print("EEE 2114 : Digital Electronics Laboratory\tCredit: 1.50\tGrade point: ");
			sub21[6] = in.nextDouble();
			System.out.print("MATH 2107 : Fourier Analysis and Linear Algebra\tCredit: 3.00\tGrade point: ");
			sub21[7] = in.nextDouble();
			GPA = (3.00*sub21[0]+1.50*sub21[1]+3.00*sub21[2]+1.50*sub21[3]+3.00*sub21[4]+3.00*sub21[5]+1.50*sub21[6]+3.00*sub21[7])/19.50;
			GPAsInVariousTerms[temp] = GPA;
		}
	}
	/**
		method that computes CGPA
	*/
	public double computeCGPAById()
	{
		double total = 0.0;
		int temp = 0;
		for(int i=0; GPAsInVariousTerms[i]!=0; i++)
		{
			total += GPAsInVariousTerms[i];
			temp = i+1;
		}
		CGPA = total/temp;
		return CGPA;
	}
	/**
		save information of a student in a file
	*/
	public void saveInAFile() throws Exception
	{
		int count = 0;
		try
		{
			File outFile = new File(name + ".txt");
			PrintWriter write = new PrintWriter(outFile);
			write.println("----------Student Information----------");
			write.println("Id : " + id);
			write.println("Name : " + name);
			write.println("Department : " + department);
			write.println("University : " + university);
			write.print("GPAs in various terms : ");
			for(int i=0; GPAsInVariousTerms[i]!=0; i++)
			{
				count += 1;
			}
			for(int i=0; i<count-1; i++)
			{
				write.print(GPAsInVariousTerms[i] + " ");
			}
			write.format("%.2f",GPAsInVariousTerms[count-1]);
			write.println();
			write.format("CGPA : %.2f",computeCGPAById());
			write.close();
		}
		catch(Exception e)
		{
			System.out.println("Error occurred while writing in file.");
		}
	}
	/**
		main method from all the operations start
	*/
	public static void main(String args[]) throws Exception
	{
		Student [] s = new Student[10]; //array of student objects
		int temp1 = 0, temp2 = 0;
		for(int i=0; i<s.length; i++) //initializes the student objects
		{
			s[i] = new Student();
		}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].loadStudents(temp1) < 15) //condition that fulfils if saveInAFile() method should be called for reading another student's information
				temp1 += 10;
			else
				break;
		}
		
		while(true)
		{	
			int loopBreak;
			Scanner in = new Scanner(System.in);
			while(true) //loop that will force one to give '0' or '1'
			{
				System.out.println("#Press '0' to exit the program");
				System.out.println("#Press '1' to proceed on...");
				loopBreak = in.nextInt();
				if(loopBreak == 0 || loopBreak == 1)
					break;
			}
			if(loopBreak == 0) //
				break;
			System.out.print("Please Enter a Id: "); //asks for a Id for operations
			int id = in.nextInt(); //takes the id from user
			for(int i=0; i<s.length; i++) //find the object for given Id
			{
				if(id == s[i].id)
				{
					temp2 = i;
					break;
				}
			}
			System.out.println("#Press '1' to update the information of the student and save the updated details in a file");
			System.out.println("#Press '2' to save the current details in a file");
			System.out.print("Enter: ");
			int caseNumber = in.nextInt();
			switch(caseNumber)
			{
				case 1:
				s[temp2].updateStudentById(); //calls updateStudentById() method for given Id and updates the information
				s[temp2].saveInAFile(); //calls saveInAFile() method for given Id to save the updated information
				break;
				case 2:
				s[temp2].saveInAFile(); //calls saveInAFile() method for given Id to save the information
				break;
				default:
				break;
			}
		}
	}
}