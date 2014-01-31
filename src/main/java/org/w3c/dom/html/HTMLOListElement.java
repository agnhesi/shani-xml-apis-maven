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
 * Ordered list. See the OL element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLOListElement
    extends HTMLElement {
    /**
     * Reduce spacing between list items. See the compact attribute definition
     * in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getCompact();

    /**
     * Reduce spacing between list items. See the compact attribute definition
     * in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param compact DOCUMENT ME!
     */
    public void setCompact(boolean compact);

    /**
     * Starting sequence number. See the start attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getStart();

    /**
     * Starting sequence number. See the start attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param start DOCUMENT ME!
     */
    public void setStart(int start);

    /**
     * Numbering style. See the type attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * Numbering style. See the type attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param type DOCUMENT ME!
     */
    public void setType(String type);
}