package com.example.myapplication

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root = findViewById<ConstraintLayout>(R.id.root)
        val button = findViewById<Button>(R.id.button)
        val name = findViewById<EditText>(R.id.nameInput)
        val nickname = findViewById<EditText>(R.id.nicknameInput)
        val passwd = findViewById<EditText>(R.id.passwordInput)
        val passwdConfirm = findViewById<EditText>(R.id.passwordConfirmInput)

        button.setOnClickListener() {
            println(name.text.toString())
            println(nickname.text.toString())
            println(passwd.text.toString())
            println(passwdConfirm.text.toString())
            if (passwd.text.toString() != passwdConfirm.text.toString()) {
                Snackbar.make(root, "Niepoprawne hasło", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(
                    root,
                    "Witaj ${name.text.toString()}, twój pseudonim to ${nickname.text.toString()}. Twoje hasła są zgodne",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }
}