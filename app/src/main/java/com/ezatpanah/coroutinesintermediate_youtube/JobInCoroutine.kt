package com.ezatpanah.coroutinesintermediate_youtube

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class JobInCoroutine : AppCompatActivity() {
    val TAG = "JobInCoroutine"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_in_coroutine)
        /**Example 1 */
/*        val job1 = GlobalScope.launch {
            coroutineScope {
                val job2 = launch {
                    doSomething()
                }
            }
        }*/

        /** create a job */
/*        runBlocking {
            val job1 = launch {
                Log.d(TAG, "Job1 Started")
            }
            job1.invokeOnCompletion { Log.d(TAG, "Job1 Finished") }
        }*/

        /** join a job */
/*        val job = GlobalScope.launch(Dispatchers.Default) {
            repeat(5)
            {
                Log.d(TAG, "Coroutines is still working")
                delay(1000)
            }
        }
        runBlocking {
            job.join()
            Log.d(TAG, "Main Thread is Running")
        }*/

        /** Cancel a job */
/*        runBlocking {
            val job1 = launch {
                delay(3000L)
                Log.d(TAG, "Job1 Started")

            }
            job1.invokeOnCompletion { Log.d(TAG, "Job1 Finished") }
            delay(500L)
            Log.d(TAG, "Job1 will be canceled")
            job1.cancel()
        }*/


    }

    fun doSomething() {}
}
