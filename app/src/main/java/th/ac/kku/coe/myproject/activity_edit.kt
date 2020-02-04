package th.ac.kku.coe.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_edit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        fun nextList(view: View) {


            val intent = Intent(this, activity_list::class.java)
            //intent.putExtra("keyIdentifier" , value1)
            startActivity(intent);
        }

}
}
