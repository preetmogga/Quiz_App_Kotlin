package com.mogga.quizapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mogga.quizapp.databinding.ActivityQuestionBinding

class Question : AppCompatActivity() {
    private var currentPosition:Int = 1
    private var questionList:ArrayList<QuestionData>  ? = null
    private var  selectedOption:Int = 0
    companion object{
        const val USER_NAME = "userName"
    }
    private lateinit var binding: ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        questionList=SetData.getQuestion()
        setQuestion()

        binding.optionOne.setOnClickListener {
            selectedOptionStyle(binding.optionOne,1)
        }
        binding.optionTwo.setOnClickListener {
            selectedOptionStyle(binding.optionTwo,2)
        }
        binding.optionThree.setOnClickListener {
            selectedOptionStyle(binding.optionThree,3)
        }
        binding.optionFour.setOnClickListener {
            selectedOptionStyle(binding.optionFour,4)
        }






    }

    private fun setQuestion() {
        val question = questionList!![currentPosition-1]
        setOptionStyle()
        binding.progressCircular.progress=currentPosition
        binding.progressCircular.max=questionList!!.size
        binding.progressText.text="$currentPosition"+"/"+"${questionList!!.size}"
        binding.question.text=question.question
        binding.optionOne.text=question.optionOne
        binding.optionTwo.text=question.optionTwo
        binding.optionThree.text=question.optionThree
        binding.optionFour.text=question.optionFour



    }
    private fun setOptionStyle(){
        val optionList:ArrayList<TextView> =  arrayListOf()
        optionList.add(0,binding.optionOne)
        optionList.add(1,binding.optionTwo)
        optionList.add(2,binding.optionThree)
        optionList.add(3,binding.optionFour)

        for (op in  optionList){
            op.setTextColor(Color.parseColor("#555151"))
            op.background=ContextCompat.getDrawable(this,R.drawable.question_option)
            op.typeface  = Typeface.DEFAULT
        }
    }

    private fun selectedOptionStyle(view: TextView,opt:Int){
        setOptionStyle()
       selectedOption=opt
        view.background=ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view.typeface  = Typeface.DEFAULT
        view.setTextColor(Color.parseColor("#000000"))



    }


}