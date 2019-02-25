package day14_list;


import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
/**
 * 
 * 类名：set的判断元素重复是根据hash值，要判断，需要自定义
 * 	生成的hash值
 * 
 * hashSet 保证元素对象的唯一性：
 * 		1-通过复写hashSet方法，改变要存储对象的hashcode值，
 * 			先判断hash值是否一样
 * 		2-hash值一样时，通过equal方法判断；
 * 
 * @author mahao
 * @date 2018年6月25日
 * Description:
 */
public class SetDemo {
	
	
	@Test
	public void demo1(){
		Set<User> set =new HashSet<User>();
		set.add(new User("user1"));
		set.add(new User("user2"));
		set.add(new User("user3"));
		User user = new User("user3");
		if(!set.contains(user)){
			set.add(user);
		}
		for(User u: set){
			System.out.println(u.getName());
		}
		System.out.println("--------------------");
		set.remove(user);
		
		for(User u: set){
			System.out.println(u.getName());
		}
	}
}
