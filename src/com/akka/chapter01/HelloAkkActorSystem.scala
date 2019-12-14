package com.akka.chapter01

import akka.actor.{ActorSystem, Props}
import src.com.akka.chapter01.SummingActorWithInitialParam

object HelloAkkActorSystem extends App {

  val actorSystem = ActorSystem("HelloAkka")
  val actor = actorSystem.actorOf(Props[SummingActor], "summingActor")
  println(actor.path)
  val actorWithParam = actorSystem.actorOf(Props(classOf[SummingActorWithInitialParam], 10), "summinActorWithInitialParam")
  println(actorWithParam.path)
}
