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
 * The HTML document body. This element is always present in the DOM API, even
 * if the tags are not present in the source document. See the BODY element
 * definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLBodyElement
    extends HTMLElement {
    /**
     * Color of active links (after mouse-button down, but before mouse-button
     * up). See the alink attribute definition in HTML 4.01. This attribute is
     * deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getALink();

    /**
     * Color of active links (after mouse-button down, but before mouse-button
     * up). See the alink attribute definition in HTML 4.01. This attribute is
     * deprecated in HTML 4.01.
     *
     * @param aLink DOCUMENT ME!
     */
    public void setALink(String aLink);

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * of the background texture tile image. See the background attribute
     * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getBackground();

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * of the background texture tile image. See the background attribute
     * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param background DOCUMENT ME!
     */
    public void setBackground(String background);

    /**
     * Document background color. See the bgcolor attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getBgColor();

    /**
     * Document background color. See the bgcolor attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param bgColor DOCUMENT ME!
     */
    public void setBgColor(String bgColor);

    /**
     * Color of links that are not active and unvisited. See the link attribute
     * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getLink();

    /**
     * Color of links that are not active and unvisited. See the link attribute
     * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param link DOCUMENT ME!
     */
    public void setLink(String link);

    /**
     * Document text color. See the text attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getText();

    /**
     * Document text color. See the text attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @param text DOCUMENT ME!
     */
    public void setText(String text);

    /**
     * Color of links that have been visited by the user. See the vlink
     * attribute definition in HTML 4.01. This attribute is deprecated in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getVLink();

    /**
     * Color of links that have been visited by the user. See the vlink
     * attribute definition in HTML 4.01. This attribute is deprecated in HTML
     * 4.01.
     *
     * @param vLink DOCUMENT ME!
     */
    public void setVLink(String vLink);
}