package io.jmdg.spanly.helpers

import android.text.Spannable
import android.text.SpannableString

/**
 * Created by Joshua de Guzman on 2/11/19.
 */

internal fun span(charSequence: CharSequence, o: Any) =
    (if (charSequence is String) SpannableString(charSequence) else charSequence as? SpannableString ?: SpannableString(
        ""
    )).apply {
        setSpan(
            o,
            0,
            length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }