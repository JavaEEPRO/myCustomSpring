package main.java.si.inspirited;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.stereotype.Component;

@Component
public class PromotionsService implements BeanNameAware {

    String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public String getBeanName() {
        return this.beanName;
    }
}