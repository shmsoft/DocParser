package com.shmsoft

import com.shmsoft.court.Application
import org.scalatest._

class ApplicationSpec extends FlatSpec with Matchers {
  "The Application object" should "give help" in {
    Application.main(new Array[String](0))
  }
}
