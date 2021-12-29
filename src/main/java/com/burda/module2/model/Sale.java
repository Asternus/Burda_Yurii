package com.burda.module2.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Sale {
    private String type;
    private boolean emptyLine;
    private String series;
    private String diagonal;
    private String model;
    private String screenType;
    private String country;
    private int price;

    public void setCountry(String country) {
        if (country == null) {
            emptyLine = true;
        } else {
            this.country = country;
        }
    }

    public void setDiagonal(String diagonal) {
        if (diagonal == null) {
            emptyLine = true;
        } else {
            this.diagonal = diagonal;
        }
    }

    public void setModel(String model) {
        if (model == null) {
            emptyLine = true;
        } else {
            this.model = model;
        }
    }

    public void setPrice(String price) {
        if (price == null) {
            emptyLine = true;
        } else {
            this.price = Integer.parseInt(price);
        }
    }

    public void setScreenType(String screenType) {
        if (screenType == null) {
            emptyLine = true;
        } else {
            this.screenType = screenType;
        }
    }

    public void setSeries(String series) {
        if (series == null) {
            emptyLine = true;
        } else {
            this.series = series;
        }
    }

    public void setType(String type) {
        if (type == null) {
            emptyLine = true;
        } else {
            this.type = type;
        }
    }
}
