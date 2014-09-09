package fail.halfpackagecycle

import fail.halfpackagecycle.anotherpackage.B

/**
 * Created by gshakhnazaryan on 9/8/14.
 */
class A {
  def b: B = null
}
