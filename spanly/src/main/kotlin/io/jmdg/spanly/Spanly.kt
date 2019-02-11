package io.jmdg.spanly

import android.text.TextUtils
import io.jmdg.spanly.helpers.span

/**
 * Created by Joshua de Guzman on 2/11/19.
 */

class Spanly {

    companion object {
        val TAG = Spanly::class.java.simpleName
    }

    var spanly: CharSequence = ""

    fun append(text: CharSequence, vararg spans: Any): Spanly {
        var _text = text
        spans.forEach { span ->
            _text = span(_text, span)
        }
        spanly = TextUtils.concat(spanly, _text)
        return this
    }

    fun build() = spanly
}