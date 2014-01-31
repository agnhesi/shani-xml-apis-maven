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
 * Parameters fed to the <code>OBJECT</code> element. See the PARAM element
 * definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLParamElement
    extends HTMLElement {
    /**
     * The name of a run-time parameter. See the name attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * The name of a run-time parameter. See the name attribute definition in
     * HTML 4.01.
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

    /**
     * Content type for the <code>value</code> attribute when
     * <code>valuetype</code> has the value "ref". See the type attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * Content type for the <code>value</code> attribute when
     * <code>valuetype</code> has the value "ref". See the type attribute
     * definition in HTML 4.01.
     *
     * @param type DOCUMENT ME!
     */
    public void setType(String type);

    /**
     * The value of a run-time parameter. See the value attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getValue();

    /**
     * The value of a run-time parameter. See the value attribute definition in
     * HTML 4.01.
     *
     * @param value DOCUMENT ME!
     */
    public void setValue(String value);

    /**
     * Information about the meaning of the <code>value</code> attribute value.
     * See the valuetype attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getValueType();

    /**
     * Information about the meaning of the <code>value</code> attribute value.
     * See the valuetype attribute definition in HTML 4.01.
     *
     * @param valueType DOCUMENT ME!
     */
    public void setValueType(String valueType);
}