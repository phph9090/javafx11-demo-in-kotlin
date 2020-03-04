package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.DatePicker
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloDatePicker : Application() {
    override fun start(primaryStage: Stage?) {
        val dp = DatePicker()
        dp.onAction = EventHandler { e -> e.source.let { it as DatePicker }.value.run(::println) }
        val vbox = VBox(dp)

        primaryStage!!.apply {
            title = "DatePicker showcase"
            scene = Scene(vbox, 300.0, 150.0)
        }.show()
    }
}

fun main() {
    Application.launch(HelloDatePicker::class.java)
}