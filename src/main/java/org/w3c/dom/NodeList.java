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
 * The <code>NodeList</code> interface provides the abstraction of an ordered
 * collection of nodes, without defining or constraining how this collection
 * is implemented. <code>NodeList</code> objects in the DOM are live.
 * 
 * <p>
 * The items in the <code>NodeList</code> are accessible via an integral index,
 * starting from 0.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 */
public interface NodeList {
    /**
     * Returns the <code>index</code> th item in the collection. If
     * <code>index</code> is greater than or equal to the number of nodes in
     * the list, this returns <code>null</code>.
     *
     * @param index Index into the collection.
     *
     * @return The node at the <code>index</code> th position in the
     *         <code>NodeList</code>, or <code>null</code> if that is not a
     *         valid index.
     */
    public Node item(int index);

    /**
     * The number of nodes in the list. The range of valid child node indices
     * is 0 to <code>length-1</code> inclusive.
     *
     * @return DOCUMENT ME!
     */
    public int getLength();
}