package com.burda.modul3.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "subscribers")
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Equipment equipment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tariff_id")
    private Tariff tariffs;

    @Column(name = "count_messages")
    private Long countMessages;

    @Column(name = "count_call")
    private Long countCall;

    @Column(name = "count_internet")
    private Long countInternet;

    public Long getCountInternet() {
        return countInternet;
    }

    public void setCountInternet(Long countInternet) {
        this.countInternet = countInternet;
    }

    public Long getCountCall() {
        return countCall;
    }

    public void setCountCall(Long countCall) {
        this.countCall = countCall;
    }

    public Long getCountMessages() {
        return countMessages;
    }

    public void setCountMessages(Long countMessages) {
        this.countMessages = countMessages;
    }

    public Tariff getTariffs() {
        return tariffs;
    }

    public void setTariffs(Tariff tariffs) {
        this.tariffs = tariffs;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", countMessages=" + countMessages +
                ", countCall=" + countCall +
                ", countInternet=" + countInternet +
                '}';
    }
}