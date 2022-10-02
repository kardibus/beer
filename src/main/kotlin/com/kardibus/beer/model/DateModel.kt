package com.kardibus.beer.model

import java.util.*

class DateModel {
    lateinit var id: UUID
    var work: Boolean = false
    lateinit var step: List<Time>

    class Time {
        var step: Int = 0
        var dateTime: Long = 0
    }
}