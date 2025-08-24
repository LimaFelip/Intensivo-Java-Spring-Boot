package com.devsuperior.dslist.dslist.dto;

import com.devsuperior.dslist.dslist.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
    
 
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shorDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shorDescription = entity.getShorDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShorDescription() {
        return shorDescription;
    }

    


}
