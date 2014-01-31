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
 * The anchor element. See the A element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLAnchorElement
    extends HTMLElement {
    /**
     * A single character access key to give access to the form control. See
     * the accesskey attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAccessKey();

    /**
     * A single character access key to give access to the form control. See
     * the accesskey attribute definition in HTML 4.01.
     *
     * @param accessKey DOCUMENT ME!
     */
    public void setAccessKey(String accessKey);

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
     * Comma-separated list of lengths, defining an active region geometry. See
     * also <code>shape</code> for the shape of the region. See the coords
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCoords();

    /**
     * Comma-separated list of lengths, defining an active region geometry. See
     * also <code>shape</code> for the shape of the region. See the coords
     * attribute definition in HTML 4.01.
     *
     * @param coords DOCUMENT ME!
     */
    public void setCoords(String coords);

    /**
     * The absolute URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF
     * RFC 2396 </a>] of the linked resource. See the href attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHref();

    /**
     * The absolute URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF
     * RFC 2396 </a>] of the linked resource. See the href attribute
     * definition in HTML 4.01.
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
     * Anchor name. See the name attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * Anchor name. See the name attribute definition in HTML 4.01.
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

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
     * The shape of the active area. The coordinates are given by
     * <code>coords</code>. See the shape attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getShape();

    /**
     * The shape of the active area. The coordinates are given by
     * <code>coords</code>. See the shape attribute definition in HTML 4.01.
     *
     * @param shape DOCUMENT ME!
     */
    public void setShape(String shape);

    /**
     * Index that represents the element's position in the tabbing order. See
     * the tabindex attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getTabIndex();

    /**
     * Index that represents the element's position in the tabbing order. See
     * the tabindex attribute definition in HTML 4.01.
     *
     * @param tabIndex DOCUMENT ME!
     */
    public void setTabIndex(int tabIndex);

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

    /**
     * Removes keyboard focus from this element.
     */
    public void blur();

    /**
     * Gives keyboard focus to this element.
     */
    public void focus();
}