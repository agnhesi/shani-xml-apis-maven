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


/**
 * The <code>CSSPageRule</code> interface represents a  &commat;page rule
 * within a CSS style sheet. The <code>&commat;page</code> rule is used to
 * specify the dimensions, orientation, margins, etc. of a page box for paged
 * media.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification </a>.
 * </p>
 *
 * @since DOM Level 2
 */
public interface CSSPageRule
    extends CSSRule {
    /**
     * The parsable textual representation of the page selector for the rule.
     *
     * @return DOCUMENT ME!
     */
    public String getSelectorText();

    /**
     * DOCUMENT ME!
     *
     * @param selectorText DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setSelectorText(String selectorText)
        throws DOMException;

    /**
     * The declaration-block of this rule.
     *
     * @return DOCUMENT ME!
     */
    public CSSStyleDeclaration getStyle();
}