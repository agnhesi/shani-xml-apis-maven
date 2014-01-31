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

import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;


/**
 * This interface allows the DOM user to create a <code>CSSStyleSheet</code>
 * outside the context of a document. There is no way to associate the new
 * <code>CSSStyleSheet</code> with a document in DOM Level 2.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification </a>.
 * </p>
 *
 * @since DOM Level 2
 */
public interface DOMImplementationCSS
    extends DOMImplementation {
    /**
     * Creates a new <code>CSSStyleSheet</code>.
     *
     * @param title The advisory title. See also the section.
     * @param media The comma-separated list of media associated with the new
     *        style sheet. See also the section.
     *
     * @return A new CSS style sheet.
     *
     * @exception DOMException SYNTAX_ERR: Raised if the specified media string
     *            value has a syntax error and is unparsable.
     */
    public CSSStyleSheet createCSSStyleSheet(
        String title,
        String media
    )
        throws DOMException;
}