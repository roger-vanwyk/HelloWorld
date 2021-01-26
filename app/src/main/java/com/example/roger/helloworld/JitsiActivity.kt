package com.example.roger.helloworld

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.net.MalformedURLException
import java.net.URL

class JitsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jitsi)

        // Initialize default options for Jitsi meetings
        val serverURL: URL
        serverURL = try {
            // Replace "https://meet.jit.si" with appropriate JAAS serverURL
            URL("https://meet.jit.si")
        } catch (e: MalformedURLException) {
            e.printStackTrace()
            throw RuntimeException("Invalid server URL!")
        }
        val defaultOptions = JitsiMeetCoferenceOptions.Builder()
                .setServerURL(serverURL)
                // Set obtained JAAS JWT here
                // .setToken("YourJWT")
                .setWelcomePageEnabled(false)
                .build()
        val Jitsi = null
        Jitsi.setDefaultConferenceOptions(defaultOptions)
    }

    fun onButtonClick(v: View?) {
        val editText = findViewById<EditText>(R.id.meetingName)
        val editText.text.toString()
        var text = null
        if (text.length > 0) {
            // Build options object for joining a meeting,
            // The SDK will join the default one you set earlier,
            // with this one on joining.
            val options = JitsiMeetConferenceOptions.Builder()
                    .setRoom(text)
                    .build()
            // Launch the activity with the given options.
            // The launch() method creates the required Intent and passing the options.
            JitsiActivity.launch(this, options)
        }
    }
}

object Jitsi {

}

class JitsiMeetConferenceOptions {

}

private fun Any.setWelcomePageEnabled(b: Comparable<Boolean>): Any {
    TODO("Not yet implemented")
}

class JitsiMeetCoferenceOptions {
    class Builder {
        fun setServerURL(serverURL: URL): Any {
            TODO("Not yet implemented")
        }

    }

}
