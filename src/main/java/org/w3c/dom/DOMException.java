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
 * DOM operations only raise exceptions in "exceptional" circumstances, i.e.,
 * when an operation is impossible to perform (either for logical reasons,
 * because data is lost, or because the implementation has become unstable).
 * In general, DOM methods return specific error values in ordinary processing
 * situations, such as out-of-bound errors when using <code>NodeList</code>.
 * 
 * <p>
 * Implementations should raise other exceptions under other circumstances. For
 * example, implementations should raise an implementation-dependent exception
 * if a <code>null</code> argument is passed when <code>null</code> was not
 * expected.
 * </p>
 * 
 * <p>
 * Some languages and object systems do not support the concept of exceptions.
 * For such systems, error conditions may be indicated using native error
 * reporting mechanisms. For some bindings, for example, methods may return
 * error codes similar to those listed in the corresponding method
 * descriptions.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 */
public class DOMException
    extends RuntimeException {
    // ExceptionCode

    static final long serialVersionUID = 6627732366795969916L;

	/** If index or size is negative, or greater than the allowed value. */
    public static final short INDEX_SIZE_ERR = 1;

    /**
     * If the specified range of text does not fit into a
     * <code>DOMString</code>.
     */
    public static final short DOMSTRING_SIZE_ERR = 2;

    /** If any <code>Node</code> is inserted somewhere it doesn't belong. */
    public static final short HIERARCHY_REQUEST_ERR = 3;

    /**
     * If a <code>Node</code> is used in a different document than the one that
     * created it (that doesn't support it).
     */
    public static final short WRONG_DOCUMENT_ERR = 4;

    /**
     * If an invalid or illegal character is specified, such as in an XML name.
     */
    public static final short INVALID_CHARACTER_ERR = 5;

    /**
     * If data is specified for a <code>Node</code> which does not support
     * data.
     */
    public static final short NO_DATA_ALLOWED_ERR = 6;

    /**
     * If an attempt is made to modify an object where modifications are not
     * allowed.
     */
    public static final short NO_MODIFICATION_ALLOWED_ERR = 7;

    /**
     * If an attempt is made to reference a <code>Node</code> in a context
     * where it does not exist.
     */
    public static final short NOT_FOUND_ERR = 8;

    /**
     * If the implementation does not support the requested type of object or
     * operation.
     */
    public static final short NOT_SUPPORTED_ERR = 9;

    /**
     * If an attempt is made to add an attribute that is already in use
     * elsewhere.
     */
    public static final short INUSE_ATTRIBUTE_ERR = 10;

    /**
     * If an attempt is made to use an object that is not, or is no longer,
     * usable.
     *
     * @since DOM Level 2
     */
    public static final short INVALID_STATE_ERR = 11;

    /**
     * If an invalid or illegal string is specified.
     *
     * @since DOM Level 2
     */
    public static final short SYNTAX_ERR = 12;

    /**
     * If an attempt is made to modify the type of the underlying object.
     *
     * @since DOM Level 2
     */
    public static final short INVALID_MODIFICATION_ERR = 13;

    /**
     * If an attempt is made to create or change an object in a way which is
     * incorrect with regard to namespaces.
     *
     * @since DOM Level 2
     */
    public static final short NAMESPACE_ERR = 14;

    /**
     * If a parameter or an operation is not supported by the underlying
     * object.
     *
     * @since DOM Level 2
     */
    public static final short INVALID_ACCESS_ERR = 15;

    /**
     * If a call to a method such as <code>insertBefore</code> or
     * <code>removeChild</code> would make the <code>Node</code> invalid with
     * respect to "partial validity", this exception would be raised and the
     * operation would not be done. This code is used in [ <a
     * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Val-20040127/'>DOM
     * Level 3 Validation </a>] . Refer to this specification for further
     * information.
     *
     * @since DOM Level 3
     */
    public static final short VALIDATION_ERR = 16;

    /**
     * If the type of an object is incompatible with the expected type of the
     * parameter associated to the object.
     *
     * @since DOM Level 3
     */
    public static final short TYPE_MISMATCH_ERR = 17;

    /** DOCUMENT ME! */
    public short code;

    /**
     * Creates a new DOMException object.
     *
     * @param code DOCUMENT ME!
     * @param message DOCUMENT ME!
     */
    public DOMException(
        short code,
        String message
    ) {
        super(message);
        this.code = code;
    }
}