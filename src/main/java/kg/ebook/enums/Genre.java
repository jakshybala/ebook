package kg.ebook.enums;

/*
kg.ebook.model
Tarih: 10.07.2022, Saat: 22:18, Author: Grey 
*/
public enum Genre {
    ACTION_ADVENTURE("Action and Adventure"),
    FANTASY("Fantasy"),
    MYSTERY("Mystery and Horrible"),
    HISTORICAL("Historical "),
    ROMANCE("Romance"),
    YOUNG("Young Adult"),
    CHILDREN("Children"),
    CLASSIC("Классика"),
    COMIC("Comic"),
    SCIENCE("SCIENCE");


    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }
}
