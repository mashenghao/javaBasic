import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


public class Demo {
	
	/**
	 * 日历类Calendar 的使用
	 */
	@Test
	public void demo4(){
		Calendar ca= Calendar.getInstance();
		ca.add(Calendar.YEAR, -1);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		/*
		 * 获取任意一年的二月多少天
		 * 
		 * 1.设置要获取的月份，设置为3月1号
		 * 2.月份日期往前偏移一天，就是2月的最后一天
		 */
		ca.set(2018, 2, 1);
		ca.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		
		Calendar c= Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(c);
		
	}
	
	/**
	 * 可变参数，要放在最后
	 */
	@Test
	public void demo2(){
		show("ss",2,3,5,64);
	}
	
	public static void show(String s, int ...arr){
		for(int a :arr){
			System.out.println(a);
		}
	}
	
	
	/**
	 * Date使用
	 */
	@Test
	public void demo3(){
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date()));
	} 
	
	
	
}
