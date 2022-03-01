package com.burda.hw11;

public abstract class Phone implements PhoneMenu {

    protected Colour colour;
    protected Years years;


    public Phone(Colour colour, Years years) {
        this.colour = colour;
        this.years = years;
    }

    abstract public String call();

    abstract public String sms();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (colour != phone.colour) return false;
        return years == phone.years;
    }

    @Override
    public int hashCode() {
        int result = colour.hashCode();
        result = 31 * result + years.hashCode();
        return result;
    }
}
