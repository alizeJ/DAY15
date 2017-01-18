import java.util.*;

class Student implements Comparable
{
	private String name;
	private int age;
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}


	public int compareTo(Object obj)
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");//抛出异常较为严谨
		Student s = (Student)obj;
		
		if(this.age > s.age)
			return 1;
		if(this.age==s.age)
			return this.name.compareTo(s.name);
		return -1;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
}

class  TreeSetText 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet(new Mycomp());//构造了一个新的TreeSet 用构造器来判断

		ts.add(new Student("lisi02",22));
		ts.add(new Student("lisi02",21));
		ts.add(new Student("lisi007",20));
		ts.add(new Student("lisi09",19));
		ts.add(new Student("lisi06",18));
		//ts.add(new Student("lisi06",18));
		//ts.add(new Student("lisi007",29));
		

		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Student stu = (Student)it.next();
			System.out.println(stu.getName()+"..."+stu.getAge());
		}
	}
}

//定义一个比较器
class Mycomp implements Comparator
{
	public int compare(Object ob1, Object ob2)
	{
		Student s1 = (Student)ob1;
		Student s2 = (Student)ob2;

		int num = s1.getName().compareTo(s2.getName());
		
		if(num == 0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));

		return num;
		
	}
}