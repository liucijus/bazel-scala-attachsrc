package com.example

import com.example.dep1.Hi
import com.example.dep2.Hello
import com.example3.Foo

object Main extends App {
  private val name = "World"

  // simple example of Scala source attachment
  println(new Hi().sayHi(name))

  // Scala example of when sources jar root does not match package root
  println(new Hello().sayHello(name))

  // Java example of when sources jar root does not match package root
  println(new Foo().foo())
}