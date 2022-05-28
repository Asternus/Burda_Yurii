package com.burda.modul3.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @Column(name = "messages_id", nullable = false)
    private Long id;

    @Column(name = "text", nullable = false)
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private Subscriber subscribers;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recipient_id", nullable = false)
    private Subscriber subscribers1;

    public Subscriber getSubscribers1() {
        return subscribers1;
    }

    public void setSubscribers1(Subscriber subscribers1) {
        this.subscribers1 = subscribers1;
    }

    public Subscriber getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Subscriber subscribers) {
        this.subscribers = subscribers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }
}