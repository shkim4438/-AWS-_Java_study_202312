package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//@NoArgsConstructor //기본생성자
//@RequiredArgsConstructor
//
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@AllArgsConstructor//전체생성자
@Data
public class Student {

	private String name;//이름
	private int year;//학년
//	private final String address;//final은 잡으면 noArgs를 못잡음.
}
