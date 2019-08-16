package com.nt.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerater;

public class ConstructorInjection {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerater generater=null;
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");//bean cnfgs file
		factory = new XmlBeanFactory(res); 
		obj=factory.getBean("wish");//this method take bean id goes to internal cache of ioc is there any object having with wish msg if not thengoing to in memory meta data check that is there any bean class having wish bean id found thn by using property name setter injection invoke and it know to load and create object of wishmsggenerater using 0 paraam constr  
		generater=(WishMessageGenerater)obj;//  ioc container set Date by using property tag having date class object    ioc container load and insitate java.util.Date class
		System.out.println("Message::"+generater.generateWishMsg("raja"));
		
	}
//bean id as key class is value
}
