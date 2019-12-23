package com.dlka.lastfmapiwrapper

import android.os.Bundle
import android.os.StrictMode
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        var requestButton = findViewById<Button>(R.id.button)
        var responseTV = findViewById<TextView>(R.id.textView)
        requestButton.setOnClickListener {
            responseTV.setText("Hallo")
            var client =  OkHttpClient();
            var request = Request.Builder()
                    .url("https://ws.audioscrobbler.com/2.0/?method=user.getrecenttracks&user=the1andonlydave&format=json&api_key=&limit=200&page=54")
                    .build();

            val response : Response = client.newCall(request).execute()

            responseTV.setText(response.body!!.string())

        }





    }

}
