package day13;

import org.junit.Test;

/**
 * 
 * String 的基本属性练习
 *
 */
public class Demo1 {

	/**
	 * 字符串声明时，在内存中开辟空间问题
	 */
	@Test
	public void test1() {
		String s1 = "abc";//"abc"作为一个常量对象，存储在常量池中，
		String s2 = new String("abc");//这里s2有两个对象，“abc”和new 出来的String对象，
		String s3 = "abc"; //常量池中已经存在这个对象了，所以直接获取这个常量池中的对象地址
		
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
		str.replace("a","DSB");
 	}
	
}
