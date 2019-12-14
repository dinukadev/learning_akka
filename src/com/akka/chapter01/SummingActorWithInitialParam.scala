package src.com.akka.chapter01

import akka.actor.Actor

class SummingActorWithInitialParam(initialSum: Int) extends Actor {
  var sum = 0
  override def receive: Receive = {

    case x: Int => sum = initialSum + sum + x
      println(s"my state as sum is $sum")

    case _ => println("Unknown value")
  }
}
