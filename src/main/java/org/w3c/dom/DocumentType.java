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
 * Each <code>Document</code> has a <code>doctype</code> attribute whose value
 * is either <code>null</code> or a <code>DocumentType</code> object. The
 * <code>DocumentType</code> interface in the DOM Core provides an interface
 * to the list of entities that are defined for the document, and little else
 * because the effect of namespaces and the various XML schema efforts on DTD
 * representation are not clearly understood as of this writing.
 * 
 * <p>
 * DOM Level 3 doesn't support editing <code>DocumentType</code> nodes.
 * <code>DocumentType</code> nodes are read-only.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 */
public interface DocumentType
    extends Node {
    /**
     * The name of DTD; i.e., the name immediately following the
     * <code>DOCTYPE</code> keyword.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * A <code>NamedNodeMap</code> containing the general entities, both
     * external and internal, declared in the DTD. Parameter entities are not
     * contained. Duplicates are discarded. For example in:
     * <pre>
     * 
     *  &lt;!DOCTYPE 
     *   ex SYSTEM &quot;ex.dtd&quot; [ &lt;!ENTITY foo &quot;foo&quot;&gt; &lt;!ENTITY bar 
     *   &quot;bar&quot;&gt; &lt;!ENTITY bar &quot;bar2&quot;&gt; &lt;!ENTITY % baz &quot;baz&quot;&gt; 
     *   ]&gt; &lt;ex/&gt;
     *  
     * </pre>
     * the interface provides access to <code>foo</code> and the first
     * declaration of <code>bar</code> but not the second declaration of
     * <code>bar</code> or <code>baz</code>. Every node in this map also
     * implements the <code>Entity</code> interface. <br>
     * The DOM Level 2 does not support editing entities, therefore
     * <code>entities</code> cannot be altered in any way.
     *
     * @return DOCUMENT ME!
     */
    public NamedNodeMap getEntities();

    /**
     * A <code>NamedNodeMap</code> containing the notations declared in the
     * DTD. Duplicates are discarded. Every node in this map also implements
     * the <code>Notation</code> interface. <br>
     * The DOM Level 2 does not support editing notations, therefore
     * <code>notations</code> cannot be altered in any way.
     *
     * @return DOCUMENT ME!
     */
    public NamedNodeMap getNotations();

    /**
     * The public identifier of the external subset.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 2
     */
    public String getPublicId();

    /**
     * The system identifier of the external subset. This may be an absolute
     * URI or not.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 2
     */
    public String getSystemId();

    /**
     * The internal subset as a string, or <code>null</code> if there is none.
     * This is does not contain the delimiting square brackets. <b>Note: </b>
     * The actual content returned depends on how much information is
     * available to the implementation. This may vary depending on various
     * parameters, including the XML processor used to build the document.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 2
     */
    public String getInternalSubset();
}