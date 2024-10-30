package com.alexeyyuditsky.composecodelab.core

import android.util.Log

fun <T> log(message: T) {
    Log.d("MyLog", message.toString())
}