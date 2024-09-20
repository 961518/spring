package runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Writer;

public class ConstructorArgRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("constructor-arg.xml"); 
//when this object is created logical memory is created inside the JVM and it'll load all the data into t

Writer writer = (Writer) context.getBean("writer");
writer.write();
	}

}
