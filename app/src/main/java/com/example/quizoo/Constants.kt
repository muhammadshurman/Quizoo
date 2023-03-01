package com.example.quizoo

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answer"






    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            id = 1,"What is the name of this character ?",
            R.drawable.tompa,
            optionOne = "Saitama","Gon", optionThree = "Tompa", optionFour = "Jiraya",
            correctAnswer = 3
        )
        questionsList.add(que1)


        val que2 = Question(
            id = 2,"What is the name of this character ?",
            R.drawable.brook,
            optionOne = "Ainz Ooal Gown","Brook", optionThree = "Arc", optionFour = "Bracku",
            correctAnswer = 2
        )
        questionsList.add(que2)

        val que3 = Question(
            id = 3,"What is the name of this character ?",
            R.drawable.ussop,
            optionOne = "Sogeking","Usopp", optionThree = "Buggy", optionFour = "Sanji",
            correctAnswer = 2
        )
        questionsList.add(que3)

        val que4 = Question(
            id =4,"What is the name of this character ?",
            R.drawable.buggy,
            optionOne = "Buggy","Clown", optionThree = "Joker", optionFour = "Boji",
            correctAnswer = 1
        )
        questionsList.add(que4)

        val que5 = Question(
            id = 5,"What pirates does this flag belong to ?",
            R.drawable.red,
            optionOne = "Red Hat pirates","White Beard pirates", optionThree = "Heart pirates", optionFour = "Black Beard pirates",
            correctAnswer = 3
        )
        questionsList.add(que5)

        val que6 = Question(
            id = 6,"What pirates does this flag belong to ?",
            R.drawable.sun,
            optionOne = "Sun pirates","Alvida pirates", optionThree = "Kid pirates", optionFour = "Kuja pirates",
            correctAnswer = 1
        )
        questionsList.add(que6)


        val que7 = Question(
            id = 7,"What pirates does this flag belong to ?",
            R.drawable.roger,
            optionOne = "Roger pirates","Foxy pirates", optionThree = "Hawkins pirates", optionFour = "Big Mom pirates",
            correctAnswer = 1
        )
        questionsList.add(que7)

        val que8 = Question(
            id = 8,"What pirates does this flag belong to ?",
            R.drawable.gold,
            optionOne = "Foxy pirates","Hawkins pirates", optionThree = "Golden Lion pirates", optionFour = "Straw Hat pirates",
            correctAnswer = 3
        )
        questionsList.add(que8)
        return questionsList



    }


}