/*
��ϰ�������ַ�����������

�ַ�������߱��Ƚ��ԡ��������ıȽϷ�ʽ��������Ҫ�ġ�

��ʱ��ֻ��ʹ�ñȽ�����

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
