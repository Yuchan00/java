package arraytest;

public class ArrayTest {

	public static void main(String[] args) {
		String name ="������";
	    String hobby ="������";
	    String stu1 = new String("�����");
	    String stu2 = new String("�����");
	    System.out.println(name == hobby);
	    System.out.println(stu1 == stu2);
	    //����Ÿ�� �� �� .equals ���
	    boolean equ = stu1.equals(stu2);
	    System.out.println(equ);
	     
	}

}
