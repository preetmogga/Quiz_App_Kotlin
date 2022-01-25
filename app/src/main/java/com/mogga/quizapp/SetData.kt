package com.mogga.quizapp

object SetData {

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            1,
            "what is the capital of India ?",
            "UP",
            "MP",
            "Delhi",
            "lucknow",
        3
        )

        var q2 = QuestionData(
            1,
            "who was the first india  woman in space",
            "UP",
            "MP",
            "Kalpana Chawla",
            "lucknow",
            3
        )

        var q3 = QuestionData(
            1,
            "who was the first india  woman in space",
            "UP",
            "MP",
            "Kalpana Chawla",
            "lucknow",
            3
        )

        que.add(q1)
        que.add(q2)
        que.add(q3)
        return que



    }
}