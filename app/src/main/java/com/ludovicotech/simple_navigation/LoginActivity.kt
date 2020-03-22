package com.ludovicotech.simple_navigation

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IdRes
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ludovicotech.simple_navigation.navigation.Navigator

class LoginActivity : AppCompatActivity() {

    private val txtEmail by bind<EditText>(R.id.emailText)
    private val txtPassword by bind<EditText>(R.id.passwordText)
    private val btnLogin by bind<Button>(R.id.loginButton)

    var navigation = Navigator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener() {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
            navigation.showSecondActivity(this)
        }
    }

    fun <T: View> Activity.bind(@IdRes res: Int) : Lazy<T> {
        @Suppress("UNCHECKED_CAST")
        return lazy(LazyThreadSafetyMode.NONE) { findViewById(res) as T }
    }
}
