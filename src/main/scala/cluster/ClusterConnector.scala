package cluster

import akka.actor.Actor
import akka.actor.ActorLogging
import akka.actor.Props

object ClusterConnector {
  def apply() = {
    Props[ClusterConnector]
  }
}

private[cluster] class ClusterConnector extends Actor with ActorLogging {
  def receive = {
    case _ =>
  }
}