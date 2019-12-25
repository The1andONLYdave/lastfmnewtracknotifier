package com.dlka.lastfmnewtracknotifier

import android.os.Bundle
import android.os.StrictMode
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response


class DebugActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debug)


        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()

        StrictMode.setThreadPolicy(policy)
        //find view by id as synthetic imports in submodules not working and as it is only for debugging development
        val requestButton = findViewById<Button>(R.id.button)
        val moshiButton = findViewById<Button>(R.id.button2)
        val parameterizedButton = findViewById<Button>(R.id.button3)
        var responseTV = findViewById<TextView>(R.id.textView)
        var responseTVMoshi = findViewById<TextView>(R.id.textView2)
        var method = findViewById<EditText>(R.id.editText)
        var user = findViewById<EditText>(R.id.editText2)
        var format = findViewById<EditText>(R.id.editText3)
        var apiKey = findViewById<EditText>(R.id.editText4)
        var limit = findViewById<EditText>(R.id.editText5)
        var page = findViewById<EditText>(R.id.editText6)

        //make them scrollable
        responseTV.setMovementMethod(ScrollingMovementMethod())
        responseTVMoshi.setMovementMethod(ScrollingMovementMethod())

        requestButton.setOnClickListener {
            responseTV.text = "Hallo"
            var client =  OkHttpClient();
            var request = Request.Builder()
                    .url("https://ws.audioscrobbler.com/2.0/?method=user.getrecenttracks&user=the1andonlydave&format=json&api_key=&limit=200&page=54")
                    .build();
            val response : Response = client.newCall(request).execute()
            responseTV.text = response.body!!.string()
        }

        moshiButton.setOnClickListener {
            responseTVMoshi.text = "Hallo"
            var client =  OkHttpClient();
            var request = Request.Builder()
                    .url("https://ws.audioscrobbler.com/2.0/?method=user.getrecenttracks&user=the1andonlydave&format=json&api_key=&limit=200&page=54")
                    .build();
            val response : Response = client.newCall(request).execute()
            val responseBody = response.body

            val moshi: Moshi = Moshi.Builder().build()
            val adapter: JsonAdapter<API> = moshi.adapter(API::class.java)

            val api: API? = adapter.fromJson(responseBody?.string())


            responseTVMoshi.text = api?.recenttracks?.attr?.total

            responseTVMoshi.text = "seiten:"+api?.recenttracks?.attr?.totalPages +"pro seite:"+api?.recenttracks?.attr?.perPage+"gesamt:"+api?.recenttracks?.attr?.total


        }

        parameterizedButton.setOnClickListener {
            responseTVMoshi.text = "Hallo"

            var client =  OkHttpClient();
            var request = Request.Builder()
                .url("https://ws.audioscrobbler.com/2.0/?method="+method+"&user="+user+"&format="+format+"&api_key="+apiKey+"&limit="+limit.toString()+"&page="+page.toString())
                .build();
            val response : Response = client.newCall(request).execute()
            val responseBody = response.body

            val moshi: Moshi = Moshi.Builder().build()
            val adapter: JsonAdapter<API> = moshi.adapter(API::class.java)

            val api: API? = adapter.fromJson(responseBody?.string())


            responseTVMoshi.text = "seiten:"+api?.recenttracks?.attr?.totalPages +"pro seite:"+api?.recenttracks?.attr?.perPage+"gesamt:"+api?.recenttracks?.attr?.total
        }



    }

}

