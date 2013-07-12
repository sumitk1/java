package interview.A;

import java.util.*;

public class PriorityQueue {
	
	public static void main(String[] args) {
		
	/*	PriorityQueue<Student> student = new PriorityQueue<Student>();
		Queue<Student> student = new PriorityQueue<Student>();
		
		student.add(new Student("Sumit", 123));
		student.add(new Student("Becky", 17));
		student.add(new Student("Thomas", 442));
		student.add(new Student("Sameer", 112));*/
		//Student student = new Student();

//		for(Student temp: student){
//			System.out.printf("\n Student Name = %s \t Student Rank = %d", temp.name, temp.rank);
//		}
	}
	
class Student implements Comparable<Student>{
		private int rank;
		private String name;
		
		public Student(){
			
		}

		public Student(String name, int rank){
			this.name = name;
			this.rank = rank;
		}
		@Override
		public int compareTo(Student obj){
			if(obj == this) 
				return 0;
			else if(!(obj instanceof Student))
				throw new IllegalArgumentException("Objects not comparable");
			Student temp = (Student)obj;
			return this.rank-temp.rank;
		}
		
		public String toString(){
			return String.format("Name = %s,\t Rank = %d \n", this.name, this.rank);
		}
		
	}
}
