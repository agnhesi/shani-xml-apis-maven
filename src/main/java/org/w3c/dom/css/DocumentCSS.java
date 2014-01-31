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

import org.w3c.dom.Element;
import org.w3c.dom.stylesheets.DocumentStyle;


/**
 * This interface represents a document with a CSS view.
 * 
 * <p>
 * The <code>getOverrideStyle</code> method provides a mechanism through which
 * a DOM author could effect immediate change to the style of an element
 * without modifying the explicitly linked style sheets of a document or the
 * inline style of elements in the style sheets. This style sheet comes after
 * the author style sheet in the cascade algorithm and is called override
 * style sheet. The override style sheet takes precedence over author style
 * sheets. An "!important" declaration still takes precedence over a normal
 * declaration. Override, author, and user style sheets all may contain
 * "!important" declarations. User "!important" rules take precedence over
 * both override and author "!important" rules, and override "!important"
 * rules take precedence over author "!important" rules.
 * </p>
 * 
 * <p>
 * The expectation is that an instance of the <code>DocumentCSS</code>
 * interface can be obtained by using binding-specific casting methods on an
 * instance of the <code>Document</code> interface.
 * </p>
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification </a>.
 * </p>
 *
 * @since DOM Level 2
 */
public interface DocumentCSS
    extends DocumentStyle {
    /**
     * This method is used to retrieve the override style declaration for a
     * specified element and a specified pseudo-element.
     *
     * @param elt The element whose style is to be modified. This parameter
     *        cannot be null.
     * @param pseudoElt The pseudo-element or <code>null</code> if none.
     *
     * @return The override style declaration.
     */
    public CSSStyleDeclaration getOverrideStyle(
        Element elt,
        String pseudoElt
    );
}