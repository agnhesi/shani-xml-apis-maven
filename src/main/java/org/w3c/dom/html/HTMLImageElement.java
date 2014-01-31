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
 * Embedded image. See the IMG element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLImageElement
    extends HTMLElement {
    /**
     * The name of the element (for backwards compatibility).
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * The name of the element (for backwards compatibility).
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

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
     * element. See the alt attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAlt();

    /**
     * Alternate text for user agents not rendering the normal content of this
     * element. See the alt attribute definition in HTML 4.01.
     *
     * @param alt DOCUMENT ME!
     */
    public void setAlt(String alt);

    /**
     * Width of border around image. See the border attribute definition in
     * HTML 4.01. This attribute is deprecated in HTML 4.01. Note that the
     * type of this attribute was <code>DOMString</code> in DOM Level 1 HTML [
     * <a href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level
     * 1 </a>] .
     *
     * @return DOCUMENT ME!
     */
    public String getBorder();

    /**
     * Width of border around image. See the border attribute definition in
     * HTML 4.01. This attribute is deprecated in HTML 4.01. Note that the
     * type of this attribute was <code>DOMString</code> in DOM Level 1 HTML [
     * <a href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level
     * 1 </a>] .
     *
     * @param border DOCUMENT ME!
     */
    public void setBorder(String border);

    /**
     * Height of the image in pixels. See the height attribute definition in
     * HTML 4.01. Note that the type of this attribute was
     * <code>DOMString</code> in DOM Level 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @return DOCUMENT ME!
     */
    public int getHeight();

    /**
     * Height of the image in pixels. See the height attribute definition in
     * HTML 4.01. Note that the type of this attribute was
     * <code>DOMString</code> in DOM Level 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @param height DOCUMENT ME!
     */
    public void setHeight(int height);

    /**
     * Horizontal space to the left and right of this image in pixels. See the
     * hspace attribute definition in HTML 4.01. This attribute is deprecated
     * in HTML 4.01. Note that the type of this attribute was
     * <code>DOMString</code> in DOM Level 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @return DOCUMENT ME!
     */
    public int getHspace();

    /**
     * Horizontal space to the left and right of this image in pixels. See the
     * hspace attribute definition in HTML 4.01. This attribute is deprecated
     * in HTML 4.01. Note that the type of this attribute was
     * <code>DOMString</code> in DOM Level 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @param hspace DOCUMENT ME!
     */
    public void setHspace(int hspace);

    /**
     * Use server-side image map. See the ismap attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getIsMap();

    /**
     * Use server-side image map. See the ismap attribute definition in HTML
     * 4.01.
     *
     * @param isMap DOCUMENT ME!
     */
    public void setIsMap(boolean isMap);

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating a long description of this image or frame. See the longdesc
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getLongDesc();

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating a long description of this image or frame. See the longdesc
     * attribute definition in HTML 4.01.
     *
     * @param longDesc DOCUMENT ME!
     */
    public void setLongDesc(String longDesc);

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating the source of this image. See the src attribute definition
     * in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getSrc();

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating the source of this image. See the src attribute definition
     * in HTML 4.01.
     *
     * @param src DOCUMENT ME!
     */
    public void setSrc(String src);

    /**
     * Use client-side image map. See the usemap attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getUseMap();

    /**
     * Use client-side image map. See the usemap attribute definition in HTML
     * 4.01.
     *
     * @param useMap DOCUMENT ME!
     */
    public void setUseMap(String useMap);

    /**
     * Vertical space above and below this image in pixels. See the vspace
     * attribute definition in HTML 4.01. This attribute is deprecated in HTML
     * 4.01. Note that the type of this attribute was "DOMString" in DOM Level
     * 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @return DOCUMENT ME!
     */
    public int getVspace();

    /**
     * Vertical space above and below this image in pixels. See the vspace
     * attribute definition in HTML 4.01. This attribute is deprecated in HTML
     * 4.01. Note that the type of this attribute was "DOMString" in DOM Level
     * 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @param vspace DOCUMENT ME!
     */
    public void setVspace(int vspace);

    /**
     * The width of the image in pixels. See the width attribute definition in
     * HTML 4.01. Note that the type of this attribute was
     * <code>DOMString</code> in DOM Level 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @return DOCUMENT ME!
     */
    public int getWidth();

    /**
     * The width of the image in pixels. See the width attribute definition in
     * HTML 4.01. Note that the type of this attribute was
     * <code>DOMString</code> in DOM Level 1 HTML [ <a
     * href='http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001'>DOM Level 1
     * </a>].
     *
     * @param width DOCUMENT ME!
     */
    public void setWidth(int width);
}