package id.ac.application

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        btnLogin.setOnClickListener {
            val email = InputEmail.text.toString()
            val password = InputPassword.text.toString()
            if (email.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(email == "hadi@gmail.com" || password == "hadi"){
                val progressDialog = ProgressDialog(this,
                    R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                val intent = Intent (this,Dashboard::class.java)
                startActivity(intent)
                finish()
            }
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}