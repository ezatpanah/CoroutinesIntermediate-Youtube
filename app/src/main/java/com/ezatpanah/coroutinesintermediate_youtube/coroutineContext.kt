package com.ezatpanah.coroutinesintermediate_youtube

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class coroutineContext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG ="coroutineContext"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine_context)
        runBlocking {
            launch { // context of the parent, main runBlocking coroutine
                Log.e(TAG,"main runBlocking : I'm working in thread ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
                Log.e(TAG,"Unconfined : I'm working in thread ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher
                Log.e(TAG,"Default  : I'm working in thread ${Thread.currentThread().name}")
            }
        }
    }
}