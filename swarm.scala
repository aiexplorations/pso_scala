import scala.collection.mutable.ArrayBuffer

/**
  * Created by Rajesh Sampathkumar on 2/11/2017.
  */
class swarm (size: Int, objFun: (Double, Double) => Double) {
  //Setting up swarm parameters
  val swarmSize = size

  //Initialization of swarm
  var swarm = new ArrayBuffer[particle](swarmSize)
  for (i <- 0 to swarmSize) {
    swarm.append(new particle(math.random, math.random, objFun))
  }
  //Initial evaluation and pBest initialization
  for (i <- 0 to swarmSize){
    swarm(i).evaluate
    swarm(i).initializePBest
  }
  //Finding the best particle (in this case, lowest value (minimization function)
  var gBest : particle = getBest

  //Display and length functions for swarm
  def getLength: Int = swarm.length

  def swarmDisplay = {
    for (i <- swarm)i.display
    println()
  }

  def updateVelocityPositionPBestForAll(deltaT: Double) = {
    for (i <- 0 to swarm.length-1 ){
      swarm(i).updateVelocity(gBest)
      swarm(i).updatePosition(deltaT)
      swarm(i)value = swarm(i).evaluate
      swarm(i).pBestCalc
    }
  }

  //Function to find particle with lowest objective function (minimization)
  def getBest: particle = {
    var bestOne = swarm(0)
    for (i <- 0 to swarm.length-1){
      if(swarm(i).evaluate < bestOne.evaluate) {
          bestOne = swarm(i)
      }
    }
    bestOne
  }

}
