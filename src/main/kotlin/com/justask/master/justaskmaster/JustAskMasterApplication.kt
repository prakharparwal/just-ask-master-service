package com.justask.master.justaskmaster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JustAskMasterApplication

fun main(args: Array<String>) {
	runApplication<JustAskMasterApplication>(*args)
	println("JustAsk service started....")
}
