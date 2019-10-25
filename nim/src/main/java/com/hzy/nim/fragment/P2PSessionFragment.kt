package com.hzy.nim.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.*
import androidx.fragment.app.Fragment
import com.hzy.nim.R
import com.hzy.nim.util.InputMethodUtil
import com.hzy.utils.toast
import kotlinx.android.synthetic.main.fragment_p2p_session.view.*
import kotlinx.android.synthetic.main.session_bottom_layout.view.*
import kotlinx.android.synthetic.main.session_bottom_text_layout.*
import kotlinx.android.synthetic.main.session_bottom_text_layout.view.*

/**
 * 一对一单聊 fragment
 * @author: ziye_huang
 * @date: 2019/10/24
 */
class P2PSessionFragment : Fragment(), View.OnClickListener {

    private lateinit var editTextMessage: EditText
    private lateinit var btnAudioMsg: ImageView
    private lateinit var btnTextMsg: ImageView
    private lateinit var btnAudioRecord: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_p2p_session, container, false)
        editTextMessage = view.editTextMessage
        btnAudioRecord = view.btnAudioRecord
        btnAudioMsg = view.btnAudioMsg
        btnTextMsg = view.btnTextMsg
        view.msgListContainer.setOnClickListener(this)
        view.btnAudioMsg.setOnClickListener(this)
        view.btnTextMsg.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.msgListContainer -> {
                InputMethodUtil.hideKeyboard(v)
            }
            R.id.btnAudioMsg -> {
                InputMethodUtil.hideKeyboard(v)
                btnAudioRecord.visibility = View.VISIBLE
                btnTextMsg.visibility = View.VISIBLE
                editTextMessage.visibility = View.INVISIBLE
                btnAudioMsg.visibility = View.INVISIBLE
            }
            R.id.btnTextMsg -> {
                InputMethodUtil.showKeyboard(editTextMessage)
                editTextMessage.visibility = View.VISIBLE
                btnAudioMsg.visibility = View.VISIBLE
                btnAudioRecord.visibility = View.INVISIBLE
                btnTextMsg.visibility = View.INVISIBLE
            }
        }
    }
}