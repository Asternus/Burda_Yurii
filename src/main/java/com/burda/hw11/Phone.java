package com.burda.hw11;

import java.util.Arrays;
import java.util.Objects;

public abstract class Phone implements PhoneMenu {

    protected Variety variety;
    protected Years years;


    public Phone(Variety variety, Years years) {
        this.variety = variety;
        this.years = years;
    }

    abstract String call();

    abstract String sms();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (variety != phone.variety) return false;
        return years == phone.years;
    }

    @Override
    public int hashCode() {
        int result = variety.hashCode();
        result = 31 * result + years.hashCode();
        return result;
    }
}
