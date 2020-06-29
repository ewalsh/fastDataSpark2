package ai.economicdatasciences.init

import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession
// import org.apache.log4j.{Level, Logger}

object SparkInit {
    val rootLogger = Logger.getRootLogger()
    rootLogger.setLevel(Level.WARN)
    val spark = SparkSession.builder().appName("fastdata").master("local[*]").config("spark.logConf","true").config("spark.loglevel","ERROR").getOrCreate()
    // spark.sparkContext.setLogLevel("WARN")
}
