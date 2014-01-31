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
 * An embedded Java applet. See the APPLET element definition in HTML 4.01.
 * This element is deprecated in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLAppletElement
    extends HTMLElement {
    /**
     * Aligns this object (vertically or horizontally) with respect to its
     * surrounding text. See the align attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAlign();

    /**
     * Aligns this object (vertically or horizontally) with respect to its
     * surrounding text. See the align attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param align DOCUMENT ME!
     */
    public void setAlign(String align);

    /**
     * Alternate text for user agents not rendering the normal content of this
     * element. See the alt attribute definition in HTML 4.01. This attribute
     * is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAlt();

    /**
     * Alternate text for user agents not rendering the normal content of this
     * element. See the alt attribute definition in HTML 4.01. This attribute
     * is deprecated in HTML 4.01.
     *
     * @param alt DOCUMENT ME!
     */
    public void setAlt(String alt);

    /**
     * Comma-separated archive list. See the archive attribute definition in
     * HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getArchive();

    /**
     * Comma-separated archive list. See the archive attribute definition in
     * HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param archive DOCUMENT ME!
     */
    public void setArchive(String archive);

    /**
     * Applet class file. See the code attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCode();

    /**
     * Applet class file. See the code attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param code DOCUMENT ME!
     */
    public void setCode(String code);

    /**
     * Optional base URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF
     * RFC 2396 </a>] for applet. See the codebase attribute definition in
     * HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCodeBase();

    /**
     * Optional base URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF
     * RFC 2396 </a>] for applet. See the codebase attribute definition in
     * HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param codeBase DOCUMENT ME!
     */
    public void setCodeBase(String codeBase);

    /**
     * Override height. See the height attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHeight();

    /**
     * Override height. See the height attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param height DOCUMENT ME!
     */
    public void setHeight(String height);

    /**
     * Horizontal space, in pixels, to the left and right of this image,
     * applet, or object. See the hspace attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getHspace();

    /**
     * Horizontal space, in pixels, to the left and right of this image,
     * applet, or object. See the hspace attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @param hspace DOCUMENT ME!
     */
    public void setHspace(int hspace);

    /**
     * The name of the applet. See the name attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * The name of the applet. See the name attribute definition in HTML 4.01.
     * This attribute is deprecated in HTML 4.01.
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

    /**
     * The value of the "object" attribute. See the object attribute definition
     * in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getObject();

    /**
     * The value of the "object" attribute. See the object attribute definition
     * in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param object DOCUMENT ME!
     */
    public void setObject(String object);

    /**
     * Vertical space, in pixels, above and below this image, applet, or
     * object. See the vspace attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getVspace();

    /**
     * Vertical space, in pixels, above and below this image, applet, or
     * object. See the vspace attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param vspace DOCUMENT ME!
     */
    public void setVspace(int vspace);

    /**
     * Override width. See the width attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getWidth();

    /**
     * Override width. See the width attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param width DOCUMENT ME!
     */
    public void setWidth(String width);
}