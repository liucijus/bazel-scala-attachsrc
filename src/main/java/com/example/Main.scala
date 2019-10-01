package com.example

import com.example.dep1.Hi
import com.example.dep2.Hello

object Main extends App {
  private val name = "World"

  println(new Hello().sayHello(name))
  println(new Hi().sayHi(name))
}