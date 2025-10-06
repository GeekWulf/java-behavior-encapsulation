package models.coparators;

import models.CreditCard;

public class CreditCardNameComparator implements Comparator<CreditCard> {
    @Override
    public int compare(CreditCard o1, CreditCard o2) {
        return (int) (o1.getName().compareTo(o2.getName()));
    }
}
