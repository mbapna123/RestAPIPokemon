package com.concretepage.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pokedata")
public class Article implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;  
	@Column(name="pokemon")
    private String pokemon;
	@Column(name="imagelink")	
	private String imagelink;
	@Column(name="height")	
	private double height;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPokemon() {
		return pokemon;
	}
	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}
	public String getImagelink() {
		return imagelink;
	}
	public void setCategory(String imagelink) {
		this.imagelink = imagelink;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
} 