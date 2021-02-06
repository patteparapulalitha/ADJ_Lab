package Collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stlist = new ArrayList<Student>();
		Student st = new Student();
		st.setName("Lalitha");
		st.setRegdno("1281");
		st.setBranch("IT");
		
		stlist.add(st);
		
		Student st2 = new Student();
		st2.setName("Abitha");
		st2.setRegdno("1282");
		st2.setBranch("IT");
		
		stlist.add(st2);
		
		for(int i = 0;i < stlist.size();i++){
			Student st3 = stlist.get(i);
			System.out.println(st3.getRegdno());
			System.out.println(st3.getName());
			
			
		}
		
		

	}

}
