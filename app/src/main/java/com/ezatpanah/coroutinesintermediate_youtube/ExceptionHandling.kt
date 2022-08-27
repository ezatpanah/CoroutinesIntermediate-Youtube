package com.ezatpanah.coroutinesintermediate_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ExceptionHandling : AppCompatActivity() {
    val TAG ="ExceptionHandling"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exception_handling)
        /** First way */
        GlobalScope.launch(Dispatchers.Main) {
            try {
                fetchUser()
            } catch (exception: Exception) {
                Log.d(TAG, "$exception handled !")
            }
        }

        /** Second way */
        val handler = CoroutineExceptionHandler { _, exception ->
            Log.d(TAG, "$exception handled !")
        }
        GlobalScope.launch(Dispatchers.Main + handler) {
            fetchUser() // do on IO thread and back to UI Thread
        }


    }
    fun fetchUser(){ }
}