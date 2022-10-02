package com.kardibus.beer

import com.kardibus.beer.model.Beer
import com.kardibus.beer.model.DateModel
import com.kardibus.beer.model.StateModel
import com.kardibus.beer.model.WorkModel
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class BeerService(private var stateModel: StateModel, private var dateModel: DateModel) {

    fun state(): StateModel {
        return stateModel
    }

    fun calculateWorkTime(): Beer {
        var timeNow = Calendar.getInstance().time.time

        var mapInt: Map<Int, Int> =
            stateModel.step.associateBy({ it.step }, { it.time })


        var date = dateModel.apply {
            id = stateModel.id
            work = stateModel.work
            step = dateModel.step.apply {

                this.stream().map { a ->
                    timeNow = timeNow.plus((mapInt.getValue(a.step).toLong())*60000)
                    a.dateTime = timeNow
                }.toArray()
            }
        }

        return Beer().apply { beer = listOf(date) }
    }

    fun work():WorkModel{
        var work = WorkModel().apply {
            work = true
            step = 1
            percentageСompletion = 10
        }
        return work
    }
}