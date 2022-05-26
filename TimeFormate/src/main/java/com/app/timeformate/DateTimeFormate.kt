package com.app.timeformate

import android.content.ContentValues
import android.util.Log
import java.text.SimpleDateFormat
import java.util.*


fun getCurrentTime(formate:String): String {
        val sdf = SimpleDateFormat(formate)
        val currentDate = sdf.format(Date())
        currentDate.format().toLowerCase()
        Log.e(ContentValues.TAG, "getCurrentTime: $currentDate")
        return currentDate
    }

