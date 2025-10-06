package models.measurers;

import models.CreditCard;

public class BalanceMeasurer implements Measurer<CreditCard>{
    @Override
    public double measure(CreditCard object) {
        return  object.getBalance();
    }
}
