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

import org.w3c.dom.Node;


/**
 * An <code>HTMLCollection</code> is a list of nodes. An individual node may be
 * accessed by either ordinal index or the node's <code>name</code> or
 * <code>id</code> attributes. Collections in the HTML DOM are assumed to be
 * live meaning that they are automatically updated when the underlying
 * document is changed.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLCollection {
    /**
     * This attribute specifies the length or size of the list.
     *
     * @return DOCUMENT ME!
     */
    public int getLength();

    /**
     * This method retrieves a node specified by ordinal index. Nodes are
     * numbered in tree order (depth-first traversal order).
     *
     * @param index The index of the node to be fetched. The index origin is
     *        <code>0</code>.
     *
     * @return The <code>Node</code> at the corresponding position upon
     *         success. A value of <code>null</code> is returned if the index
     *         is out of range.
     */
    public Node item(int index);

    /**
     * This method retrieves a <code>Node</code> using a name. With [ <a
     * href='http://www.w3.org/TR/1999/REC-html401-19991224'>HTML 4.01 </a>]
     * documents, it first searches for a <code>Node</code> with a matching
     * <code>id</code> attribute. If it doesn't find one, it then searches for
     * a <code>Node</code> with a matching <code>name</code> attribute, but
     * only on those elements that are allowed a name attribute. With [ <a
     * href='http://www.w3.org/TR/2002/REC-xhtml1-20020801'>XHTML 1.0 </a>]
     * documents, this method only searches for <code>Nodes</code> with a
     * matching <code>id</code> attribute. This method is case insensitive in
     * HTML documents and case sensitive in XHTML documents.
     *
     * @param name The name of the <code>Node</code> to be fetched.
     *
     * @return The <code>Node</code> with a <code>name</code> or
     *         <code>id</code> attribute whose value corresponds to the
     *         specified string. Upon failure (e.g., no node with this name
     *         exists), returns <code>null</code>.
     */
    public Node namedItem(String name);
}