package com.example.authreg

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registeractivity : AppCompatActivity() {
    private lateinit var firstname:EditText
    private lateinit var secondname:EditText
    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var createaccount:Button

    private lateinit var db: SQLiteDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeractivity)

        firstname = findViewById(R.id.edtfirstname)
        secondname = findViewById(R.id.edtsecondname)
        email = findViewById(R.id.edtemail)
        password = findViewById(R.id.edtpassword)
        createaccount = findViewById(R.id.btncreate)


        db = openOrCreateDatabase("WANDERA", Context.MODE_PRIVATE, null)

        db.execSQL("CREATE TABLE IF NOT EXISTS users(jina1 VARCHAR, jina2 VARCHAR, arafa VARCHAR, nenosiri VARCHAR)")

        createaccount.setOnClickListener {
            var jina1_edt = firstname.text.toString().trim()
            var jina2_edt = secondname.text.toString().trim()
            var arafa_edt = email.text.toString().trim()
            var nenosiri_edt = password.text.toString().trim()

            if (jina1_edt.isEmpty()|| jina2_edt.isEmpty()|| arafa_edt.isEmpty()|| nenosiri_edt.isEmpty()){
                Toast.makeText(this, "Cannot Submit An empty field", Toast.LENGTH_SHORT).show()
            } else{
                db.execSQL("INSERT INTO users VALUES(  '\"+jina1_edt+\"', '\"+jina2_edt+\"', '\"+arafa_edt+\"', '\"+nenosiri_edt+\"')")
                Toast.makeText(this, "User Created Successfully", Toast.LENGTH_SHORT).show()
              
            }
        }

    }
}