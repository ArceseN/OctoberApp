package com.nadiaworks.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {

    //book title
    private String bookTitle;
    //author
    private String authorName;
    //rating
    private int rating;
    //owner
    private String ownerName;
    //availability
    private boolean availability;

    //annotation to generate ID number automatically
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //id number
    private long idNumber;

    //getters
    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getRating() {
        return rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isAvailability() {
        return availability;
    }

    public long getIdNumber() {
        return idNumber;
    }

    //setters
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }
}