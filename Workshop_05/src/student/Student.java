package student;

public class Student {
	String name;
	int korean;
	int english;
	int math;
	int science;

	public Student() {}
	
	public Student(String name, int korean, int english, int math, int science) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.math=math;
		this.science=science;
	}

	public double getAvg() {
		double sum = korean + english + math + science;
		return sum / 4;
	}

	public String getGrade() {
//		double avg = getAvg();
		int avg = (int) getAvg(); // 93.3 --> 93
		String grade = null;
		if (avg >= 90) {
			grade = "A학점";
		} else if (avg >= 70) {
			grade = "B학점";
		} else if (avg >= 50) {
			grade = "C학점";
		} else if (avg >= 30) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}

		return grade;
	}

	public String getName() {
		return name;
	}

}
