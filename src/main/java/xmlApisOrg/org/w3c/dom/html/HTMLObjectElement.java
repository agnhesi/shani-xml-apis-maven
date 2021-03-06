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

import org.w3c.dom.Document;


/**
 * Generic embedded object.In principle, all properties on the object element
 * are read-write but in some environments some properties may be read-only
 * once the underlying object is instantiated. See the OBJECT element
 * definition in [ <a
 * href='http://www.w3.org/TR/1999/REC-html401-19991224'>HTML 4.01 </a>].
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLObjectElement
    extends HTMLElement {
    /**
     * Returns the <code>FORM</code> element containing this control. Returns
     * <code>null</code> if this control is not within the context of a form.
     *
     * @return DOCUMENT ME!
     */
    public HTMLFormElement getForm();

    /**
     * Applet class file. See the <code>code</code> attribute for
     * HTMLAppletElement.
     *
     * @return DOCUMENT ME!
     */
    public String getCode();

    /**
     * Applet class file. See the <code>code</code> attribute for
     * HTMLAppletElement.
     *
     * @param code DOCUMENT ME!
     */
    public void setCode(String code);

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
     * Space-separated list of archives. See the archive attribute definition
     * in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getArchive();

    /**
     * Space-separated list of archives. See the archive attribute definition
     * in HTML 4.01.
     *
     * @param archive DOCUMENT ME!
     */
    public void setArchive(String archive);

    /**
     * Width of border around the object. See the border attribute definition
     * in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getBorder();

    /**
     * Width of border around the object. See the border attribute definition
     * in HTML 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param border DOCUMENT ME!
     */
    public void setBorder(String border);

    /**
     * Base URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] for <code>classid</code>,<code>data</code>, and
     * <code>archive</code> attributes. See the codebase attribute definition
     * in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCodeBase();

    /**
     * Base URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] for <code>classid</code>,<code>data</code>, and
     * <code>archive</code> attributes. See the codebase attribute definition
     * in HTML 4.01.
     *
     * @param codeBase DOCUMENT ME!
     */
    public void setCodeBase(String codeBase);

    /**
     * Content type for data downloaded via <code>classid</code> attribute. See
     * the codetype attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCodeType();

    /**
     * Content type for data downloaded via <code>classid</code> attribute. See
     * the codetype attribute definition in HTML 4.01.
     *
     * @param codeType DOCUMENT ME!
     */
    public void setCodeType(String codeType);

    /**
     * A URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] specifying the location of the object's data. See the data
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getData();

    /**
     * A URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] specifying the location of the object's data. See the data
     * attribute definition in HTML 4.01.
     *
     * @param data DOCUMENT ME!
     */
    public void setData(String data);

    /**
     * Declare (for future reference), but do not instantiate, this object. See
     * the declare attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getDeclare();

    /**
     * Declare (for future reference), but do not instantiate, this object. See
     * the declare attribute definition in HTML 4.01.
     *
     * @param declare DOCUMENT ME!
     */
    public void setDeclare(boolean declare);

    /**
     * Override height. See the height attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHeight();

    /**
     * Override height. See the height attribute definition in HTML 4.01.
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
     * Form control or object name when submitted with a form. See the name
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * Form control or object name when submitted with a form. See the name
     * attribute definition in HTML 4.01.
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

    /**
     * Message to render while loading the object. See the standby attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getStandby();

    /**
     * Message to render while loading the object. See the standby attribute
     * definition in HTML 4.01.
     *
     * @param standby DOCUMENT ME!
     */
    public void setStandby(String standby);

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
     * Content type for data downloaded via <code>data</code> attribute. See
     * the type attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * Content type for data downloaded via <code>data</code> attribute. See
     * the type attribute definition in HTML 4.01.
     *
     * @param type DOCUMENT ME!
     */
    public void setType(String type);

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
     * Override width. See the width attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getWidth();

    /**
     * Override width. See the width attribute definition in HTML 4.01.
     *
     * @param width DOCUMENT ME!
     */
    public void setWidth(String width);

    /**
     * The document this object contains, if there is any and it is available,
     * or <code>null</code> otherwise.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 2
     */
    public Document getContentDocument();
}