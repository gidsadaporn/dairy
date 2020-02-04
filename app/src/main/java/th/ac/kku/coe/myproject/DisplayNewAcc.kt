package th.ac.kku.coe.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View


class DisplayNewAcc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_new_acc)
    }


    fun nextMessageMain(view : View){


        val intent = Intent(this,MainPageCalender::class.java)
        //intent.putExtra("keyIdentifier" , value1)
        startActivity(intent);
    }
    //val message = intent.getStringExtra(EXTRA_MESSAGE);
    //val textView = findViewById<TextView>(R.id.textView).apply {
    //    text = massage;
    //}


}
