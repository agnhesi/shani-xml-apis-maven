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
 * This interface inherits from <code>CharacterData</code> and represents the
 * content of a comment, i.e., all the characters between the starting '
 * <code>&lt;!--</code>' and ending '<code>--&gt;</code>'. Note that this is
 * the definition of a comment in XML, and, in practice, HTML, although some
 * HTML tools may implement the full SGML comment structure.
 * 
 * <p>
 * No lexical check is done on the content of a comment and it is therefore
 * possible to have the character sequence <code>"--"</code> (double-hyphen)
 * in the content, which is illegal in a comment per section 2.5 of [ <a
 * href='http://www.w3.org/TR/2004/REC-xml-20040204'>XML 1.0 </a>]. The
 * presence of this character sequence must generate a fatal error during
 * serialization.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 */
public interface Comment
    extends CharacterData {
}