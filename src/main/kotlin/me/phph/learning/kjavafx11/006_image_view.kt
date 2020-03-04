package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloImageView : Application() {
    override fun start(primaryStage: Stage?) {
        val imageView = ImageView(Image(Thread.currentThread().contextClassLoader.getResource("images/avatar.jpg")!!.openStream()))
        val vbox = VBox(imageView)
        val scene = Scene(vbox)
        with(primaryStage!!) {
            title = "Image view demo"
            this.scene = scene
        }
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloImageView::class.java)
}