package otus.gpb.homework.activities

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

const val TAG = "TAG"

class ActivityA : AppCompatActivity() {
    private var buttonA: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.i(TAG, "call onCreate ActvityA")
        buttonA = findViewById(R.id.buttonAtoB)
        buttonA?.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "call onStart ActvityA")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "call onResume ActvityA")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "call onPause ActvityA")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "call onStop ActvityA")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "call onDestroy ActvityA")
    }
}