package com.kardibus.beer.model

import java.util.*

class StateModel {
    lateinit var id: UUID
    lateinit var step: List<Step>
    var work: Boolean = false

    class Step {
        var step: Int = 0
        var time: Int = 0
    }

}