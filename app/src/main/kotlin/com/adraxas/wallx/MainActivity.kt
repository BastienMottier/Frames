/*
 * Copyright (c) 2019. Jahir Fiquitiva
 *
 * Licensed under the CreativeCommons Attribution-ShareAlike
 * 4.0 International License. You may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *    http://creativecommons.org/licenses/by-sa/4.0/legalcode
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adraxas.wallx

import com.github.javiersantos.piracychecker.PiracyChecker
import jahirfiquitiva.libs.frames.ui.activities.FramesActivity

class MainActivity : FramesActivity() {
    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override var donationsEnabled = true
    
    override fun amazonInstallsEnabled(): Boolean = true
    override fun checkLPF(): Boolean = false
    override fun checkStores(): Boolean = false
    
    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApCYilqKVmCgsTKARVmh1VRya37OdaIl4rf5dQG2LPzlGxBeQvbcO0hbOD1YCMuwXFnWCk/EUI0rrtHoueIsGW0JEFR8hX0vohcBUHVPROX4rMj/pbmeCIGme+UWEHQOL/lkRoWogywf/29A2xDFIVMgHcIXKBJU1xKYuOhEonOvIEGwdxIPbHEREHJxb8d0mKSseUnLc9x5A/IkPo2DYi7qJT34uADRWUrEQ4a9hl9J7kbLZRnJ3Yq0UHn6Ia5QT+bu0CR3PKuz1xgh28No4zRrG6iWkw71J3Hz45Nqsz3cVS6uwRgdKezT9YvHZOhZhp1rWSENf/VRLuNKViXINZQIDAQAB"
    
    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return if (BuildConfig.DEBUG) null
        else super.getLicenseChecker()
    }
}
