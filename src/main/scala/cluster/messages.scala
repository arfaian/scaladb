package cluster

sealed trait NetworkMessage extends Serializable

private[cluster] object NetworkMessages {
  case object Register extends NetworkMessage
}

object LocalMessages {

}