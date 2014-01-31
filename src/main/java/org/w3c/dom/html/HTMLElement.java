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

import org.w3c.dom.Element;


/**
 * All HTML element interfaces derive from this class. Elements that only
 * expose the HTML core attributes are represented by the base
 * <code>HTMLElement</code> interface. These elements are as follows: special:
 * SUB, SUP, SPAN, BDOfont: TT, I, B, U, S, STRIKE, BIG, SMALL phrase: EM,
 * STRONG, DFN, CODE, SAMP, KBD, VAR, CITE, ACRONYM, ABBRlist: DD, DTNOFRAMES,
 * NOSCRIPTADDRESS, CENTERThe <code>style</code> attribute of an HTML element
 * is accessible through the <code>ElementCSSInlineStyle</code> interface
 * which is defined in the CSS module [ <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>DOM Level 2
 * Style Sheets and CSS </a>].
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLElement
    extends Element {
    /**
     * The element's identifier. See the id attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getId();

    /**
     * The element's identifier. See the id attribute definition in HTML 4.01.
     *
     * @param id DOCUMENT ME!
     */
    public void setId(String id);

    /**
     * The element's advisory title. See the title attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getTitle();

    /**
     * The element's advisory title. See the title attribute definition in HTML
     * 4.01.
     *
     * @param title DOCUMENT ME!
     */
    public void setTitle(String title);

    /**
     * Language code defined in RFC 1766. See the lang attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getLang();

    /**
     * Language code defined in RFC 1766. See the lang attribute definition in
     * HTML 4.01.
     *
     * @param lang DOCUMENT ME!
     */
    public void setLang(String lang);

    /**
     * Specifies the base direction of directionally neutral text and the
     * directionality of tables. See the dir attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getDir();

    /**
     * Specifies the base direction of directionally neutral text and the
     * directionality of tables. See the dir attribute definition in HTML
     * 4.01.
     *
     * @param dir DOCUMENT ME!
     */
    public void setDir(String dir);

    /**
     * The class attribute of the element. This attribute has been renamed due
     * to conflicts with the "class" keyword exposed by many languages. See
     * the class attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getClassName();

    /**
     * The class attribute of the element. This attribute has been renamed due
     * to conflicts with the "class" keyword exposed by many languages. See
     * the class attribute definition in HTML 4.01.
     *
     * @param className DOCUMENT ME!
     */
    public void setClassName(String className);
}