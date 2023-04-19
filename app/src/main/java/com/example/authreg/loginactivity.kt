package com.example.authreg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginactivity : AppCompatActivity() {
    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var login:Button
    private lateinit var createaccount:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)

        email = findViewById(R.id.edtmail)
        password = findViewById(R.id.edtpass)
        login = findViewById(R.id.btn_login)
         createaccount = findViewById(R.id.btn_createacc)

       login.setOnClickListener {
          var address = email.text.toString().trim()
          var access = password.text.toString().trim()

           //validate
           if (address.isEmpty()|| access.isEmpty()){
               Toast.makeText(this, "Check Your Fields", Toast.LENGTH_SHORT).show()
           } else{

           }


       }

        createaccount.setOnClickListener {
            var gotoregister = Intent(this, Registeractivity::class.java)
            startActivity(gotoregister)
        }

    }
}