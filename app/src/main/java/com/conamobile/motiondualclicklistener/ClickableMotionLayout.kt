package com.conamobile.motiondualclicklistener

import android.annotation.SuppressLint
import android.content.Context
import android.view.MotionEvent
import android.view.ViewConfiguration
import androidx.constraintlayout.motion.widget.MotionLayout

@SuppressLint("ViewConstructor")
class ClickableMotionLayout(context: Context) : MotionLayout(context) {
    private var mStartTime: Long = 0
    override fun onInterceptTouchEvent(event: MotionEvent?): Boolean {

        if (event?.action == MotionEvent.ACTION_DOWN) {
            mStartTime = event.eventTime;
        }

        if ((event?.eventTime?.minus(mStartTime)!! >= ViewConfiguration.getTapTimeout()) && event.action == MotionEvent.ACTION_MOVE) {
            return super.onInterceptTouchEvent(event)
        }

        return false
    }
}