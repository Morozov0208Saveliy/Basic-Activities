package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityC : AppCompatActivity() {
    private var buttonToA: Button? = null
    private var buttonToD: Button? = null
    private var buttonClose: Button? = null
    private var closeStack: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        buttonToA = findViewById(R.id.act_C_to_Act_A)
        buttonToA?.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        buttonToD = findViewById(R.id.act_C_to_Act_D)
        buttonToD?.setOnClickListener {
            finish()
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }
        buttonClose = findViewById(R.id.act_C_to_Act_C)
        buttonClose?.setOnClickListener {
            finish()
        }
        closeStack = findViewById(R.id.close_stack)
        closeStack?.setOnClickListener {
            finish()
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "call onStart ActvityC")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "call onResume ActvityC")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "call onPause ActvityC")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "call onStop ActvityC")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "call onDestroy ActvityC")
    }
}