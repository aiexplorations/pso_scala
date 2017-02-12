/**
  * Created by Rajesh Sampathkumar on 2/11/2017.
  */

import scala.collection.mutable.ArrayBuffer
import scala.math

class particle (x: Double, y: Double, objFun: (Double,Double) => Double) {
  var xval = x
  var yval = y
  var value = evaluate
  var vx = math.random
  var vy = math.random
  var pBest = ArrayBuffer[Double](0)
  val objFunction = objFun

  def updatePosition(deltaT : Double ) = {
    xval = xval + vx * deltaT
    yval = yval + vx * deltaT
  }

  def updateVelocity (gBest: particle) = {
    val influence = if(gBest.value == value) 0.8 + math.random else 0.2 + math.random
    val pressure = 1-influence

    vx = vx*influence + gBest.vx*pressure + math.random
    vy = vy*influence + gBest.vy*pressure + math.random
  }

  def pBestCalc = {
    if (value != pBest(pBest.length-1)) {
      if (value > pBest(pBest.length-1)) pBest.append(value)
    }
  }

  def evaluate:Double = objFun(xval,yval)

  def initializePBest = {
    pBest.append(value)
  }


  def display = println (xval, yval, evaluate)
}
