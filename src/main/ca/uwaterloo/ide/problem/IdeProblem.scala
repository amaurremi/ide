package ca.uwaterloo.ide.problem

import ca.uwaterloo.ide.problem.solver.{IdeSolver, TraverseGraph}
import ca.uwaterloo.ide.problem.types.LabeledExplodedGraphTypes

trait IdeProblem extends LabeledExplodedGraphTypes with IdeFlowFunctions with TraverseGraph with IdeSolver
