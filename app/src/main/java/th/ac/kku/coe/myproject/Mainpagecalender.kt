package th.ac.kku.coe.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainPageCalender : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpagecalender)
    }

    fun nextAdd(view : View){


        val intent = Intent(this,activity_add::class.java)
        //intent.putExtra("keyIdentifier" , value1)
        startActivity(intent);
    }

}
