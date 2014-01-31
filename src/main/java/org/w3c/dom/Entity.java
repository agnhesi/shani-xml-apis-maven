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
 * This interface represents a known entity, either parsed or unparsed, in an
 * XML document. Note that this models the entity itself <em>not</em> the
 * entity declaration.
 * 
 * <p>
 * The <code>nodeName</code> attribute that is inherited from <code>Node</code>
 * contains the name of the entity.
 * </p>
 * 
 * <p>
 * An XML processor may choose to completely expand entities before the
 * structure model is passed to the DOM; in this case there will be no
 * <code>EntityReference</code> nodes in the document tree.
 * </p>
 * 
 * <p>
 * XML does not mandate that a non-validating XML processor read and process
 * entity declarations made in the external subset or declared in parameter
 * entities. This means that parsed entities declared in the external subset
 * need not be expanded by some classes of applications, and that the
 * replacement text of the entity may not be available. When the <a
 * href='http://www.w3.org/TR/2004/REC-xml-20040204#intern-replacement'>
 * replacement text </a> is available, the corresponding <code>Entity</code>
 * node's child list represents the structure of that replacement value.
 * Otherwise, the child list is empty.
 * </p>
 * 
 * <p>
 * DOM Level 3 does not support editing <code>Entity</code> nodes; if a user
 * wants to make changes to the contents of an <code>Entity</code>, every
 * related <code>EntityReference</code> node has to be replaced in the
 * structure model by a clone of the <code>Entity</code>'s contents, and then
 * the desired changes must be made to each of those clones instead.
 * <code>Entity</code> nodes and all their descendants are readonly.
 * </p>
 * 
 * <p>
 * An <code>Entity</code> node does not have any parent. <b>Note: </b> If the
 * entity contains an unbound namespace prefix, the <code>namespaceURI</code>
 * of the corresponding node in the <code>Entity</code> node subtree is
 * <code>null</code>. The same is true for <code>EntityReference</code> nodes
 * that refer to this entity, when they are created using the
 * <code>createEntityReference</code> method of the <code>Document</code>
 * interface.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 */
public interface Entity
    extends Node {
    /**
     * The public identifier associated with the entity if specified, and
     * <code>null</code> otherwise.
     *
     * @return DOCUMENT ME!
     */
    public String getPublicId();

    /**
     * The system identifier associated with the entity if specified, and
     * <code>null</code> otherwise. This may be an absolute URI or not.
     *
     * @return DOCUMENT ME!
     */
    public String getSystemId();

    /**
     * For unparsed entities, the name of the notation for the entity. For
     * parsed entities, this is <code>null</code>.
     *
     * @return DOCUMENT ME!
     */
    public String getNotationName();

    /**
     * An attribute specifying the encoding used for this entity at the time of
     * parsing, when it is an external parsed entity. This is
     * <code>null</code> if it an entity from the internal subset or if it is
     * not known.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 3
     */
    public String getInputEncoding();

    /**
     * An attribute specifying, as part of the text declaration, the encoding
     * of this entity, when it is an external parsed entity. This is
     * <code>null</code> otherwise.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 3
     */
    public String getXmlEncoding();

    /**
     * An attribute specifying, as part of the text declaration, the version
     * number of this entity, when it is an external parsed entity. This is
     * <code>null</code> otherwise.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 3
     */
    public String getXmlVersion();
}