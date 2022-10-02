package com.kardibus.beer.Conf

import com.kardibus.beer.model.DateModel
import com.kardibus.beer.model.StateModel
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.LocalDateTime
import java.util.*

@Configuration
class Config {

    @Bean
    fun stateModel(): StateModel {
        return StateModel().apply {
            id = UUID.randomUUID()
            work = true
            step = listOf(
                StateModel.Step().apply {
                    step = 1
                    time = 20
                },
                StateModel.Step().apply {
                    step = 2
                    time = 10
                },
                StateModel.Step().apply {
                    step = 3
                    time = 5
                },
                StateModel.Step().apply {
                    step = 4
                    time = 15
                })
        }

    }

    @Bean
    fun dateModel(stateModel: StateModel): DateModel {
        return DateModel().apply {
            id = UUID.randomUUID()
            work = true
            step = listOf(
                DateModel.Time().apply {
                    step = 1
                    dateTime = 0
                },
                DateModel.Time().apply {
                    step = 2
                    dateTime = 0
                },
                DateModel.Time().apply {
                    step = 3
                    dateTime = 0
                },
                DateModel.Time().apply {
                    step = 4
                    dateTime = 0
                })
        }

    }
}