/*
 * Copyright (C) 2005 by Quentin Anciaux
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Library General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Library General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Library General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 *	@author Quentin Anciaux
 */

package org.w3c.dom.css;

import org.w3c.dom.stylesheets.MediaList;


/**
 * The <code>CSSImportRule</code> interface represents a  &commat;import rule
 * within a CSS style sheet. The <code>&commat;import</code> rule is used to
 * import style rules from other style sheets.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification </a>.
 * </p>
 *
 * @since DOM Level 2
 */
public interface CSSImportRule
    extends CSSRule {
    /**
     * The location of the style sheet to be imported. The attribute will not
     * contain the <code>"url(...)"</code> specifier around the URI.
     *
     * @return DOCUMENT ME!
     */
    public String getHref();

    /**
     * A list of media types for which this style sheet may be used.
     *
     * @return DOCUMENT ME!
     */
    public MediaList getMedia();

    /**
     * The style sheet referred to by this rule, if it has been loaded. The
     * value of this attribute is <code>null</code> if the style sheet has not
     * yet been loaded or if it will not be loaded (e.g. if the style sheet is
     * for a media type not supported by the user agent).
     *
     * @return DOCUMENT ME!
     */
    public CSSStyleSheet getStyleSheet();
}