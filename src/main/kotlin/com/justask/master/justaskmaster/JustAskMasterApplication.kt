package com.justask.master.justaskmaster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan("com.justask.master.handler", "com.justask.master.service")
@SpringBootApplication
class JustAskMasterApplication

fun main(args: Array<String>) {
	runApplication<JustAskMasterApplication>(*args)
	println("JustAsk service started....")
}
