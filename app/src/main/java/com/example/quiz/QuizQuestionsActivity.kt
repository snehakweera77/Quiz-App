package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        val questionList = Constants.getQuestions()
        val currentPostion = 1
        val question:Question? = questionList[currentPostion - 1]
        progressBar.progress = currentPostion
        tv_progress.text = "$currentPostion" + "/" + progressBar.
    }
}