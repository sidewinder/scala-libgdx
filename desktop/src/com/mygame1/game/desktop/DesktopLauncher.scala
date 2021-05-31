package com.mygame1.game.desktop

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}
import com.mygame1.game.MyGame1

object DesktopLauncher {

  def main(arg: Array[String]): Unit = {
    val config = new LwjglApplicationConfiguration
    new LwjglApplication(new MyGame1, config)
  }
}
