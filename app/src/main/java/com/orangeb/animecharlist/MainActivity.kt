package com.orangeb.animecharlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val animeCharacter = listOf(
            Character("Naruto Uzumaki", "Naruto", "Pierrot", "https://www.enter.co/wp-content/uploads/2014/11/naruto-dest1.jpg"),
            Character("Sasuke Uchiha", "Naruto", "Pierrot", "https://i1.wp.com/www.bitme.gg/wp-content/uploads/2020/05/Naruto_-Asi%CC%81-luce-Sasuke-con-el-estilo-de-Dragon-Ball-y-One-Piece-1.jpg?fit=1280%2C720&ssl=1"),
            Character("Goku", "Dragon Ball", "Toei Animation", "https://static.t13.cl/images/original/2019/05/1557689182-goku.jpg"),
            Character("Vegeta", "Dragon Ball", "Toei Animation", "https://static.wikia.nocookie.net/dragonball/images/a/a9/Vegeta.png/revision/latest/scale-to-width-down/720?cb=20180204191902&path-prefix=es"),
            Character("Monkey D. Luffy", "One Piece", "Toei Animation", "https://static.wikia.nocookie.net/thejusticeworld/images/6/63/Luffy.jpg/revision/latest/scale-to-width-down/340?cb=20110416204724"),
            Character("Ichigo Kurosaki", "Bleach", "Pierrot", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzX8Lie-frQEaBykAE_rew89tX72EMftKB4g&usqp=CAU"),
            Character("Saitama", "One Punch-Man", "Madhouse", "https://laverdadnoticias.com/__export/1592959349911/sites/laverdad/img/2020/06/23/one_punch_man_todo_lo_que_tienes_que_saber_de_saitama.jpg_428403989.jpg" )
    )
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycle()
    }

    private fun initRecycle(){
        findViewById<RecyclerView>(R.id.rvAnimeCharacter).layoutManager = LinearLayoutManager(this)
        val adapter = CharacterAdapter(animeCharacter)
        findViewById<RecyclerView>(R.id.rvAnimeCharacter).adapter = adapter
    }
}