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

import org.w3c.dom.DOMException;


/**
 * The select element allows the selection of an option. The contained options
 * can be directly accessed through the select element as a collection. See
 * the SELECT element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLSelectElement
    extends HTMLElement {
    /**
     * The type of this form control. This is the string "select-multiple" when
     * the multiple attribute is <code>true</code> and the string "select-one"
     * when <code>false</code>.
     *
     * @return DOCUMENT ME!
     */
    public String getType();

    /**
     * The ordinal index of the selected option, starting from 0. The value -1
     * is returned if no element is selected. If multiple options are
     * selected, the index of the first selected option is returned.
     *
     * @return DOCUMENT ME!
     */
    public int getSelectedIndex();

    /**
     * The ordinal index of the selected option, starting from 0. The value -1
     * is returned if no element is selected. If multiple options are
     * selected, the index of the first selected option is returned.
     *
     * @param selectedIndex DOCUMENT ME!
     */
    public void setSelectedIndex(int selectedIndex);

    /**
     * The current form control value (i.e. the value of the currently selected
     * option), if multiple options are selected this is the value of the
     * first selected option.
     *
     * @return DOCUMENT ME!
     */
    public String getValue();

    /**
     * The current form control value (i.e. the value of the currently selected
     * option), if multiple options are selected this is the value of the
     * first selected option.
     *
     * @param value DOCUMENT ME!
     */
    public void setValue(String value);

    /**
     * The number of options in this <code>SELECT</code>.
     *
     * @return DOCUMENT ME!
     */
    public int getLength();

    /**
     * The number of options in this <code>SELECT</code>.
     *
     * @param length DOCUMENT ME!
     *
     * @exception DOMException NOT_SUPPORTED_ERR: if setting the length is not
     *            allowed by the implementation.
     */
    public void setLength(int length)
        throws DOMException;

    /**
     * Returns the <code>FORM</code> element containing this control. Returns
     * <code>null</code> if this control is not within the context of a form.
     *
     * @return DOCUMENT ME!
     */
    public HTMLFormElement getForm();

    /**
     * The collection of <code>OPTION</code> elements contained by this
     * element.
     *
     * @return DOCUMENT ME!
     */
    public HTMLOptionsCollection getOptions();

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
     * If true, multiple <code>OPTION</code> elements may be selected in this
     * <code>SELECT</code>. See the multiple attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getMultiple();

    /**
     * If true, multiple <code>OPTION</code> elements may be selected in this
     * <code>SELECT</code>. See the multiple attribute definition in HTML
     * 4.01.
     *
     * @param multiple DOCUMENT ME!
     */
    public void setMultiple(boolean multiple);

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
     * Number of visible rows. See the size attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getSize();

    /**
     * Number of visible rows. See the size attribute definition in HTML 4.01.
     *
     * @param size DOCUMENT ME!
     */
    public void setSize(int size);

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
     * Add a new element to the collection of <code>OPTION</code> elements for
     * this <code>SELECT</code>. This method is the equivalent of the
     * <code>appendChild</code> method of the <code>Node</code> interface if
     * the <code>before</code> parameter is <code>null</code>. It is
     * equivalent to the <code>insertBefore</code> method on the parent of
     * <code>before</code> in all other cases. This method may have no effect
     * if the new element is not an <code>OPTION</code> or an
     * <code>OPTGROUP</code>.
     *
     * @param element The element to add.
     * @param before The element to insert before, or <code>null</code> for the
     *        tail of the list.
     *
     * @exception DOMException NOT_FOUND_ERR: Raised if <code>before</code> is
     *            not a descendant of the <code>SELECT</code> element.
     */
    public void add(
        HTMLElement element,
        HTMLElement before
    )
        throws DOMException;

    /**
     * Remove an element from the collection of <code>OPTION</code> elements
     * for this <code>SELECT</code>. Does nothing if no element has the given
     * index.
     *
     * @param index The index of the item to remove, starting from 0.
     */
    public void remove(int index);

    /**
     * Removes keyboard focus from this element.
     */
    public void blur();

    /**
     * Gives keyboard focus to this element.
     */
    public void focus();
}