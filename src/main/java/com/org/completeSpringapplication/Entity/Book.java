package com.org.completeSpringapplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book
{
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    String title;

    String author;


}
