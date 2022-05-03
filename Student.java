package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Student {
	HashMap<String,String>dataList=new HashMap<String,String>();
	String addStudentDetails(String name,String id) {
		if(dataList.containsKey(name)) {
			return"id generation failed,name is already present in the databade";
		}
		else
		{
		dataList.put(name, id);
		return "id Generated";
		}
		}
	String deleted(String name) {
		if(!dataList.containsKey(name)) {
			return "id not found";
		}
		else {
			dataList.remove(name);
			return "id deleted Sucessfully";
		}
	}
	String searchld(String name) {
		if(!dataList.containsKey(name)) {
			return "id not found";
		}
		else {
			dataList.remove(name);
			return name;
		}
	}
	public static void main(String[]args) {
		Student  s = new Student();
		System.out.println(s.addStudentDetails("megha", "123"));
		System.out.println(s.addStudentDetails("deepa", "234"));
		System.out.println(s.deleted("megha"));
		System.out.println(s.searchld("deepa"));
	}
}
