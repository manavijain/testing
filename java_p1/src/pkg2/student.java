package pkg2;

public class student {

		private String student_name;
		private int student_id;
		private int marks_cc;
		private int marks_ml;
		private float avg;
		
		public String getStudent_name() {
			return student_name;
		}
		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		public int getMarks_cc() {
			return marks_cc;
		}
		public void setMarks_cc(int marks_cc) {
			this.marks_cc = marks_cc;
		}
		public int getMarks_ml() {
			return marks_ml;
		}
		public void setMarks_ml(int marks_ml) {
			this.marks_ml = marks_ml;
		}
		
		public float avgmarks()
		{
			avg=(marks_cc+marks_ml)/2;
			return avg;
		}
}
