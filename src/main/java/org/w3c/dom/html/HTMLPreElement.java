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
 * Preformatted text. See the PRE element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLPreElement
    extends HTMLElement {
    /**
     * Fixed width for content. See the width attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getWidth();

    /**
     * Fixed width for content. See the width attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param width DOCUMENT ME!
     */
    public void setWidth(int width);
}