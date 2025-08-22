package com.DevSuperior.dslist;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//ORM
@Entity //Vai configurar a classe java, para ser equivalente a uma tabela relacional 
@Table(name = "tb_game")

//FIM da ORM
public class Game {
    @Id //Chave primaria da tabela Game
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrmentar
    private Long id;
    private String title;
    
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platfoms;
    private Double score;
    private String imgUrl;
    private String shorDescription;
    private String longDescription;

    public Game(){

    }

    public Game(Long id, String title, Integer year, String genre, String platfoms, Double score, String imgUrl,
            String shorDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platfoms = platfoms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shorDescription = shorDescription;
        this.longDescription = longDescription;
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

    public String getPlatfoms() {
        return platfoms;
    }

    public void setPlatfoms(String platfoms) {
        this.platfoms = platfoms;
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
// Inicio - Metodo para comparação de dois objetos(games)
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

// Fim do metodo

    
}
