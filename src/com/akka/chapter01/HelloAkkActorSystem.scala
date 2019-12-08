package com.akka.chapter01

import akka.actor.ActorSystem

object HelloAkkActorSystem extends App {

  val actorSystem = ActorSystem("HelloAkka")
  println(actorSystem)
}
