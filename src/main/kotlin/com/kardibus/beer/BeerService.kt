package com.kardibus.beer

import com.kardibus.beer.model.DateModel
import com.kardibus.beer.model.StateModel
import com.kardibus.beer.model.WorkModel
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class BeerService(private var stateModel: StateModel, private var dateModel: DateModel) {

    fun state(): StateModel {
        return stateModel
    }

    fun calculateWorkTime(): DateModel {
        var timeNow = LocalDateTime.now().plusHours(5)

        var mapInt: Map<Int, Int> =
            stateModel.step.associateBy({ it.step }, { it.time })


        var date = dateModel.apply {
            id = stateModel.id
            work = stateModel.work
            step = dateModel.step.apply {

                this.stream().map { a ->
                    timeNow = timeNow.plusMinutes(mapInt.getValue(a.step).toLong())
                    a.dateTime = timeNow
                }.toArray()
            }
        }

        return date
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