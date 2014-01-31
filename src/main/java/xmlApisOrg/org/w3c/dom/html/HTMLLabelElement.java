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
 * Form field label text. See the LABEL element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLLabelElement
    extends HTMLElement {
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
     * This attribute links this label with another form control by
     * <code>id</code> attribute. See the for attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHtmlFor();

    /**
     * This attribute links this label with another form control by
     * <code>id</code> attribute. See the for attribute definition in HTML
     * 4.01.
     *
     * @param htmlFor DOCUMENT ME!
     */
    public void setHtmlFor(String htmlFor);
}