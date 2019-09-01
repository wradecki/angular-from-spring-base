package com.wradecki.multipomodoro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiPomodoroApplication

fun main(args: Array<String>) {
	runApplication<MultiPomodoroApplication>(*args)
}
