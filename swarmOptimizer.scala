/**
  * Created by Rajesh Sampathkumar on 2/12/2017.
  */

object swarmOptimizer {

  def main(args:Array[String]): Unit ={

    //Function to optimize
    //Bivariate function only
    val func = (x:Double, y:Double ) => 1 + (1/(math.pow(x,2) + math.pow(y,2)))

    //Swarm parameters
    val swarmSize = 3000
    val steps = 100


    //Creating a new swarm
    val s = new swarm(swarmSize, func)
    s.swarmDisplay

    //Iterating through swarm
    val gB = s.getBest
    //Initial swarm
    println("Initial swarm's gBest: ")
    gB.display

    for (i <- 1 to steps){
      print("Step # "+i.toString + ":")
      s.updateVelocityPositionPBestForAll(0.01)
      s.gBest.display
    }


  }
}
