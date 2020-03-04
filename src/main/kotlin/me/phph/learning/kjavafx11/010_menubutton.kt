package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.MenuButton
import javafx.scene.control.MenuItem
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.stage.Stage

class HelloMenuButton : Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage!!.title = "Menu Button Text"

        val mi1 = MenuItem("Option 1")
        mi1.onAction = EventHandler { println("option 1 clicked") }
        val mi2 = MenuItem("Option 2")
        mi2.onAction = EventHandler { println("option 2 clicked") }
        val mi3 = MenuItem("Option 3")
        mi3.onAction = EventHandler { println("option 3 clicked") }

        val imageView = ImageView(Image(Thread.currentThread().contextClassLoader.getResourceAsStream("images/avatar.jpg")))
        val mb = MenuButton("menu button", imageView)
        mb.items += listOf(mi1, mi2, mi3)

        primaryStage.scene = Scene(mb)
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloMenuButton::class.java)
}