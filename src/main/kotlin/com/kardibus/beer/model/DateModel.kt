package com.kardibus.beer.model

import java.time.LocalDateTime
import java.util.*

class DateModel {
    lateinit var id: UUID
    var work: Boolean = false
    lateinit var step: List<Time>

    class Time {
        var step: Int = 0
        lateinit var dateTime: LocalDateTime
    }
}