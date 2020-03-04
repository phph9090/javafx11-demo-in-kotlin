package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.ColorPicker
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloColorPicker:Application() {
    override fun start(primaryStage: Stage?) {
        val cp = ColorPicker()
        cp.onAction = EventHandler { e -> e.source.let { it as ColorPicker }.value.run(::println) }
        val vbox = VBox(cp)
        val scene = Scene(vbox)
        primaryStage!!.apply {
            title = "ColorPicker showcase"
            this.scene = scene
        }.show()
    }

}

fun main() {
    Application.launch(HelloColorPicker::class.java)
}