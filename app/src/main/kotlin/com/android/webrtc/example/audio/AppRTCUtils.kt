/*
 *  Copyright 2014 The WebRTC Project Authors. All rights reserved.
 *
 *  Use of this source code is governed by a BSD-style license
 *  that can be found in the LICENSE file in the root of the source
 *  tree. An additional intellectual property rights grant can be found
 *  in the file PATENTS.  All contributing project authors may
 *  be found in the AUTHORS file in the root of the source tree.
 */
package com.android.webrtc.example.audio

import android.os.Build
import android.util.Log

/**
 * AppRTCUtils provides helper functions for managing thread safety.
 */
object AppRTCUtils {
    /** Helper method which throws an exception  when an assertion has failed.  */
    fun assertIsTrue(condition: Boolean) {
        if (!condition) {
            throw AssertionError("Expected condition to be true")
        }
    }

    /** Helper method for building a string of thread information. */
    val threadInfo: String
        get() = (
            "@[name=" + Thread.currentThread().name + ", id=" + Thread.currentThread().id +
                "]"
            )

    /** Information about the current build, taken from system properties.  */
    fun logDeviceInfo(tag: String?) {
        Log.d(
            tag,
            "Android SDK: " + Build.VERSION.SDK_INT + ", " +
                "Release: " + Build.VERSION.RELEASE + ", " +
                "Brand: " + Build.BRAND + ", " +
                "Device: " + Build.DEVICE + ", " +
                "Id: " + Build.ID + ", " +
                "Hardware: " + Build.HARDWARE + ", " +
                "Manufacturer: " + Build.MANUFACTURER + ", " +
                "Model: " + Build.MODEL + ", " +
                "Product: " + Build.PRODUCT
        )
    }
}
