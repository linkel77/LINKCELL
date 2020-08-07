package com.linkcell.main.entity;

import javax.persistence.*;

@Entity
@Table(name="ICON")
public class Icon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="MEDIUM")
    private String medium;

    @OneToOne(fetch=FetchType.LAZY, mappedBy = "icon")
    @JoinColumn(name="ID", nullable = false)
    private Card card;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
