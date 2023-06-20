package com.example.quizmanagement.model.question;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Enumerated(value = EnumType.STRING)
    private QuestionType type;
    private String code;
//    private byte[] video;
//    private byte[] image;
    private String question;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answers_id")
    private MultipleChoiceAnswers answers;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "sentece_to_question",
            joinColumns = @JoinColumn(name = "sentence"),
            inverseJoinColumns = @JoinColumn(name = "question"))
    private List<Sentence> sentences;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "matches_to_question",
            joinColumns = @JoinColumn(name = "matches"),
            inverseJoinColumns = @JoinColumn(name = "question"))
    private List<Matches> matches;

 }
