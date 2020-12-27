package java11exercise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student1234 implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	public Student1234(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
		
	}

	@Override
	public String toString() {
		return  name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "," + getTotal() + ", " + getAverage();
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student123) {
			
			Student123 student = (Student123)o;
			
			return this.name.compareTo(student.name);
		}
			
			
		return -1;
	}
	
	
}//class Student
public class Exercise11_6re {
	static int getGroupCount(TreeSet tset , int from, int to) {
		Student1234 s1 = new Student1234("",1,1,from,from,from);
		Student1234 s2 = new Student1234("",1,1,to,to,to);
		
		System.out.println(tset.subSet(s1, s2));
		 return tset.subSet(s1, s2).size();
	
		
	}
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student1234 && o2 instanceof Student1234) {
					Student1234 s1 = (Student1234)o1;
					Student1234 s2 = (Student1234)o2;
					
					return (int)(s1.getAverage()-s2.getAverage());
				}
				return -1;
			}
		});
		
		set.add(new Student1234("홍길동",1,1,100,100,100));
		set.add(new Student1234("남궁성",1,2,90,70,80));
		set.add(new Student1234("김자바",1,3,80,80,90));
		set.add(new Student1234("이자바",1,4,70,90,70));
		set.add(new Student1234("안자바",1,5,60,100,80));
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("[60~69] :"+getGroupCount(set,60,70));
		System.out.println("[70~79] :"+getGroupCount(set,70,80));
		System.out.println("[80~89] :"+getGroupCount(set,80,90));
		System.out.println("[90~109] :"+getGroupCount(set,90,101));
		
		
	}
}
