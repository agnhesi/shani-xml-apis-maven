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

package org.w3c.dom.html;

/**
 * Base font. See the BASEFONT element definition in HTML 4.01. This element is
 * deprecated in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLBaseFontElement
    extends HTMLElement {
    /**
     * Font color. See the color attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getColor();

    /**
     * Font color. See the color attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param color DOCUMENT ME!
     */
    public void setColor(String color);

    /**
     * Font face identifier. See the face attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getFace();

    /**
     * Font face identifier. See the face attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @param face DOCUMENT ME!
     */
    public void setFace(String face);

    /**
     * Computed font size. See the size attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getSize();

    /**
     * Computed font size. See the size attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param size DOCUMENT ME!
     */
    public void setSize(int size);
}