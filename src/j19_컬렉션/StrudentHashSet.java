package j19_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class StrudentHashSet {

	private static Student seachStudent(Set<Student> students, String searchName) {
		Student student = null;
		
		for(Student s : students) {
			if(s.getName().equals(searchName)) {
				student = s;
				break;
			}
		}
		return student;
	}
	
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		//set: 순서가없고 중복불가 
		//list: 순서가 있으며 중복이가능
		//map: key: 중복이불가(set)  value: 중복이가능(list)
		
		students.add(new Student("이현수", 26));
		students.add(new Student("이상철", 25));
		students.add(new Student("이민호", 23));
		students.add(new Student("김민재", 22));
		
		System.out.println(students);
		
		Student student = seachStudent(students, "김민재");
		
		if(student == null) {
			System.out.println("검색실패!");
		}else {
			System.out.println("검색성공!" + student);
		}
		
	}
	
}
