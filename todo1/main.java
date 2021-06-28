package todo;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Jut todo=new Jut();
		Scanner sc = new Scanner(System.in);
		Object a;
		todo.print();
	while(true) {
		System.out.println("0.시스템 종료");
		System.out.println("1.할일추가");
		System.out.println("2.완료");
		System.out.println("3.목록보기");
		System.out.println("뭘할껀지 숫자로 입력");
		
		try {
		int select=sc.nextInt();
		
		if(select==0) {
			System.out.println("종료");
			break;
		}
		
	if(select==1) {
		
		System.out.println("할일추가");
		System.out.println("종료하려면 exit를 입력하세요");
		loopOut:
		while(true) {
			todo.print();
			System.out.println("종료하려면 exit를 입력하세요");
			System.out.print(">");
			if((a=sc.next()).equals("exit")){
				
				break loopOut;
				}
			todo.insert((String)a);
			
			}
		}// insert end
		
	if(select==2) {
		int b;
		System.out.println("완료입력");
		System.out.println("몇번인지 정수로 입력");
		System.out.println("종료하려면 0을 입력");
		while(true) {
			todo.print();
			System.out.print(">");
			try {
			if((b= sc.nextInt())==0){
				break;
			}
			
			todo.Delete(b);
			}catch(InputMismatchException e) {
				System.out.println("정수로 입력해주세요");
				System.out.println("종료하려면 0을 입력");
				sc.nextLine();
				}
			 catch(IndexOutOfBoundsException e) {
				 System.out.println("해당하는 정수가 없습니다.");
				 System.out.println("종료하려면 0을 입력");
				 sc.nextLine();
			 }
			
		
			}
		}//delete end
	if(select==3) {
		todo.print();
	}//print end
		}//try
		catch(InputMismatchException e) {
			System.out.println("정수로 입력해주세요");
			System.out.println("종료하려면 0을 입력");
			sc.nextLine();
			}
		
		}//while
	}//main

}//class