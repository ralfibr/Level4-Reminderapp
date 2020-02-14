package com.example.reminderapp.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * reminder data class
 */
@Parcelize
data class Reminder(
    var reminderText: String
) : Parcelable
