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
 * Document head information. See the HEAD element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLHeadElement
    extends HTMLElement {
    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating a metadata profile. See the profile attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getProfile();

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating a metadata profile. See the profile attribute definition in
     * HTML 4.01.
     *
     * @param profile DOCUMENT ME!
     */
    public void setProfile(String profile);
}