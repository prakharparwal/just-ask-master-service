package com.justask.master.service

import com.justask.master.data.Question
import org.springframework.stereotype.Component

@Component
class QuestionService {

    fun saveQuestion(question: Question): Boolean {
        return true;
    }


}
