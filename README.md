# PSO Scala

Brief description: PSO algorithm for bivariate functions implemented in Scala

Created by Rajesh RS ( http://twitter.com/rexplorations / https://www.linkedin.com/in/rajeshrs )

Particle swarm optimization is a heuristic method for obtaining good solutions for mathematical optimization problems. It isn't a gradient based method and therefore will not allow you to find the exact minimum point (local or global). However, it can provide numerous "good enough" candidate solutions. The approach was originally developed by James Kennedy and Russell Eberhart at Purdue University in the US.

The objective of this repo is to provide a simple interface for experimenting with a bivariate function optimizer based the particle swarm optimization approach. The benefits of Scala in this context are:

* Arbitratily passing bivariate functions to be optimized rather than having to hard code them
* Scalability and arbitrary sized swarms, and arbitrary numbers of iterations
* Scalability in terms of being able to use multi-processor support and in future, cluster computing
* Very concise code base and very readable code

The initial commit took little time to develop. I hope to update this with more functionality as time progresses!



Comments and suggestions welcome!

Some references:
* Kennedy and Eberhart's original paper : https://www.cs.tufts.edu/comp/150GA/homeworks/hw3/_reading6%201995%20particle%20swarming.pdf (on the Tufts university website)
* University of Manitoba lecture notes on PSO: http://ece.eng.umanitoba.ca/undergraduate/ECE4850T02/Lecture%20Slides/PSO-v10.pdf 
* MIT OCW material on multidisciplinary systems optimization (MSDO) - a wonderful course to learn about this and other algorithms. https://ocw.mit.edu/courses/engineering-systems-division/esd-77-multidisciplinary-system-design-optimization-spring-2010/
* Some test functions for PSO (all of these are bivariate) https://en.wikipedia.org/wiki/Test_functions_for_optimization 
* Paper in the journal of heuristics about the velocity updates in PSO: https://cs.adelaide.edu.au/~zbyszek/Papers/JofH.pdf 


