package com.smart.scala.actor_test

/**
  * Created by fc.w on 2017/6/26.
  */
object ProduceData {

  def main(args: Array[String]): Unit = {
    val act = new HelloActor
    act ! "aaa"
  }

}
