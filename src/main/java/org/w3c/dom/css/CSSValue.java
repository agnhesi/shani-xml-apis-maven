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
 * The <code>CSSValue</code> interface represents a simple or a complex value.
 * A <code>CSSValue</code> object only occurs in a context of a CSS property.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification </a>.
 * </p>
 *
 * @since DOM Level 2
 */
public interface CSSValue {
    // UnitTypes

    /**
     * The value is inherited and the <code>cssText</code> contains "inherit".
     */
    public static final short CSS_INHERIT = 0;

    /**
     * The value is a primitive value and an instance of the
     * <code>CSSPrimitiveValue</code> interface can be obtained by using
     * binding-specific casting methods on this instance of the
     * <code>CSSValue</code> interface.
     */
    public static final short CSS_PRIMITIVE_VALUE = 1;

    /**
     * The value is a <code>CSSValue</code> list and an instance of the
     * <code>CSSValueList</code> interface can be obtained by using
     * binding-specific casting methods on this instance of the
     * <code>CSSValue</code> interface.
     */
    public static final short CSS_VALUE_LIST = 2;

    /** The value is a custom value. */
    public static final short CSS_CUSTOM = 3;

    /**
     * A string representation of the current value.
     *
     * @return DOCUMENT ME!
     */
    public String getCssText();

    /**
     * DOCUMENT ME!
     *
     * @param cssText DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCssText(String cssText)
        throws DOMException;

    /**
     * A code defining the type of the value as defined above.
     *
     * @return DOCUMENT ME!
     */
    public short getCssValueType();
}