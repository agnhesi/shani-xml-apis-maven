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
 * Style information. See the STYLE element definition in HTML 4.01, the CSS
 * module [ <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>DOM Level 2
 * Style Sheets and CSS </a>] and the <code>LinkStyle</code> interface in the
 * StyleSheets module [ <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>DOM Level 2
 * Style Sheets and CSS </a>].
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLStyleElement
    extends HTMLElement {
    /**
     * Enables/disables the style sheet.
     *
     * @return DOCUMENT ME!
     */
    public boolean getDisabled();

    /**
     * Enables/disables the style sheet.
     *
     * @param disabled DOCUMENT ME!
     */
    public void setDisabled(boolean disabled);

    /**
     * Designed for use with one or more target media. See the media attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getMedia();

    /**
     * Designed for use with one or more target media. See the media attribute
     * definition in HTML 4.01.
     *
     * @param media DOCUMENT ME!
     */
    public void setMedia(String media);

    /**
     * The content type of the style sheet language. See the type attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * The content type of the style sheet language. See the type attribute
     * definition in HTML 4.01.
     *
     * @param type DOCUMENT ME!
     */
    public void setType(String type);
}