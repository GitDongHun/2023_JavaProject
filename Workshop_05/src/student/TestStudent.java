package student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Kim",100,90,85,89);
		Student s2 = new Student("Leem",60,70,99,98);
		Student s3 = new Student("Park",68,86,60,40);
		
		System.out.println(s1.getName()+" Æò±Õ:"+s1.getAvg()+" ÇÐÁ¡:"+s1.getGrade());
		System.out.println(s2.getName()+" Æò±Õ:"+s2.getAvg()+" ÇÐÁ¡:"+s2.getGrade());
		System.out.println(s3.getName()+" Æò±Õ:"+s3.getAvg()+" ÇÐÁ¡:"+s3.getGrade());
	}

}
