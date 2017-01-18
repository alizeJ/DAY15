/*
练习：按照字符串长度排序。

字符串本身具备比较性。但是它的比较方式不是所需要的。

这时就只能使用比较器。

*/
import java.util.*;

class  TreeSetDemo2
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new Length());
		t.add("aaa");
		t.add("ac");
		t.add("b");
		t.add("bbf");
		t.add("hahaha");
		t.add("abc");
		
		sop(t);

	}

	public static void sop(Object obj)
		{
			System.out.println(obj);
		}
}

class Length implements Comparator
{
	public int compare(Object ob1, Object ob2)
	{
		String s1 = (String)ob1;
		String s2 = (String)ob2;

		int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));
		
		if (num == 0)
		{
			return	s1.compareTo(s2);
		}
		return num;

	}
}
