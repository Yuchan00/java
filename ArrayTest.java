package arraytest;

public class ArrayTest {

	public static void main(String[] args) {
		String name ="마유찬";
	    String hobby ="마유찬";
	    String stu1 = new String("김민재");
	    String stu2 = new String("김민재");
	    System.out.println(name == hobby);
	    System.out.println(stu1 == stu2);
	    //참조타입 값 비교 .equals 사용
	    boolean equ = stu1.equals(stu2);
	    System.out.println(equ);
	     
	}

}
