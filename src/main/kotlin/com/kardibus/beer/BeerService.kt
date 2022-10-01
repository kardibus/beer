package com.kardibus.beer

import com.kardibus.beer.model.DateModel
import com.kardibus.beer.model.StateModel
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class BeerService(private var stateModel: StateModel, private var dateModel: DateModel) {

    fun state(): StateModel {
        return stateModel
    }

    fun time(): DateModel {
        var map: Map<Int, LocalDateTime> =
            stateModel.step.associateBy({ it.step }, { LocalDateTime.now().plusMinutes(it.time.toLong()) })

        var date = dateModel.apply {
            id = stateModel.id
            work = stateModel.work
            step = dateModel.step.apply {
                this.stream().map { a -> a.dateTime = map.getValue(a.step) }.toArray()
            }
        }
        return date
    }
}