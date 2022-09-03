package com.burda.module4.model;

public class UserAccount {

    private String username;

    private double allMoney;

    private int totalWin;

    private int totalLose;

    private double middle;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void addAllMoney(double allMoney) {
        this.allMoney += allMoney;
    }

    public int getTotalWin() {
        return totalWin;
    }

    public void addTotalWin(int totalWin) {
        this.totalWin += totalWin;
    }

    public int getTotalLose() {
        return totalLose;
    }

    public void addTotalLose(int totalLose) {
        this.totalLose += totalLose;
    }

    public double getMiddle() {
        return middle;
    }

    public void setMiddle() {
        if ((totalWin + totalLose) != 0) {
            this.middle = ((double)totalWin + totalLose)/2;
        }
    }

}
