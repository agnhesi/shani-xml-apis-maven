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
 * Script statements. See the SCRIPT element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLScriptElement
    extends HTMLElement {
    /**
     * The script content of the element.
     *
     * @return DOCUMENT ME!
     */
    public String getText();

    /**
     * The script content of the element.
     *
     * @param text DOCUMENT ME!
     */
    public void setText(String text);

    /**
     * Reserved for future use.
     *
     * @return DOCUMENT ME!
     */
    public String getHtmlFor();

    /**
     * Reserved for future use.
     *
     * @param htmlFor DOCUMENT ME!
     */
    public void setHtmlFor(String htmlFor);

    /**
     * Reserved for future use.
     *
     * @return DOCUMENT ME!
     */
    public String getEvent();

    /**
     * Reserved for future use.
     *
     * @param event DOCUMENT ME!
     */
    public void setEvent(String event);

    /**
     * The character encoding of the linked resource. See the charset attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCharset();

    /**
     * The character encoding of the linked resource. See the charset attribute
     * definition in HTML 4.01.
     *
     * @param charset DOCUMENT ME!
     */
    public void setCharset(String charset);

    /**
     * Indicates that the user agent can defer processing of the script. See
     * the defer attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getDefer();

    /**
     * Indicates that the user agent can defer processing of the script. See
     * the defer attribute definition in HTML 4.01.
     *
     * @param defer DOCUMENT ME!
     */
    public void setDefer(boolean defer);

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating an external script. See the src attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getSrc();

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating an external script. See the src attribute definition in
     * HTML 4.01.
     *
     * @param src DOCUMENT ME!
     */
    public void setSrc(String src);

    /**
     * The content type of the script language. See the type attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * The content type of the script language. See the type attribute
     * definition in HTML 4.01.
     *
     * @param type DOCUMENT ME!
     */
    public void setType(String type);
}