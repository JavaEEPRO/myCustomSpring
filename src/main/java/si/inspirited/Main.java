package main.java.si.inspirited;

import org.springframework.beans.factory.BeanFactory;

public class Main {
    public static void main(String[] args) {

        BeanFactory beanFactory = new BeanFactory();
        beanFactory.instantiate("main.java.si.inspirited");
        beanFactory.populateProperties();
        beanFactory.injectBeanNames();
    }
}
