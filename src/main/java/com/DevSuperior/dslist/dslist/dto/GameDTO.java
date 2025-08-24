package com.devsuperior.dslist.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.dslist.entities.Game;

import jakarta.persistence.Column;


public class GameDTO {

    private Long id;
    private String title;
     @Column(name = "game_year") // para trocar o nome no banco de dados de year para gam_year
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    
    @Column(columnDefinition = "TEXT")// tranforma String para o tipo TEXT no banco de dados, para ter mais caracter
    private String shorDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public GameDTO(){
    }
    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPlatforms() {
        return platforms;
    }
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getShorDescription() {
        return shorDescription;
    }
    public void setShorDescription(String shorDescription) {
        this.shorDescription = shorDescription;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    


}
