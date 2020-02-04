package th.ac.kku.coe.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activity_add : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        fun nextEdit(view: View) {


            val intent = Intent(this, activity_edit::class.java)
            //intent.putExtra("keyIdentifier" , value1)
            startActivity(intent);
        }
    }
}
