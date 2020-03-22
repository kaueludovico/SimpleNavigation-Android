package com.ludovicotech.simple_navigation.navigation

import android.app.Activity
import android.content.Intent
import com.ludovicotech.simple_navigation.SecondActivity

open class Navigator {
    fun showSecondActivity(activity: Activity) {
        val intent = Intent(activity, SecondActivity::class.java)
        activity.startActivity(intent)
    }
}