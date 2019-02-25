package day14_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * 类名： contains 和 底层equals 方法 
 * 
 * @author mahao
 * @date 2018年6月25日
 * Description:
 */
public class EqualsDemo {
	
	@Test
	public void demo1(){
		List<User> list = new ArrayList<User>(); 
		list.add(new User("user1"));
		list.add(new User("user2"));
		list.add(new User("user3"));
		User user = new User("user3");
		if(!list.contains(user)){
			list.add(user);
		}
		
		for(User u : list){
			
			System.out.println(u.getName());
		}
	}
}
