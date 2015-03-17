package asyncscala.examples

import akka.actor.ActorRef

case class TurnOnPower(heater: ActorRef)
case class TurnOffPower(heater: ActorRef)
case class PowerOn
case class PowerOff
case class Temp(tempValue: Int){
	def add(by: Int) = Temp(this.tempValue + 1)
}
case class ChangeTemp(by: Int)
case class CheckTemp