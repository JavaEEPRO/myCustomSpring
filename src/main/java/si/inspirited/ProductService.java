package main.java.si.inspirited;

import org.springframework.beans.factory.stereotype.Component;

@Component
public class ProductService {

    private PromotionsService promotionsService;

    public PromotionsService getPromotionsService() {
        return promotionsService;
    }

    public void setPromotionsService(PromotionsService promotionsService) {
        this.promotionsService = promotionsService;
    }
}
