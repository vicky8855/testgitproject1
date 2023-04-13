package testpackage;
import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>studList = new ArrayList<Integer>();
		studList.add(1);
		studList.add(100);
		studList.add(500);
		studList.add(700);
		studList.add(6);
		studList.add(900);
		studList.add(200);
		studList.add(300);
		for(int i:studList) {
			System.out.println(i);
		}

	}

}
