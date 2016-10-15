import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student
{
	int id;
	String name, department, university, skip;
	double [] GPAsInVariousTerms = new double[8];
	double	CGPA;
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
		load students from file
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
			skip = input.nextLine();
			System.out.println(skip);
			id = Integer.parseInt(input.nextLine());
			System.out.println(id);
			skip = input.nextLine();
			System.out.println(skip);
			name = input.nextLine();
			System.out.println(name);
			skip = input.nextLine();
			System.out.println(skip);
			department = input.nextLine();
			System.out.println(department);
			skip = input.nextLine();
			System.out.println(skip);
			university = input.nextLine();
			System.out.println(university);
			skip = input.nextLine();
			System.out.println(skip);
			while(input.hasNextDouble() == true)
			{
				GPAsInVariousTerms[i] = input.nextDouble();
				i++;
			}
			System.out.println(GPAsInVariousTerms[0] + " " + GPAsInVariousTerms[1]);
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
		method that update student term
	*/
	public void updateStudentById()
	{
		int temp = 0;
		double GPA = 0.0;
		double [] sub11 = new double[9];
		double [] sub12 = new double[10];
		double [] sub21 = new double[8];
		for(int i=0; GPAsInVariousTerms[i]!=0; i++)
		{
			temp = i+1;
		}
		if(temp == 0)
		{
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
			System.out.println("Error occured while writing in file.");
		}
	}
	/**
		main method from all the operations start
	*/
	public static void main(String args[]) throws Exception
	{
		Student [] s = new Student[10];
		int temp1 = 0, temp2 = 0;
		for(int i=0; i<s.length; i++)
		{
			s[i] = new Student();
		}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].loadStudents(temp1) < 15)
				temp1 += 10;
			else
				break;
		}
		
		while(true)
		{	
			int loopBreak;
			Scanner in = new Scanner(System.in);
			while(true)
			{
				System.out.println("#Press '0' to exit the program");
				System.out.println("#Press '1' to procced on...");
				loopBreak = in.nextInt();
				if(loopBreak == 0 || loopBreak == 1)
					break;
			}
			if(loopBreak == 0)
				break;
			System.out.print("Please Enter a Id: ");
			int id = in.nextInt();
			for(int i=0; i<s.length; i++)
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
				s[temp2].updateStudentById();
				s[temp2].saveInAFile();
				break;
				case 2:
				s[temp2].saveInAFile();
				break;
				default:
				break;
			}
		}
	}
}