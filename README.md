# Spark-Mllib-Test-Practice
A mimic of Apache Spark's tests for its mechine learning library

Spark has built-in test suites. To run inside Spark, execute,

    $SPARK_ROOT/build/sbt "test-only org.apache.spark.mllib.regression.LassoSuite"
    
However this command not efficient, since sbt has to run all tests of dependences first. 

And further problem of the built-in tests is, they are not portable for outside Spark usage. For example,

    org.apache.spark.util.Utils
    
cannot be used outside since it is Spark private class. And

    import org.apache.spark.mllib.util.MLlibTestSparkContext
    
cannot be resovled outside because of the "main/test" layout of sbt project :( 

Therefore, if you create an sbt project of Spark test, some modification or rewriting of built-in test suites are needed.

The project is only for self testing practice.


  
    

