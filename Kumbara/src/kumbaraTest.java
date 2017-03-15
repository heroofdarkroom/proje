import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import para.model.Para;
public class kumbaraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int x=reader.nextInt();
		
	   if(x==1)
	   {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Para para=ctx.getBean("paraId",Para.class);
		
		
		para.hesabaEkle();
		((ClassPathXmlApplicationContext) ctx).close();
	   }
	   else
	   {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
			Para para=ctx.getBean("paraId2",Para.class);
			
		
			para.hesabaEkle();
			((ClassPathXmlApplicationContext) ctx).close();

	   }
		
	   
	}

}
