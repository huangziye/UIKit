package com.hzy.nim.util

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * 输入法相关工具类
 * @author: ziye_huang
 * @date: 2019/10/25
 */
object InputMethodUtil {

    /**
     * 显示虚拟键盘
     * @param view 获取焦点对象view
     */
    fun showKeyboard(view: View) {
        (view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(
            view,
            InputMethodManager.SHOW_FORCED
        )
    }

    /**
     * 隐藏虚拟键盘
     * @param view 获取焦点对象view
     */
    fun hideKeyboard(view: View) {
        val imm: InputMethodManager =
            view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (imm.isActive) {
            imm.hideSoftInputFromWindow(view.applicationWindowToken, 0)
        }
    }
}