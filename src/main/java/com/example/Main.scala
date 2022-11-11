package com.example

import com.example.dep1.Hi
import com.example.dep2.Hello
import com.example3.Foo

object Main extends App {
  private val name = "World"

  println(new Hello().sayHello(name))
  println(new Hi().sayHi(name))
  println(new Foo().foo())
}