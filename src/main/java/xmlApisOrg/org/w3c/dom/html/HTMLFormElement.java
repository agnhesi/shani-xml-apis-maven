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
 * The <code>FORM</code> element encompasses behavior similar to a collection
 * and an element. It provides direct access to the contained form controls as
 * well as the attributes of the form element. See the FORM element definition
 * in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLFormElement
    extends HTMLElement {
    /**
     * Returns a collection of all form control elements in the form.
     *
     * @return DOCUMENT ME!
     */
    public HTMLCollection getElements();

    /**
     * The number of form controls in the form.
     *
     * @return DOCUMENT ME!
     */
    public int getLength();

    /**
     * Names the form.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * Names the form.
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

    /**
     * List of character sets supported by the server. See the accept-charset
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAcceptCharset();

    /**
     * List of character sets supported by the server. See the accept-charset
     * attribute definition in HTML 4.01.
     *
     * @param acceptCharset DOCUMENT ME!
     */
    public void setAcceptCharset(String acceptCharset);

    /**
     * Server-side form handler. See the action attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAction();

    /**
     * Server-side form handler. See the action attribute definition in HTML
     * 4.01.
     *
     * @param action DOCUMENT ME!
     */
    public void setAction(String action);

    /**
     * The content type of the submitted form, generally
     * "application/x-www-form-urlencoded". See the enctype attribute
     * definition in HTML 4.01. The onsubmit even handler is not guaranteed to
     * be triggered when invoking this method. The behavior is inconsistent
     * for historical reasons and authors should not rely on a particular one.
     *
     * @return DOCUMENT ME!
     */
    public String getEnctype();

    /**
     * The content type of the submitted form, generally
     * "application/x-www-form-urlencoded". See the enctype attribute
     * definition in HTML 4.01. The onsubmit even handler is not guaranteed to
     * be triggered when invoking this method. The behavior is inconsistent
     * for historical reasons and authors should not rely on a particular one.
     *
     * @param enctype DOCUMENT ME!
     */
    public void setEnctype(String enctype);

    /**
     * HTTP method [ <a href='http://www.ietf.org/rfc/rfc2616.txt'>IETF RFC
     * 2616 </a>] used to submit form. See the method attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getMethod();

    /**
     * HTTP method [ <a href='http://www.ietf.org/rfc/rfc2616.txt'>IETF RFC
     * 2616 </a>] used to submit form. See the method attribute definition in
     * HTML 4.01.
     *
     * @param method DOCUMENT ME!
     */
    public void setMethod(String method);

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
     * Submits the form. It performs the same action as a submit button.
     */
    public void submit();

    /**
     * Restores a form element's default values. It performs the same action as
     * a reset button.
     */
    public void reset();
}