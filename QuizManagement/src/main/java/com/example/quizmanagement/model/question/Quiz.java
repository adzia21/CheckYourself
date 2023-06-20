package com.example.quizmanagement.model.question;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String technology;
    private String title;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "question_to_quizz",
            joinColumns = @JoinColumn(name = "question"),
            inverseJoinColumns = @JoinColumn(name = "quizz"))
    private List<Question> questions;
}
