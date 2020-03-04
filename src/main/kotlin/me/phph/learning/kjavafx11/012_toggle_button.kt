package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.ToggleButton
import javafx.scene.control.ToggleGroup
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloToggleButton : Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage!!.title = "toggle button test"

        val vbox = VBox()
        val tb = ToggleButton("left")
        vbox.children + tb

        val tg = ToggleGroup()
        val tb1 = ToggleButton("left")
        tb1.toggleGroup = tg
        val tb2 = ToggleButton("right")
        tb2.toggleGroup = tg
        val tb3 = ToggleButton("up")
        tb3.toggleGroup = tg
        val tb4 = ToggleButton("down")
        tb3.toggleGroup = tg
        val vbox2 = VBox(tb1, tb2, tb3, tb4)

        vbox.children + vbox2

        val s = Scene(vbox)
        primaryStage.scene = s
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloToggleButton::class.java)
}