package uga.tpspark.flickr

import java.net.URLDecoder
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object FlickrExercise {
  def main(args: Array[String]): Unit = {
    // executing Spark on your machine, using 6 threads
    val conf = new SparkConf().setMaster("local[6]").setAppName("Flickr batch processing")
    val sc = new SparkContext(conf)

    // Control our logLevel. we can pass the desired log level as a string.
    // Valid log levels include: ALL, DEBUG, ERROR, FATAL, INFO, OFF, TRACE, WARN
    sc.setLogLevel("WARN")
    try {
      val originalFlickrMetaData: RDD[String] = sc.textFile("flickrSample.txt")
      //TODO your code goes here
    } catch {
      case e: Exception => throw e
    } finally {
      sc.stop()
    }
    println("done")
  }
}