package com.example.recyclerview_kotlin_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    lateinit var profileAdapter: ProfileAdapter
    lateinit var RecyclerView: RecyclerView
    val datas = mutableListOf<ProfileData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    private fun initRecycler(){
        profileAdapter = ProfileAdapter(this)
        RecyclerView = findViewById(R.id.rv_profile)
        RecyclerView.adapter = profileAdapter
        RecyclerView.addItemDecoration(VerticalItemDecorator(20))
        RecyclerView.addItemDecoration(HorizontalItemDecorator(10))
        datas.apply {
            for(i in 1..100){
                add(ProfileData(img = R.drawable.profile1 , name = "M" +i, age = i))
                add(ProfileData(img = R.drawable.profile2 , name = "J" +i, age = i))
                add(ProfileData(img = R.drawable.profile3 , name = "K" +i, age = i))
                add(ProfileData(img = R.drawable.profile4 , name = "O" +i, age = i))
                add(ProfileData(img = R.drawable.profile5 , name = "P" +i, age = i))
            }

            profileAdapter.datas = datas

        }

//        getUserdata()
        profileAdapter.notifyDataSetChanged()

    }

}