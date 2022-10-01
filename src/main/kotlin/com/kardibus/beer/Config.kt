package com.kardibus.beer

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
class Config {

    @Bean
    fun stateModel(): StateModel {
        return StateModel().apply {
            id = UUID.randomUUID()
            work = true
            step = listOf(StateModel.Step().apply {
                step = 1
                time = 20
            },
                StateModel.Step().apply {
                    step = 2
                    time = 10
                })
        }

    }
}