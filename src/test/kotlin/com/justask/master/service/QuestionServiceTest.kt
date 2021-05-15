package com.justask.master.service

import com.justask.master.data.Question
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class QuestionServiceTest {

    @Test
    fun `should return true if question is successfully posted`() {
        val questionService = QuestionService()
        val question = Question(101, "Test question ?")

        questionService.saveQuestion(question) shouldBe true

    }
}