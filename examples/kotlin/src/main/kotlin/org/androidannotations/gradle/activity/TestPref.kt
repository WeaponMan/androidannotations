package org.androidannotations.gradle.activity

import org.androidannotations.annotations.sharedpreferences.SharedPref

/**
 * Created by WeaponMan on 12/31/2016.
 */
@SharedPref
interface TestPref {
    fun test(): String
}