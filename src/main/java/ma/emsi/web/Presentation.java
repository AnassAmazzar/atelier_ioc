package ma.emsi.web;

import ma.emsi.metier.IMetier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {

    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier iMetier = (IMetier) applicationContext.getBean("metier_constInjc");
        System.out.println(iMetier.calcule());*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ma.emsi.metier", "ma.emsi.dao");
        IMetier iMetier = (IMetier) applicationContext.getBean(IMetier.class);
        System.out.println(iMetier.calcule());
    }
}
