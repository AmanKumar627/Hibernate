package com.bridgelabz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Book")
public class Book implements Serializable{

   @Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="RECORD_ID")
   private Long id;
   
   @Column(name = "NAME")
   private String title;
   
   @Column(name="AGE")
   private String author;

   @OneToOne(mappedBy = "book")
   private Publication publish;
 
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

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

}
