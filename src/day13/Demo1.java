package day13;

import org.junit.Test;

/**
 * 
 * String �Ļ���������ϰ
 *
 */
public class Demo1 {

	/**
	 * �ַ�������ʱ�����ڴ��п��ٿռ�����
	 */
	@Test
	public void test1() {
		String s1 = "abc";//"abc"��Ϊһ���������󣬴洢�ڳ������У�
		String s2 = new String("abc");//����s2���������󣬡�abc����new ������String����
		String s3 = "abc"; //���������Ѿ�������������ˣ�����ֱ�ӻ�ȡ����������еĶ����ַ
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
	}
	
	/**
	 * String 
	 */
	@Test
	public void test2() {
		String str = "abda";
		str.indexOf("aa");
		str.contains("aa");
	}
	
}
