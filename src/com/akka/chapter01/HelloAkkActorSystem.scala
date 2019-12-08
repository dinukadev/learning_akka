package com.akka.chapter01

import akka.actor.{ActorSystem, Props}

object HelloAkkActorSystem extends App {

  val actorSystem = ActorSystem("HelloAkka")
  val actor = actorSystem.actorOf(Props[SummingActor], "summingActor")
  println(actor.path)
}
