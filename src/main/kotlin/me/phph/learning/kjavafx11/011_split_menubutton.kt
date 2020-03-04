package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.MenuItem
import javafx.scene.control.SplitMenuButton
import javafx.stage.Stage

class HelloSplitMenuButton : Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage!!.title = "Split Menu Button Text"

        val mi1 = MenuItem("Option 1")
        mi1.onAction = EventHandler { println("option 1 clicked") }
        val mi2 = MenuItem("Option 2")
        mi2.onAction = EventHandler { println("option 2 clicked") }
        val mi3 = MenuItem("Option 3")
        mi3.onAction = EventHandler { println("option 3 clicked") }

        val smb = SplitMenuButton()
        smb.text = "split menu button"
        smb.onAction = EventHandler { println("split menu button clicked") }
        smb.items + listOf(mi1, mi2, mi3)

        primaryStage.scene = Scene(smb)
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloSplitMenuButton::class.java)
}