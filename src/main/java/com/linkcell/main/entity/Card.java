package com.linkcell.main.entity;

//Representación de la tabla

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity(name="card")
@Table(name="CARD")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", unique = true, nullable = false)
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="GAME_CARD_ID")
    private Long gameCardId;

    @Column(name="MAXLEVEL")
    private int maxLevel;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ICON_ID", referencedColumnName = "ID")
    private Icon icon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getGameCardId() {
        return gameCardId;
    }

    public void setGameCardId(Long gameCardId) {
        this.gameCardId = gameCardId;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
