package datastruct.datastruct.test;

import java.util.Scanner;

import datastruct.datastruct.implement.QueueSLinked;



/**
 * @author KeHao
 * 链式队列测试
 */
public class QueueLinkedTest {

	public static void main(String[] args) {
		QueueSLinked<Student> students=new QueueSLinked<Student>();
		Scanner scan =new Scanner(System.in);
		System.out.print("输入序列长度");
		int t=scan.nextInt();
		System.out.println("输入序列");
		scan(students,t);
		System.out.println(students.getSize());
		printList(students);
		
		//-----------------测试插入
		System.out.print("插入元素");
		System.out.println("输入序列");
		Student s=new Student();
		s.setId(scan.nextInt());
		s.setName(scan.next());
		s.setAge(scan.nextInt());
		s.setAddress(scan.next());
		students.enqueue(s);
		s=null;
		printList(students);
		
		scan.close();
	}
	public static void scan(QueueSLinked<Student> students ,int n){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<n;i++){
			Student s=new Student();
			s.setId(scan.nextInt());
			s.setName(scan.next());
			s.setAge(scan.nextInt());
			s.setAddress(scan.next());
			students.enqueue(s);
			s=null;
		}
	}
	public static void printList(QueueSLinked<Student> students){
		int temp=students.getSize();//长度动态变化，需要提前保存
		for(int i=0;i<temp;i++){
			Student s=(Student) students.dequeue();
			System.out.println(s.toString());
		}
	}
}
