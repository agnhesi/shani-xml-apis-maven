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
 * <code>EntityReference</code> nodes may be used to represent an entity
 * reference in the tree. Note that character references and references to
 * predefined entities are considered to be expanded by the HTML or XML
 * processor so that characters are represented by their Unicode equivalent
 * rather than by an entity reference. Moreover, the XML processor may
 * completely expand references to entities while building the
 * <code>Document</code>, instead of providing <code>EntityReference</code>
 * nodes. If it does provide such nodes, then for an
 * <code>EntityReference</code> node that represents a reference to a known
 * entity an <code>Entity</code> exists, and the subtree of the
 * <code>EntityReference</code> node is a copy of the <code>Entity</code> node
 * subtree. However, the latter may not be true when an entity contains an
 * unbound namespace prefix. In such a case, because the namespace prefix
 * resolution depends on where the entity reference is, the descendants of the
 * <code>EntityReference</code> node may be bound to different namespace URIs.
 * When an <code>EntityReference</code> node represents a reference to an
 * unknown entity, the node has no children and its replacement value, when
 * used by <code>Attr.value</code> for example, is empty.
 * 
 * <p>
 * As for <code>Entity</code> nodes, <code>EntityReference</code> nodes and all
 * their descendants are readonly. <b>Note: </b><code>EntityReference</code>
 * nodes may cause element content and attribute value normalization problems
 * when, such as in XML 1.0 and XML Schema, the normalization is performed
 * after entity reference are expanded.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 */
public interface EntityReference
    extends Node {
}