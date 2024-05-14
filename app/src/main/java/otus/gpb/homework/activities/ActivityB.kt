package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityB : AppCompatActivity() {
    private var buttonB: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        buttonB = findViewById(R.id.buttonBtoC)
        buttonB?.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "call onStart ActvityB")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "call onResume ActvityB")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "call onPause ActvityB")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "call onStop ActvityB")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "call onDestroy ActvityB")
    }
}