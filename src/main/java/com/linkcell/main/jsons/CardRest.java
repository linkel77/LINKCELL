package com.linkcell.main.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.linkcell.main.entity.Icon;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Estructura JSON que se van a recibir o enviar
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardRest {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("maxLevel")
    private int maxLevel;

    @JsonProperty("iconUrls")
    private IconRest icon;

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

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public IconRest getIcon() {
        return icon;
    }

    public void setIcon(IconRest icon) {
        this.icon = icon;
    }
}
