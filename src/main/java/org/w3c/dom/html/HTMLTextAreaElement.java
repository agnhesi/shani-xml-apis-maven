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
 * Multi-line text field. See the TEXTAREA element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLTextAreaElement
    extends HTMLElement {
    /**
     * Represents the contents of the element. The value of this attribute does
     * not change if the contents of the corresponding form control, in an
     * interactive user agent, changes.
     *
     * @return DOCUMENT ME!
     */
    public String getDefaultValue();

    /**
     * Represents the contents of the element. The value of this attribute does
     * not change if the contents of the corresponding form control, in an
     * interactive user agent, changes.
     *
     * @param defaultValue DOCUMENT ME!
     */
    public void setDefaultValue(String defaultValue);

    /**
     * Returns the <code>FORM</code> element containing this control. Returns
     * <code>null</code> if this control is not within the context of a form.
     *
     * @return DOCUMENT ME!
     */
    public HTMLFormElement getForm();

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
     * Width of control (in characters). See the cols attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getCols();

    /**
     * Width of control (in characters). See the cols attribute definition in
     * HTML 4.01.
     *
     * @param cols DOCUMENT ME!
     */
    public void setCols(int cols);

    /**
     * The control is unavailable in this context. See the disabled attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getDisabled();

    /**
     * The control is unavailable in this context. See the disabled attribute
     * definition in HTML 4.01.
     *
     * @param disabled DOCUMENT ME!
     */
    public void setDisabled(boolean disabled);

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
     * This control is read-only. See the readonly attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getReadOnly();

    /**
     * This control is read-only. See the readonly attribute definition in HTML
     * 4.01.
     *
     * @param readOnly DOCUMENT ME!
     */
    public void setReadOnly(boolean readOnly);

    /**
     * Number of text rows. See the rows attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getRows();

    /**
     * Number of text rows. See the rows attribute definition in HTML 4.01.
     *
     * @param rows DOCUMENT ME!
     */
    public void setRows(int rows);

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
     * The type of this form control. This the string "textarea".
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * Represents the current contents of the corresponding form control, in an
     * interactive user agent. Changing this attribute changes the contents of
     * the form control, but does not change the contents of the element. If
     * the entirety of the data can not fit into a single
     * <code>DOMString</code>, the implementation may truncate the data.
     *
     * @return DOCUMENT ME!
     */
    public String getValue();

    /**
     * Represents the current contents of the corresponding form control, in an
     * interactive user agent. Changing this attribute changes the contents of
     * the form control, but does not change the contents of the element. If
     * the entirety of the data can not fit into a single
     * <code>DOMString</code>, the implementation may truncate the data.
     *
     * @param value DOCUMENT ME!
     */
    public void setValue(String value);

    /**
     * Removes keyboard focus from this element.
     */
    public void blur();

    /**
     * Gives keyboard focus to this element.
     */
    public void focus();

    /**
     * Select the contents of the <code>TEXTAREA</code>.
     */
    public void select();
}