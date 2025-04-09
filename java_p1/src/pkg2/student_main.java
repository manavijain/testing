package pkg2;

public class student_main {
	public static void main(String[] args)
	{
		student s1 = new student();
		s1.setStudent_name("Manavi");
		s1.setStudent_id(100);
		s1.setMarks_cc(93);
		s1.setMarks_ml(84);
		float avg1=s1.avgmarks();
		System.out.println("The average marks scored by "+s1.getStudent_name()+" is "+avg1);
		
		student s2 = new student();
		s2.setStudent_name("Sowmiya");
		s2.setStudent_id(101);
		s2.setMarks_cc(82);
		s2.setMarks_ml(97);
		float avg2=s2.avgmarks();
		System.out.println("The average marks scored by "+s2.getStudent_name()+" is "+avg2);
		
		student s3 = new student();
		s3.setStudent_name("Naibha");
		s3.setStudent_id(102);
		s3.setMarks_cc(94);
		s3.setMarks_ml(87);
		float avg3=s3.avgmarks();
		System.out.println("The average marks scored by "+s3.getStudent_name()+" is "+avg3);
		
		if (avg1 >= avg2 && avg1 >= avg3) {
            System.out.println("With " + avg1 + " , " + s1.getStudent_name() + " is the highest scorer");
        } else if (avg2 >= avg1 && avg2 >= avg3) {
            System.out.println("With " + avg2 + " , " + s2.getStudent_name() + " is the highest scorer");
        } else {
            System.out.println("With " + avg3 + " , " + s3.getStudent_name() + " is the highest scorer");
        }		
	}	
}
