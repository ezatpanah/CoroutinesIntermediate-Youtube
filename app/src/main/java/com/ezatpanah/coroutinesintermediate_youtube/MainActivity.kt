package com.ezatpanah.coroutinesintermediate_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() , CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val userOne = async(Dispatchers.IO) { fetchFirstUser() }
            val userTwo = async(Dispatchers.IO) { fetchSecondUser() }
        }

    }
    fun fetchFirstUser(){}
    fun fetchSecondUser(){}
}