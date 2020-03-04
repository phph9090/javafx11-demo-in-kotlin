package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.RadioButton
import javafx.scene.control.ToggleGroup
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloRadioButton : Application() {
    override fun start(primaryStage: Stage?) {
        val vbox = VBox()
        val rb = RadioButton("test")
        rb.onAction = EventHandler { e ->
            println(e.source.let { it as RadioButton }.text)
        }
        vbox.children + rb

        val eh = EventHandler<ActionEvent> { e ->
            println(e.source.let { it as RadioButton }.toggleGroup.selectedToggle.let { it as RadioButton }.text)
        }

        val tg = ToggleGroup()
        val rb1 = RadioButton("left")
        rb1.toggleGroup = tg
        rb1.onAction = eh

        val rb2 = RadioButton("right")
        rb2.toggleGroup = tg
        rb2.onAction = eh

        val rb3 = RadioButton("up")
        rb3.toggleGroup = tg
        rb3.onAction = eh

        val rb4 = RadioButton("down")
        rb4.toggleGroup = tg
        rb4.onAction = eh

        val hbox = HBox(rb1, rb2, rb3, rb4)
        vbox.children + hbox

        val s = Scene(vbox)
        primaryStage!!.apply {
            title = "Radio button demo"
            scene = s
            width = 200.0
            height = 100.0
        }.show()
    }
}

fun main() {
    Application.launch(HelloRadioButton::class.java)
}