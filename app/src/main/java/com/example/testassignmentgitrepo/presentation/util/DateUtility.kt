package com.example.testassignmentgitrepo.presentation.util

import java.text.SimpleDateFormat
import java.util.*

object DateUtility {

    private const val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"

    fun formatDate(inputDate: String): String {
        return try {
            val inputDateFormat = SimpleDateFormat(DATE_FORMAT, Locale.US)
            val outputDateFormat = SimpleDateFormat("dd MMM yyyy", Locale.US)

            val parsedDate = inputDateFormat.parse(inputDate) ?: return inputDate
            outputDateFormat.format(parsedDate)
        } catch (ex: Exception) {
            inputDate
        }
    }
}
