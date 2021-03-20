package bhakadekailas.implicitandexplicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val implicitIntent = findViewById<Button>(R.id.button)
        val explicitIntent = findViewById<Button>(R.id.button2)

        implicitIntent.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = ContactsContract.Contacts.CONTENT_URI
            startActivity(intent)
        }

        explicitIntent.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}