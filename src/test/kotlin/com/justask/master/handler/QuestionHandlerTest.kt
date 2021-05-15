package com.justask.master.handler

import com.justask.master.data.Question
import com.justask.master.service.QuestionService
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verifySequence
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

class QuestionHandlerTest() {

    private val questionService: QuestionService = mockk<QuestionService>()

    @Test
    fun `should return successful status if question posted successfully`() {
        val questionHandler = QuestionHandler(questionService);
        val question = Question(101, "Test question?");

        every { questionService.saveQuestion(any()) } returns true

        val response = questionHandler.submitQuestion()

        verifySequence {
            questionService.saveQuestion(question)
        }


        response.statusCode shouldBe HttpStatus.OK
        response.body shouldBe "Successful"
    }

    @Test
    fun `should return BAD_REQUEST status if question is not posted successfully`() {
        val questionHandler = QuestionHandler(questionService)
        val question = Question(101, "Test question?")

        every { questionService.saveQuestion(any()) } returns false

        val serviceResponse = questionService.saveQuestion(question)
        println(serviceResponse)

        verifySequence {
            questionService.saveQuestion(question)
        }

        val response = questionHandler.submitQuestion()
        response.statusCode shouldBe HttpStatus.BAD_REQUEST
        response.body shouldBe "Bad request"

    }
}