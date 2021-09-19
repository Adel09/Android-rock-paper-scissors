package com.crumlabs.rockpaperscissors

import android.app.Activity
import android.app.Notification
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class PlayWithComputer : Activity() {

    lateinit var enemyPic: ImageView
    lateinit var playerPic: ImageView
    val choices = mutableListOf<String>("Rock", "Paper", "Scissors")
    var playerscore = 0
    var enemyscore = 0
    lateinit var playerScoreText: TextView
    lateinit var enemyScoreText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_with_computer)
        val window = window
        window.statusBarColor = Color.rgb(96,0,5)

        enemyPic = findViewById(R.id.enemy_pic)
        playerPic = findViewById(R.id.player_pic)

        playerScoreText = findViewById(R.id.player_score_text)
        enemyScoreText = findViewById(R.id.enemy_score_text)




    }

    fun rock(v: View){
        playerPic.setImageResource(R.drawable.rockic)
        val enemychoice = choices.random()
        when (enemychoice){
            "Rock" -> {enemyPic.setImageResource(R.drawable.rockic)
                Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show()}

            "Paper" -> {enemyPic.setImageResource(R.drawable.paperic)
                Toast.makeText(this, "You LOSE!!!", Toast.LENGTH_SHORT).show()
                enemyscore++
                enemyScoreText.text = enemyscore.toString()}

            "Scissors" -> {enemyPic.setImageResource(R.drawable.scissorsic)
                Toast.makeText(this, "You WIN!!!", Toast.LENGTH_SHORT).show()
                playerscore++
                playerScoreText.text = playerscore.toString()}

        }


    }

    fun paper(v: View){
        playerPic.setImageResource(R.drawable.paperic)
        val enemychoice = choices.random()
        when (enemychoice){
            "Rock" -> {enemyPic.setImageResource(R.drawable.rockic)
                Toast.makeText(this, "You WIN!!!", Toast.LENGTH_SHORT).show()
                playerscore++
                playerScoreText.text = playerscore.toString()}

            "Paper" -> {enemyPic.setImageResource(R.drawable.paperic)
                Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show()}

            "Scissors" -> {enemyPic.setImageResource(R.drawable.scissorsic)
                Toast.makeText(this, "You LOSE!!!", Toast.LENGTH_SHORT).show()
                enemyscore++
                enemyScoreText.text = enemyscore.toString()}

        }
    }

    fun scissors(v: View){
        playerPic.setImageResource(R.drawable.scissorsic)
        val enemychoice = choices.random()
        when (enemychoice){
            "Rock" -> {enemyPic.setImageResource(R.drawable.rockic)
                Toast.makeText(this, "You LOSE!!!", Toast.LENGTH_SHORT).show()
                enemyscore++
                enemyScoreText.text = enemyscore.toString()}

            "Paper" -> {enemyPic.setImageResource(R.drawable.paperic)
                Toast.makeText(this, "You WIN!!!", Toast.LENGTH_SHORT).show()
                playerscore++
                playerScoreText.text = playerscore.toString()}

            "Scissors" -> {enemyPic.setImageResource(R.drawable.scissorsic)
                Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show()}

        }
    }


}

