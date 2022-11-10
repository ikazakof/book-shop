package com.example.MyBookShopApp.entity.book.file;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "book_file", schema = "com_example")
public class BookFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String hash;
    @Column(name = "type_id", nullable = false)
    private int typeId;
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String path;
}
