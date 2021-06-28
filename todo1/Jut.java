package todo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

 class values {
	String todo;
	String date;
	
	values(String todo,String date){
		this.todo=todo;
		this.date=date;
		//git test
		
	}
	
}

public class Jut {
	
	ArrayList<Object> arr=new ArrayList<Object>();
	SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	
	
	
	
	Jut(){
		
	}
	public void insert(String in) {
		Date time = new Date();
		arr.add(new values(in,format1.format(time)));
		
		
	}
	public void Delete(int del) {
		
		System.out.println(del+". 완료 ");
		arr.remove(del-1);
		
		
	}
	public void removeAll() {
		arr.clear();
	}
	public void usun(int dd) {
		Object usu =arr.get(dd-1);
		arr.remove(dd-1);
		 arr.add(usu);
	}
	
	public void print() {
		Iterator iter = arr.iterator();
		int num=1;
		System.out.println("할일 갯수:  "+arr.size());
		
		while(iter.hasNext()==true) {
		
			values s=(values)iter.next();
			String ss=num+".  "+s.todo+"    시간:  "+s.date;
			System.out.println(ss);
			num++;
			
		}
		
	}

}
