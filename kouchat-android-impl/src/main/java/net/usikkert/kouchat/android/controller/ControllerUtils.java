
/***************************************************************************
 *   Copyright 2006-2013 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This file is part of KouChat.                                         *
 *                                                                         *
 *   KouChat is free software; you can redistribute it and/or modify       *
 *   it under the terms of the GNU Lesser General Public License as        *
 *   published by the Free Software Foundation, either version 3 of        *
 *   the License, or (at your option) any later version.                   *
 *                                                                         *
 *   KouChat is distributed in the hope that it will be useful,            *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU      *
 *   Lesser General Public License for more details.                       *
 *                                                                         *
 *   You should have received a copy of the GNU Lesser General Public      *
 *   License along with KouChat.                                           *
 *   If not, see <http://www.gnu.org/licenses/>.                           *
 ***************************************************************************/

package net.usikkert.kouchat.android.controller;

import android.text.Layout;
import android.widget.TextView;

/**
 * Reusable functionality for controllers.
 *
 * @author Christian Ihle
 */
public final class ControllerUtils {

    private ControllerUtils() {
        // Only static methods
    }

    /** Number of milliseconds in a second. */
    public static final int ONE_SECOND = 1000;

    /**
     * Scrolls to the last line of text in a text view.
     *
     * @param textView The text view to scroll.
     */
    public static void scrollTextViewToBottom(final TextView textView) {
        final Layout layout = textView.getLayout();

        // Happens sometimes when activity is hidden
        if (layout == null) {
            return;

        }

        final int scrollAmount = layout.getLineTop(textView.getLineCount()) - textView.getHeight();

        // if there is no need to scroll, scrollAmount will be <=0
        if (scrollAmount > 0) {
            textView.scrollTo(0, scrollAmount);
        }

        else {
            textView.scrollTo(0, 0);
        }
    }
}
