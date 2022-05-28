package com.burda.modul3.entity;

import javax.persistence.*;

@Entity
@Table(name = "call")
public class Call {
    @Id
    @Column(name = "call_id", nullable = false)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}