package models.comparators;

import models.CreditCard;

public class BalanceComparator implements Comparator<CreditCard> {
    @Override
    public int compare(CreditCard o1, CreditCard o2) {
        return (int) (o1.getBalance() - o2.getBalance());
    }
}
