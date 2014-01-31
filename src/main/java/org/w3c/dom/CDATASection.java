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
 * CDATA sections are used to escape blocks of text containing characters that
 * would otherwise be regarded as markup. The only delimiter that is
 * recognized in a CDATA section is the "]]&gt;" string that ends the CDATA
 * section. CDATA sections cannot be nested. Their primary purpose is for
 * including material such as XML fragments, without needing to escape all the
 * delimiters.
 * 
 * <p>
 * The <code>CharacterData.data</code> attribute holds the text that is
 * contained by the CDATA section. Note that this <em>may</em> contain
 * characters that need to be escaped outside of CDATA sections and that,
 * depending on the character encoding ("charset") chosen for serialization,
 * it may be impossible to write out some characters as part of a CDATA
 * section.
 * </p>
 * 
 * <p>
 * The <code>CDATASection</code> interface inherits from the
 * <code>CharacterData</code> interface through the <code>Text</code>
 * interface. Adjacent <code>CDATASection</code> nodes are not merged by use
 * of the <code>normalize</code> method of the <code>Node</code> interface.
 * </p>
 * 
 * <p>
 * No lexical check is done on the content of a CDATA section and it is
 * therefore possible to have the character sequence <code>"]]&gt;"</code> in
 * the content, which is illegal in a CDATA section per section 2.7 of [ <a
 * href='http://www.w3.org/TR/2004/REC-xml-20040204'>XML 1.0 </a>]. The
 * presence of this character sequence must generate a fatal error during
 * serialization or the cdata section must be splitted before the
 * serialization (see also the parameter <code>"split-cdata-sections"</code>
 * in the <code>DOMConfiguration</code> interface). <b>Note: </b> Because no
 * markup is recognized within a <code>CDATASection</code>, character numeric
 * references cannot be used as an escape mechanism when serializing.
 * Therefore, action needs to be taken when serializing a
 * <code>CDATASection</code> with a character encoding where some of the
 * contained characters cannot be represented. Failure to do so would not
 * produce well-formed XML. <b>Note: </b> One potential solution in the
 * serialization process is to end the CDATA section before the character,
 * output the character using a character reference or entity reference, and
 * open a new CDATA section for any further characters in the text node. Note,
 * however, that some code conversion libraries at the time of writing do not
 * return an error or exception when a character is missing from the encoding,
 * making the task of ensuring that data is not corrupted on serialization
 * more difficult.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification </a>.
 * </p>
 */
public interface CDATASection
    extends Text {
}