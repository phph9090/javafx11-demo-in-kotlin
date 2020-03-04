package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.text.Font
import javafx.stage.Stage

class HelloLabel : Application() {
    override fun start(primaryStage: Stage?) {
        val imageView = ImageView(Image(Thread.currentThread().contextClassLoader.getResourceAsStream("images/avatar.jpg")))
        val label = Label("My Avatar", imageView)
        label.font = Font("Sarasa Term SC", 24.0)

        val scene = Scene(label)
        with(primaryStage!!) {
            this.scene = scene
            this.title = "Label Test"
        }
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloLabel::class.java)
}