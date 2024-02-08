package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
//setter,getter,equals,ToString 한꺼번에 어노테이션한것을 데이터로 나타냄
@Data
public class Student {

	private int studentCode;
	private final String name;
	private int studentYear;
	@NonNull
	private int age;
}
