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
 * The <code>CSS2Properties</code> interface represents a convenience mechanism
 * for retrieving and setting properties within a
 * <code>CSSStyleDeclaration</code>. The attributes of this interface
 * correspond to all the properties specified in CSS2. Getting an attribute of
 * this interface is equivalent to calling the <code>getPropertyValue</code>
 * method of the <code>CSSStyleDeclaration</code> interface. Setting an
 * attribute of this interface is equivalent to calling the
 * <code>setProperty</code> method of the <code>CSSStyleDeclaration</code>
 * interface.
 * 
 * <p>
 * A conformant implementation of the CSS module is not required to implement
 * the <code>CSS2Properties</code> interface. If an implementation does
 * implement this interface, the expectation is that language-specific methods
 * can be used to cast from an instance of the
 * <code>CSSStyleDeclaration</code> interface to the
 * <code>CSS2Properties</code> interface.
 * </p>
 * 
 * <p>
 * If an implementation does implement this interface, it is expected to
 * understand the specific syntax of the shorthand properties, and apply their
 * semantics; when the <code>margin</code> property is set, for example, the
 * <code>marginTop</code>,<code>marginRight</code>, <code>marginBottom</code>
 * and <code>marginLeft</code> properties are actually being set by the
 * underlying implementation.
 * </p>
 * 
 * <p>
 * When dealing with CSS "shorthand" properties, the shorthand properties
 * should be decomposed into their component longhand properties as
 * appropriate, and when querying for their value, the form returned should be
 * the shortest form exactly equivalent to the declarations made in the
 * ruleset. However, if there is no shorthand declaration that could be added
 * to the ruleset without changing in any way the rules already declared in
 * the ruleset (i.e., by adding longhand rules that were previously not
 * declared in the ruleset), then the empty string should be returned for the
 * shorthand property.
 * </p>
 * 
 * <p>
 * For example, querying for the <code>font</code> property should not return
 * "normal normal normal 14pt/normal Arial, sans-serif", when "14pt Arial,
 * sans-serif" suffices. (The normals are initial values, and are implied by
 * use of the longhand property.)
 * </p>
 * 
 * <p>
 * If the values for all the longhand properties that compose a particular
 * string are the initial values, then a string consisting of all the initial
 * values should be returned (e.g. a <code>border-width</code> value of
 * "medium" should be returned as such, not as "").
 * </p>
 * 
 * <p>
 * For some shorthand properties that take missing values from other sides,
 * such as the <code>margin</code>,<code>padding</code>, and
 * <code>border-[width|style|color]</code> properties, the minimum number of
 * sides possible should be used; i.e., "0px 10px" will be returned instead of
 * "0px 10px 0px 10px".
 * </p>
 * 
 * <p>
 * If the value of a shorthand property can not be decomposed into its
 * component longhand properties, as is the case for the <code>font</code>
 * property with a value of "menu", querying for the values of the component
 * longhand properties should return the empty string.
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
public interface CSS2Properties {
    /**
     * See the azimuth property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getAzimuth();

    /**
     * DOCUMENT ME!
     *
     * @param azimuth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setAzimuth(String azimuth)
        throws DOMException;

    /**
     * See the background property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBackground();

    /**
     * DOCUMENT ME!
     *
     * @param background DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBackground(String background)
        throws DOMException;

    /**
     * See the background-attachment property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBackgroundAttachment();

    /**
     * DOCUMENT ME!
     *
     * @param backgroundAttachment DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBackgroundAttachment(String backgroundAttachment)
        throws DOMException;

    /**
     * See the background-color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBackgroundColor();

    /**
     * DOCUMENT ME!
     *
     * @param backgroundColor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBackgroundColor(String backgroundColor)
        throws DOMException;

    /**
     * See the background-image property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBackgroundImage();

    /**
     * DOCUMENT ME!
     *
     * @param backgroundImage DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBackgroundImage(String backgroundImage)
        throws DOMException;

    /**
     * See the background-position property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBackgroundPosition();

    /**
     * DOCUMENT ME!
     *
     * @param backgroundPosition DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBackgroundPosition(String backgroundPosition)
        throws DOMException;

    /**
     * See the background-repeat property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBackgroundRepeat();

    /**
     * DOCUMENT ME!
     *
     * @param backgroundRepeat DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBackgroundRepeat(String backgroundRepeat)
        throws DOMException;

    /**
     * See the border property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorder();

    /**
     * DOCUMENT ME!
     *
     * @param border DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorder(String border)
        throws DOMException;

    /**
     * See the border-collapse property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderCollapse();

    /**
     * DOCUMENT ME!
     *
     * @param borderCollapse DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderCollapse(String borderCollapse)
        throws DOMException;

    /**
     * See the border-color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderColor();

    /**
     * DOCUMENT ME!
     *
     * @param borderColor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderColor(String borderColor)
        throws DOMException;

    /**
     * See the border-spacing property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderSpacing();

    /**
     * DOCUMENT ME!
     *
     * @param borderSpacing DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderSpacing(String borderSpacing)
        throws DOMException;

    /**
     * See the border-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderStyle();

    /**
     * DOCUMENT ME!
     *
     * @param borderStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderStyle(String borderStyle)
        throws DOMException;

    /**
     * See the border-top property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderTop();

    /**
     * DOCUMENT ME!
     *
     * @param borderTop DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderTop(String borderTop)
        throws DOMException;

    /**
     * See the border-right property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderRight();

    /**
     * DOCUMENT ME!
     *
     * @param borderRight DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderRight(String borderRight)
        throws DOMException;

    /**
     * See the border-bottom property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderBottom();

    /**
     * DOCUMENT ME!
     *
     * @param borderBottom DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderBottom(String borderBottom)
        throws DOMException;

    /**
     * See the border-left property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderLeft();

    /**
     * DOCUMENT ME!
     *
     * @param borderLeft DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderLeft(String borderLeft)
        throws DOMException;

    /**
     * See the border-top-color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderTopColor();

    /**
     * DOCUMENT ME!
     *
     * @param borderTopColor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderTopColor(String borderTopColor)
        throws DOMException;

    /**
     * See the border-right-color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderRightColor();

    /**
     * DOCUMENT ME!
     *
     * @param borderRightColor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderRightColor(String borderRightColor)
        throws DOMException;

    /**
     * See the border-bottom-color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderBottomColor();

    /**
     * DOCUMENT ME!
     *
     * @param borderBottomColor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderBottomColor(String borderBottomColor)
        throws DOMException;

    /**
     * See the border-left-color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderLeftColor();

    /**
     * DOCUMENT ME!
     *
     * @param borderLeftColor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderLeftColor(String borderLeftColor)
        throws DOMException;

    /**
     * See the border-top-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderTopStyle();

    /**
     * DOCUMENT ME!
     *
     * @param borderTopStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderTopStyle(String borderTopStyle)
        throws DOMException;

    /**
     * See the border-right-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderRightStyle();

    /**
     * DOCUMENT ME!
     *
     * @param borderRightStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderRightStyle(String borderRightStyle)
        throws DOMException;

    /**
     * See the border-bottom-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderBottomStyle();

    /**
     * DOCUMENT ME!
     *
     * @param borderBottomStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderBottomStyle(String borderBottomStyle)
        throws DOMException;

    /**
     * See the border-left-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderLeftStyle();

    /**
     * DOCUMENT ME!
     *
     * @param borderLeftStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderLeftStyle(String borderLeftStyle)
        throws DOMException;

    /**
     * See the border-top-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderTopWidth();

    /**
     * DOCUMENT ME!
     *
     * @param borderTopWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderTopWidth(String borderTopWidth)
        throws DOMException;

    /**
     * See the border-right-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderRightWidth();

    /**
     * DOCUMENT ME!
     *
     * @param borderRightWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderRightWidth(String borderRightWidth)
        throws DOMException;

    /**
     * See the border-bottom-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderBottomWidth();

    /**
     * DOCUMENT ME!
     *
     * @param borderBottomWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderBottomWidth(String borderBottomWidth)
        throws DOMException;

    /**
     * See the border-left-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderLeftWidth();

    /**
     * DOCUMENT ME!
     *
     * @param borderLeftWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderLeftWidth(String borderLeftWidth)
        throws DOMException;

    /**
     * See the border-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBorderWidth();

    /**
     * DOCUMENT ME!
     *
     * @param borderWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBorderWidth(String borderWidth)
        throws DOMException;

    /**
     * See the bottom property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getBottom();

    /**
     * DOCUMENT ME!
     *
     * @param bottom DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setBottom(String bottom)
        throws DOMException;

    /**
     * See the caption-side property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCaptionSide();

    /**
     * DOCUMENT ME!
     *
     * @param captionSide DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCaptionSide(String captionSide)
        throws DOMException;

    /**
     * See the clear property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getClear();

    /**
     * DOCUMENT ME!
     *
     * @param clear DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setClear(String clear)
        throws DOMException;

    /**
     * See the clip property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getClip();

    /**
     * DOCUMENT ME!
     *
     * @param clip DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setClip(String clip)
        throws DOMException;

    /**
     * See the color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getColor();

    /**
     * DOCUMENT ME!
     *
     * @param color DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setColor(String color)
        throws DOMException;

    /**
     * See the content property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getContent();

    /**
     * DOCUMENT ME!
     *
     * @param content DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setContent(String content)
        throws DOMException;

    /**
     * See the counter-increment property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCounterIncrement();

    /**
     * DOCUMENT ME!
     *
     * @param counterIncrement DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCounterIncrement(String counterIncrement)
        throws DOMException;

    /**
     * See the counter-reset property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCounterReset();

    /**
     * DOCUMENT ME!
     *
     * @param counterReset DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCounterReset(String counterReset)
        throws DOMException;

    /**
     * See the cue property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCue();

    /**
     * DOCUMENT ME!
     *
     * @param cue DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCue(String cue)
        throws DOMException;

    /**
     * See the cue-after property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCueAfter();

    /**
     * DOCUMENT ME!
     *
     * @param cueAfter DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCueAfter(String cueAfter)
        throws DOMException;

    /**
     * See the cue-before property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCueBefore();

    /**
     * DOCUMENT ME!
     *
     * @param cueBefore DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCueBefore(String cueBefore)
        throws DOMException;

    /**
     * See the cursor property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCursor();

    /**
     * DOCUMENT ME!
     *
     * @param cursor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCursor(String cursor)
        throws DOMException;

    /**
     * See the direction property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getDirection();

    /**
     * DOCUMENT ME!
     *
     * @param direction DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setDirection(String direction)
        throws DOMException;

    /**
     * See the display property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getDisplay();

    /**
     * DOCUMENT ME!
     *
     * @param display DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setDisplay(String display)
        throws DOMException;

    /**
     * See the elevation property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getElevation();

    /**
     * DOCUMENT ME!
     *
     * @param elevation DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setElevation(String elevation)
        throws DOMException;

    /**
     * See the empty-cells property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getEmptyCells();

    /**
     * DOCUMENT ME!
     *
     * @param emptyCells DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setEmptyCells(String emptyCells)
        throws DOMException;

    /**
     * See the float property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getCssFloat();

    /**
     * DOCUMENT ME!
     *
     * @param cssFloat DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setCssFloat(String cssFloat)
        throws DOMException;

    /**
     * See the font property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFont();

    /**
     * DOCUMENT ME!
     *
     * @param font DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFont(String font)
        throws DOMException;

    /**
     * See the font-family property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFontFamily();

    /**
     * DOCUMENT ME!
     *
     * @param fontFamily DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFontFamily(String fontFamily)
        throws DOMException;

    /**
     * See the font-size property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFontSize();

    /**
     * DOCUMENT ME!
     *
     * @param fontSize DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFontSize(String fontSize)
        throws DOMException;

    /**
     * See the font-size-adjust property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFontSizeAdjust();

    /**
     * DOCUMENT ME!
     *
     * @param fontSizeAdjust DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFontSizeAdjust(String fontSizeAdjust)
        throws DOMException;

    /**
     * See the font-stretch property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFontStretch();

    /**
     * DOCUMENT ME!
     *
     * @param fontStretch DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFontStretch(String fontStretch)
        throws DOMException;

    /**
     * See the font-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFontStyle();

    /**
     * DOCUMENT ME!
     *
     * @param fontStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFontStyle(String fontStyle)
        throws DOMException;

    /**
     * See the font-variant property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFontVariant();

    /**
     * DOCUMENT ME!
     *
     * @param fontVariant DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFontVariant(String fontVariant)
        throws DOMException;

    /**
     * See the font-weight property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getFontWeight();

    /**
     * DOCUMENT ME!
     *
     * @param fontWeight DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setFontWeight(String fontWeight)
        throws DOMException;

    /**
     * See the height property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getHeight();

    /**
     * DOCUMENT ME!
     *
     * @param height DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setHeight(String height)
        throws DOMException;

    /**
     * See the left property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getLeft();

    /**
     * DOCUMENT ME!
     *
     * @param left DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setLeft(String left)
        throws DOMException;

    /**
     * See the letter-spacing property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getLetterSpacing();

    /**
     * DOCUMENT ME!
     *
     * @param letterSpacing DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setLetterSpacing(String letterSpacing)
        throws DOMException;

    /**
     * See the line-height property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getLineHeight();

    /**
     * DOCUMENT ME!
     *
     * @param lineHeight DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setLineHeight(String lineHeight)
        throws DOMException;

    /**
     * See the list-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getListStyle();

    /**
     * DOCUMENT ME!
     *
     * @param listStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setListStyle(String listStyle)
        throws DOMException;

    /**
     * See the list-style-image property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getListStyleImage();

    /**
     * DOCUMENT ME!
     *
     * @param listStyleImage DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setListStyleImage(String listStyleImage)
        throws DOMException;

    /**
     * See the list-style-position property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getListStylePosition();

    /**
     * DOCUMENT ME!
     *
     * @param listStylePosition DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setListStylePosition(String listStylePosition)
        throws DOMException;

    /**
     * See the list-style-type property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getListStyleType();

    /**
     * DOCUMENT ME!
     *
     * @param listStyleType DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setListStyleType(String listStyleType)
        throws DOMException;

    /**
     * See the margin property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMargin();

    /**
     * DOCUMENT ME!
     *
     * @param margin DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMargin(String margin)
        throws DOMException;

    /**
     * See the margin-top property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMarginTop();

    /**
     * DOCUMENT ME!
     *
     * @param marginTop DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMarginTop(String marginTop)
        throws DOMException;

    /**
     * See the margin-right property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMarginRight();

    /**
     * DOCUMENT ME!
     *
     * @param marginRight DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMarginRight(String marginRight)
        throws DOMException;

    /**
     * See the margin-bottom property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMarginBottom();

    /**
     * DOCUMENT ME!
     *
     * @param marginBottom DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMarginBottom(String marginBottom)
        throws DOMException;

    /**
     * See the margin-left property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMarginLeft();

    /**
     * DOCUMENT ME!
     *
     * @param marginLeft DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMarginLeft(String marginLeft)
        throws DOMException;

    /**
     * See the marker-offset property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMarkerOffset();

    /**
     * DOCUMENT ME!
     *
     * @param markerOffset DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMarkerOffset(String markerOffset)
        throws DOMException;

    /**
     * See the marks property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMarks();

    /**
     * DOCUMENT ME!
     *
     * @param marks DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMarks(String marks)
        throws DOMException;

    /**
     * See the max-height property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMaxHeight();

    /**
     * DOCUMENT ME!
     *
     * @param maxHeight DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMaxHeight(String maxHeight)
        throws DOMException;

    /**
     * See the max-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMaxWidth();

    /**
     * DOCUMENT ME!
     *
     * @param maxWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMaxWidth(String maxWidth)
        throws DOMException;

    /**
     * See the min-height property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMinHeight();

    /**
     * DOCUMENT ME!
     *
     * @param minHeight DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMinHeight(String minHeight)
        throws DOMException;

    /**
     * See the min-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getMinWidth();

    /**
     * DOCUMENT ME!
     *
     * @param minWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setMinWidth(String minWidth)
        throws DOMException;

    /**
     * See the orphans property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getOrphans();

    /**
     * DOCUMENT ME!
     *
     * @param orphans DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setOrphans(String orphans)
        throws DOMException;

    /**
     * See the outline property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getOutline();

    /**
     * DOCUMENT ME!
     *
     * @param outline DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setOutline(String outline)
        throws DOMException;

    /**
     * See the outline-color property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getOutlineColor();

    /**
     * DOCUMENT ME!
     *
     * @param outlineColor DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setOutlineColor(String outlineColor)
        throws DOMException;

    /**
     * See the outline-style property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getOutlineStyle();

    /**
     * DOCUMENT ME!
     *
     * @param outlineStyle DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setOutlineStyle(String outlineStyle)
        throws DOMException;

    /**
     * See the outline-width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getOutlineWidth();

    /**
     * DOCUMENT ME!
     *
     * @param outlineWidth DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setOutlineWidth(String outlineWidth)
        throws DOMException;

    /**
     * See the overflow property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getOverflow();

    /**
     * DOCUMENT ME!
     *
     * @param overflow DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setOverflow(String overflow)
        throws DOMException;

    /**
     * See the padding property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPadding();

    /**
     * DOCUMENT ME!
     *
     * @param padding DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPadding(String padding)
        throws DOMException;

    /**
     * See the padding-top property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPaddingTop();

    /**
     * DOCUMENT ME!
     *
     * @param paddingTop DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPaddingTop(String paddingTop)
        throws DOMException;

    /**
     * See the padding-right property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPaddingRight();

    /**
     * DOCUMENT ME!
     *
     * @param paddingRight DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPaddingRight(String paddingRight)
        throws DOMException;

    /**
     * See the padding-bottom property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPaddingBottom();

    /**
     * DOCUMENT ME!
     *
     * @param paddingBottom DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPaddingBottom(String paddingBottom)
        throws DOMException;

    /**
     * See the padding-left property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPaddingLeft();

    /**
     * DOCUMENT ME!
     *
     * @param paddingLeft DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPaddingLeft(String paddingLeft)
        throws DOMException;

    /**
     * See the page property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPage();

    /**
     * DOCUMENT ME!
     *
     * @param page DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPage(String page)
        throws DOMException;

    /**
     * See the page-break-after property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPageBreakAfter();

    /**
     * DOCUMENT ME!
     *
     * @param pageBreakAfter DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPageBreakAfter(String pageBreakAfter)
        throws DOMException;

    /**
     * See the page-break-before property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPageBreakBefore();

    /**
     * DOCUMENT ME!
     *
     * @param pageBreakBefore DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPageBreakBefore(String pageBreakBefore)
        throws DOMException;

    /**
     * See the page-break-inside property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPageBreakInside();

    /**
     * DOCUMENT ME!
     *
     * @param pageBreakInside DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPageBreakInside(String pageBreakInside)
        throws DOMException;

    /**
     * See the pause property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPause();

    /**
     * DOCUMENT ME!
     *
     * @param pause DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPause(String pause)
        throws DOMException;

    /**
     * See the pause-after property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPauseAfter();

    /**
     * DOCUMENT ME!
     *
     * @param pauseAfter DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPauseAfter(String pauseAfter)
        throws DOMException;

    /**
     * See the pause-before property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPauseBefore();

    /**
     * DOCUMENT ME!
     *
     * @param pauseBefore DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPauseBefore(String pauseBefore)
        throws DOMException;

    /**
     * See the pitch property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPitch();

    /**
     * DOCUMENT ME!
     *
     * @param pitch DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPitch(String pitch)
        throws DOMException;

    /**
     * See the pitch-range property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPitchRange();

    /**
     * DOCUMENT ME!
     *
     * @param pitchRange DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPitchRange(String pitchRange)
        throws DOMException;

    /**
     * See the play-during property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPlayDuring();

    /**
     * DOCUMENT ME!
     *
     * @param playDuring DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPlayDuring(String playDuring)
        throws DOMException;

    /**
     * See the position property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getPosition();

    /**
     * DOCUMENT ME!
     *
     * @param position DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setPosition(String position)
        throws DOMException;

    /**
     * See the quotes property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getQuotes();

    /**
     * DOCUMENT ME!
     *
     * @param quotes DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setQuotes(String quotes)
        throws DOMException;

    /**
     * See the richness property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getRichness();

    /**
     * DOCUMENT ME!
     *
     * @param richness DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setRichness(String richness)
        throws DOMException;

    /**
     * See the right property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getRight();

    /**
     * DOCUMENT ME!
     *
     * @param right DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setRight(String right)
        throws DOMException;

    /**
     * See the size property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getSize();

    /**
     * DOCUMENT ME!
     *
     * @param size DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setSize(String size)
        throws DOMException;

    /**
     * See the speak property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getSpeak();

    /**
     * DOCUMENT ME!
     *
     * @param speak DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setSpeak(String speak)
        throws DOMException;

    /**
     * See the speak-header property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getSpeakHeader();

    /**
     * DOCUMENT ME!
     *
     * @param speakHeader DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setSpeakHeader(String speakHeader)
        throws DOMException;

    /**
     * See the speak-numeral property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getSpeakNumeral();

    /**
     * DOCUMENT ME!
     *
     * @param speakNumeral DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setSpeakNumeral(String speakNumeral)
        throws DOMException;

    /**
     * See the speak-punctuation property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getSpeakPunctuation();

    /**
     * DOCUMENT ME!
     *
     * @param speakPunctuation DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setSpeakPunctuation(String speakPunctuation)
        throws DOMException;

    /**
     * See the speech-rate property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getSpeechRate();

    /**
     * DOCUMENT ME!
     *
     * @param speechRate DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setSpeechRate(String speechRate)
        throws DOMException;

    /**
     * See the stress property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getStress();

    /**
     * DOCUMENT ME!
     *
     * @param stress DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setStress(String stress)
        throws DOMException;

    /**
     * See the table-layout property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getTableLayout();

    /**
     * DOCUMENT ME!
     *
     * @param tableLayout DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setTableLayout(String tableLayout)
        throws DOMException;

    /**
     * See the text-align property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getTextAlign();

    /**
     * DOCUMENT ME!
     *
     * @param textAlign DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setTextAlign(String textAlign)
        throws DOMException;

    /**
     * See the text-decoration property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getTextDecoration();

    /**
     * DOCUMENT ME!
     *
     * @param textDecoration DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setTextDecoration(String textDecoration)
        throws DOMException;

    /**
     * See the text-indent property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getTextIndent();

    /**
     * DOCUMENT ME!
     *
     * @param textIndent DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setTextIndent(String textIndent)
        throws DOMException;

    /**
     * See the text-shadow property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getTextShadow();

    /**
     * DOCUMENT ME!
     *
     * @param textShadow DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setTextShadow(String textShadow)
        throws DOMException;

    /**
     * See the text-transform property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getTextTransform();

    /**
     * DOCUMENT ME!
     *
     * @param textTransform DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setTextTransform(String textTransform)
        throws DOMException;

    /**
     * See the top property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getTop();

    /**
     * DOCUMENT ME!
     *
     * @param top DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setTop(String top)
        throws DOMException;

    /**
     * See the unicode-bidi property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getUnicodeBidi();

    /**
     * DOCUMENT ME!
     *
     * @param unicodeBidi DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setUnicodeBidi(String unicodeBidi)
        throws DOMException;

    /**
     * See the vertical-align property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getVerticalAlign();

    /**
     * DOCUMENT ME!
     *
     * @param verticalAlign DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setVerticalAlign(String verticalAlign)
        throws DOMException;

    /**
     * See the visibility property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getVisibility();

    /**
     * DOCUMENT ME!
     *
     * @param visibility DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setVisibility(String visibility)
        throws DOMException;

    /**
     * See the voice-family property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getVoiceFamily();

    /**
     * DOCUMENT ME!
     *
     * @param voiceFamily DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setVoiceFamily(String voiceFamily)
        throws DOMException;

    /**
     * See the volume property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getVolume();

    /**
     * DOCUMENT ME!
     *
     * @param volume DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setVolume(String volume)
        throws DOMException;

    /**
     * See the white-space property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getWhiteSpace();

    /**
     * DOCUMENT ME!
     *
     * @param whiteSpace DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setWhiteSpace(String whiteSpace)
        throws DOMException;

    /**
     * See the widows property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getWidows();

    /**
     * DOCUMENT ME!
     *
     * @param widows DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setWidows(String widows)
        throws DOMException;

    /**
     * See the width property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getWidth();

    /**
     * DOCUMENT ME!
     *
     * @param width DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setWidth(String width)
        throws DOMException;

    /**
     * See the word-spacing property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getWordSpacing();

    /**
     * DOCUMENT ME!
     *
     * @param wordSpacing DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setWordSpacing(String wordSpacing)
        throws DOMException;

    /**
     * See the z-index property definition in CSS2.
     *
     * @return DOCUMENT ME!
     */
    public String getZIndex();

    /**
     * DOCUMENT ME!
     *
     * @param zIndex DOCUMENT ME!
     *
     * @throws DOMException DOCUMENT ME!
     */
    public void setZIndex(String zIndex)
        throws DOMException;
}