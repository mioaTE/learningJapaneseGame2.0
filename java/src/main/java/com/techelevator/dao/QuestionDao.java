package com.techelevator.dao;

import com.techelevator.model.Question;


public interface QuestionDao {
    Question getQuestionByGenreId(int genreId);
    Question getRandomQuestionByGenreId(int genreId);

    Question getRandomQuestion();




}