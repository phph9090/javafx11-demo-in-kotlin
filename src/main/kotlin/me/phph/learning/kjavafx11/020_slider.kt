package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Slider
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloSlider : Application() {
    override fun start(primaryStage: Stage?) {
        val slider = Slider(0.0, 100.0, 60.0).apply {
            majorTickUnit = 8.0
            minorTickCount = 3
            isSnapToTicks = true
            isShowTickMarks = true
            isShowTickLabels = true
        }

        val vbox = VBox(slider)
        val s = Scene(vbox)
        with(primaryStage!!) {
            title = "Slider showcase"
            scene = s
            show()
        }
    }
}

fun main() {
    Application.launch(HelloSlider::class.java)
}