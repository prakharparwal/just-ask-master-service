package com.justask.master.service

import com.justask.master.data.Question
import org.springframework.stereotype.Component

@Component
class QuestionService {

    fun saveQuestion(question: Question): Boolean {
        return true;
    }

    fun getAllQuestions(): List<Question> {
        return listOf(Question(101, "Test question"), Question(102, "Mock question>"))
    }


}
