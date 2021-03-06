/********************************************************** {{{1 ***********
 *  Copyright © 2015 … 2016 "Martin Krischik" «krischik@users.sourceforge.net»
 ***************************************************************************
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see http://www.gnu.org/licenses/
 ********************************************************** }}}1 **********/
package com.krischik.fit_import

import com.krischik.Second

/**
 * <p>
 * </p>
 *
 * @author "Martin Krischik" «krischik@users.sourceforge.net»
 * @version 1.0
 * @since 1.0
 */
public class MainActivity_Test :
   android.test.ActivityInstrumentationTestCase2<MainActivity_>(MainActivity_::class.java)
{
   /**
    * Logging tag
    */
   private val TAG = com.krischik.Log.getLogTag(MainActivity_Test::class.java)

   /**
    * Test opening the main activity (smoke test / release compatible version)
    */
   @android.test.suitebuilder.annotation.Smoke
   @android.test.suitebuilder.annotation.SmallTest
   fun test_00_Open()
   {
      com.krischik.Log.d (TAG, "+ test_00_Open")
      val Instrument = instrumentation
      val Solo = com.robotium.solo.Solo (Instrument, activity)

      Solo.sleep (Second (0.5f))

      com.krischik.Log.d (TAG, "- test_00_Open")
   } // test_00_
}

// vim: set nowrap tabstop=8 shiftwidth=3 softtabstop=3 expandtab textwidth=96 :
// vim: set fileencoding=utf-8 filetype=kotlin foldmethod=syntax spell spelllang=en_gb :
