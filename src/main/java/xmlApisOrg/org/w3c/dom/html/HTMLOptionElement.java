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
 * A selectable choice. See the OPTION element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLOptionElement
    extends HTMLElement {
    /**
     * Returns the <code>FORM</code> element containing this control. Returns
     * <code>null</code> if this control is not within the context of a form.
     *
     * @return DOCUMENT ME!
     */
    public HTMLFormElement getForm();

    /**
     * Represents the value of the HTML selected attribute. The value of this
     * attribute does not change if the state of the corresponding form
     * control, in an interactive user agent, changes. See the selected
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getDefaultSelected();

    /**
     * Represents the value of the HTML selected attribute. The value of this
     * attribute does not change if the state of the corresponding form
     * control, in an interactive user agent, changes. See the selected
     * attribute definition in HTML 4.01.
     *
     * @param defaultSelected DOCUMENT ME!
     */
    public void setDefaultSelected(boolean defaultSelected);

    /**
     * The text contained within the option element.
     *
     * @return DOCUMENT ME!
     */
    public String getText();

    /**
     * The index of this <code>OPTION</code> in its parent <code>SELECT</code>,
     * starting from 0.
     *
     * @return DOCUMENT ME!
     */
    public int getIndex();

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
     * Option label for use in hierarchical menus. See the label attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getLabel();

    /**
     * Option label for use in hierarchical menus. See the label attribute
     * definition in HTML 4.01.
     *
     * @param label DOCUMENT ME!
     */
    public void setLabel(String label);

    /**
     * Represents the current state of the corresponding form control, in an
     * interactive user agent. Changing this attribute changes the state of
     * the form control, but does not change the value of the HTML selected
     * attribute of the element.
     *
     * @return DOCUMENT ME!
     */
    public boolean getSelected();

    /**
     * Represents the current state of the corresponding form control, in an
     * interactive user agent. Changing this attribute changes the state of
     * the form control, but does not change the value of the HTML selected
     * attribute of the element.
     *
     * @param selected DOCUMENT ME!
     */
    public void setSelected(boolean selected);

    /**
     * The current form control value. See the value attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getValue();

    /**
     * The current form control value. See the value attribute definition in
     * HTML 4.01.
     *
     * @param value DOCUMENT ME!
     */
    public void setValue(String value);
}