package com.justask.master.handler

import com.justask.master.data.Question
import com.justask.master.service.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.function.ServerResponse

@Controller
class QuestionHandler(
    @Autowired
    val questionService: QuestionService
) {

    @PostMapping("/add/question")
    fun submitQuestion(): ResponseEntity<String> {

        val question = Question(101, "Test question?")

        return if(questionService.saveQuestion(question))
            ResponseEntity("Successful", HttpStatus.OK)
        else
            ResponseEntity("Bad request", HttpStatus.BAD_REQUEST)
    }

    @GetMapping("/questions")
    fun getAllQuestions(): ResponseEntity<List<Question>> {
        val questions = questionService.getAllQuestions()
        return ResponseEntity(questions, HttpStatus.OK);
    }

}
