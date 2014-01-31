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

package org.w3c.dom;

/**
 * <code>DOMLocator</code> is an interface that describes a location (e.g.
 * where an error occurred).
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 *
 * @since DOM Level 3
 */
public interface DOMLocator {
    /**
     * The line number this locator is pointing to, or <code>-1</code> if there
     * is no column number available.
     *
     * @return DOCUMENT ME!
     */
    public int getLineNumber();

    /**
     * The column number this locator is pointing to, or <code>-1</code> if
     * there is no column number available.
     *
     * @return DOCUMENT ME!
     */
    public int getColumnNumber();

    /**
     * The byte offset into the input source this locator is pointing to or
     * <code>-1</code> if there is no byte offset available.
     *
     * @return DOCUMENT ME!
     */
    public int getByteOffset();

    /**
     * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646],
     * offset into the input source this locator is pointing to or
     * <code>-1</code> if there is no UTF-16 offset available.
     *
     * @return DOCUMENT ME!
     */
    public int getUtf16Offset();

    /**
     * The node this locator is pointing to, or <code>null</code> if no node is
     * available.
     *
     * @return DOCUMENT ME!
     */
    public Node getRelatedNode();

    /**
     * The URI this locator is pointing to, or <code>null</code> if no URI is
     * available.
     *
     * @return DOCUMENT ME!
     */
    public String getUri();
}