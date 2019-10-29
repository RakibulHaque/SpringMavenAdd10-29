package com.rakib.MavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new FileSystemXmlApplicationContext(NewFile.xml);
      
      Vehicle car = (Car)context.drive();
      
    }
}
