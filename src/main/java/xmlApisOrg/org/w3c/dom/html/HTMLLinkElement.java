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
 * The <code>LINK</code> element specifies a link to an external resource, and
 * defines this document's relationship to that resource (or vice versa). See
 * the LINK element definition in HTML 4.01 (see also the
 * <code>LinkStyle</code> interface in the StyleSheet module [ <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>DOM Level 2
 * Style Sheets and CSS </a>]).
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLLinkElement
    extends HTMLElement {
    /**
     * Enables/disables the link. This is currently only used for style sheet
     * links, and may be used to activate or deactivate style sheets.
     *
     * @return DOCUMENT ME!
     */
    public boolean getDisabled();

    /**
     * Enables/disables the link. This is currently only used for style sheet
     * links, and may be used to activate or deactivate style sheets.
     *
     * @param disabled DOCUMENT ME!
     */
    public void setDisabled(boolean disabled);

    /**
     * The character encoding of the resource being linked to. See the charset
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCharset();

    /**
     * The character encoding of the resource being linked to. See the charset
     * attribute definition in HTML 4.01.
     *
     * @param charset DOCUMENT ME!
     */
    public void setCharset(String charset);

    /**
     * The URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] of the linked resource. See the href attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHref();

    /**
     * The URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] of the linked resource. See the href attribute definition in HTML
     * 4.01.
     *
     * @param href DOCUMENT ME!
     */
    public void setHref(String href);

    /**
     * Language code of the linked resource. See the hreflang attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHreflang();

    /**
     * Language code of the linked resource. See the hreflang attribute
     * definition in HTML 4.01.
     *
     * @param hreflang DOCUMENT ME!
     */
    public void setHreflang(String hreflang);

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
     * Forward link type. See the rel attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getRel();

    /**
     * Forward link type. See the rel attribute definition in HTML 4.01.
     *
     * @param rel DOCUMENT ME!
     */
    public void setRel(String rel);

    /**
     * Reverse link type. See the rev attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getRev();

    /**
     * Reverse link type. See the rev attribute definition in HTML 4.01.
     *
     * @param rev DOCUMENT ME!
     */
    public void setRev(String rev);

    /**
     * Frame to render the resource in. See the target attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getTarget();

    /**
     * Frame to render the resource in. See the target attribute definition in
     * HTML 4.01.
     *
     * @param target DOCUMENT ME!
     */
    public void setTarget(String target);

    /**
     * Advisory content type. See the type attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * Advisory content type. See the type attribute definition in HTML 4.01.
     *
     * @param type DOCUMENT ME!
     */
    public void setType(String type);
}