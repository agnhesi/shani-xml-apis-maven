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
 * This contains generic meta-information about the document. See the META
 * element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLMetaElement
    extends HTMLElement {
    /**
     * Associated information. See the content attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getContent();

    /**
     * Associated information. See the content attribute definition in HTML
     * 4.01.
     *
     * @param content DOCUMENT ME!
     */
    public void setContent(String content);

    /**
     * HTTP response header name [ <a
     * href='http://www.ietf.org/rfc/rfc2616.txt'>IETF RFC 2616 </a>]. See the
     * http-equiv attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHttpEquiv();

    /**
     * HTTP response header name [ <a
     * href='http://www.ietf.org/rfc/rfc2616.txt'>IETF RFC 2616 </a>]. See the
     * http-equiv attribute definition in HTML 4.01.
     *
     * @param httpEquiv DOCUMENT ME!
     */
    public void setHttpEquiv(String httpEquiv);

    /**
     * Meta information name. See the name attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * Meta information name. See the name attribute definition in HTML 4.01.
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

    /**
     * Select form of content. See the scheme attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getScheme();

    /**
     * Select form of content. See the scheme attribute definition in HTML
     * 4.01.
     *
     * @param scheme DOCUMENT ME!
     */
    public void setScheme(String scheme);
}