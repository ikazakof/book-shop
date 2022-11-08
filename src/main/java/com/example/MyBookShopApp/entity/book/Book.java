package com.example.MyBookShopApp.entity.book;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "books", schema = "com_example")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pub_date", nullable = false)
    private LocalDate pubDate;
    @Column(name = "is_bestseller", columnDefinition = "SMALLINT" , nullable = false)
    private int isBestseller;
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String slug;
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String title;
    @Column(columnDefinition = "VARCHAR(255)")
    private String image;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false)
    private int price;
    @Column(columnDefinition = "SMALLINT default 0", nullable = false)
    private int discount;

}
