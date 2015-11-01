#!/bin/bash
#sbt clean package
sbt "test-only mllib.regression.LinearRegressionSuite.scala"
sbt "test-only mllib.regression.LassoSuite"


