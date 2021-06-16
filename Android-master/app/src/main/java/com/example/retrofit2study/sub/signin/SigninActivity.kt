package com.example.retrofit2study.sub.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.retrofit2study.R
import com.example.retrofit2study.api.connector.ServerConnector

class SigninActivity : AppCompatActivity() {
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnSignin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        initUI()
        initListener()
    }

    private fun initUI() {
        edtUsername = findViewById(R.id.edt_signIn_username)
        edtPassword = findViewById(R.id.edt_signIn_password)
        btnSignin = findViewById(R.id.btn_signIn_login)
    }

    private fun initListener() {
        btnSignin.setOnClickListener {
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()

            ServerConnector.getSignIn(username, password)
        }
    }
}