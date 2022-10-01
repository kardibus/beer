package com.kardibus.beer.Conf

import com.kardibus.beer.model.DateModel
import com.kardibus.beer.model.StateModel
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.LocalDate
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
                })
        }

    }

    @Bean
    fun dateModel(): DateModel {
        return DateModel().apply {
            id = UUID.randomUUID()
            work = true
            step = listOf(
                DateModel.Time().apply {
                    step = 1
                    dateTime = LocalDateTime.now()
                },
                DateModel.Time().apply {
                    step = 2
                    dateTime = LocalDateTime.now()
                })
        }

    }
}