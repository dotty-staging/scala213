/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc. dba Akka
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.runtime.java8

@FunctionalInterface trait JFunction1$mcFJ$sp extends Function1[Any, Any] with Serializable {
  def apply$mcFJ$sp(v1: Long): Float
  override def apply(t: Any): Any = scala.runtime.BoxesRunTime.boxToFloat(apply$mcFJ$sp(scala.runtime.BoxesRunTime.unboxToLong(t)))
}
