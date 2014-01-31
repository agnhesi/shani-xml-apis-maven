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

package org.w3c.dom.css;

import org.w3c.dom.DOMException;


/**
 * The <code>CSSRule</code> interface is the abstract base interface for any
 * type of CSS statement. This includes both rule sets and at-rules. An
 * implementation is expected to preserve all rules specified in a CSS style
 * sheet, even if the rule is not recognized by the parser. Unrecognized rules
 * are represented using the <code>CSSUnknownRule</code> interface.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification </a>.
 * </p>
 *
 * @since DOM Level 2
 */
public interface CSSRule {
    // RuleType

    /** The rule is a <code>CSSUnknownRule</code>. */
    public static final short UNKNOWN_RULE = 0;

    /** The rule is a <code>CSSStyleRule</code>. */
    public static final short STYLE_RULE = 1;

    /** The rule is a <code>CSSCharsetRule</code>. */
    public static final short CHARSET_RULE = 2;

    /** The rule is a <code>CSSImportRule</code>. */
    public static final short IMPORT_RULE = 3;

    /** The rule is a <code>CSSMediaRule</code>. */
    public static final short MEDIA_RULE = 4;

    /** The rule is a <code>CSSFontFaceRule</code>. */
    public static final short FONT_FACE_RULE = 5;

    /** The rule is a <code>CSSPageRule</code>. */
    public static final short PAGE_RULE = 6;

    /**
     * The type of the rule, as defined above. The expectation is that
     * binding-specific casting methods can be used to cast down from an
     * instance of the <code>CSSRule</code> interface to the specific derived
     * interface implied by the <code>type</code>.
     *
     * @return DOCUMENT ME!
     */
    public short getType();

    /**
     * The parsable textual representation of the rule. This reflects the
     * current state of the rule and not its initial value.
     *
     * @return DOCUMENT ME!
     */
    public String getCssText();

    /**
     * DOCUMENT ME!
     *
     * @param cssText DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCssText(String cssText)
        throws DOMException;

    /**
     * The style sheet that contains this rule.
     *
     * @return DOCUMENT ME!
     */
    public CSSStyleSheet getParentStyleSheet();

    /**
     * If this rule is contained inside another rule (e.g. a style rule inside
     * an  &commat;media block), this is the containing rule. If this rule is
     * not nested inside any other rules, this returns <code>null</code>.
     *
     * @return DOCUMENT ME!
     */
    public CSSRule getParentRule();
}