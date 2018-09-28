package com.ikempf

import eu.timepit.refined.W
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.{MaxSize, NonEmpty}
import shapeless.Witness

object Refined {

  type Name = NonEmpty And MaxSize[W.`10`.T]


}
