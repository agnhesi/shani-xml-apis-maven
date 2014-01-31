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

package org.w3c.dom.html;

/**
 * The object used to represent the <code>TH</code> and <code>TD</code>
 * elements. See the TD element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLTableCellElement
    extends HTMLElement {
    /**
     * The index of this cell in the row, starting from 0. This index is in
     * document tree order and not display order.
     *
     * @return DOCUMENT ME!
     */
    public int getCellIndex();

    /**
     * Abbreviation for header cells. See the abbr attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAbbr();

    /**
     * Abbreviation for header cells. See the abbr attribute definition in HTML
     * 4.01.
     *
     * @param abbr DOCUMENT ME!
     */
    public void setAbbr(String abbr);

    /**
     * Horizontal alignment of data in cell. See the align attribute definition
     * in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAlign();

    /**
     * Horizontal alignment of data in cell. See the align attribute definition
     * in HTML 4.01.
     *
     * @param align DOCUMENT ME!
     */
    public void setAlign(String align);

    /**
     * Names group of related headers. See the axis attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAxis();

    /**
     * Names group of related headers. See the axis attribute definition in
     * HTML 4.01.
     *
     * @param axis DOCUMENT ME!
     */
    public void setAxis(String axis);

    /**
     * Cell background color. See the bgcolor attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getBgColor();

    /**
     * Cell background color. See the bgcolor attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param bgColor DOCUMENT ME!
     */
    public void setBgColor(String bgColor);

    /**
     * Alignment character for cells in a column. See the char attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCh();

    /**
     * Alignment character for cells in a column. See the char attribute
     * definition in HTML 4.01.
     *
     * @param ch DOCUMENT ME!
     */
    public void setCh(String ch);

    /**
     * Offset of alignment character. See the charoff attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getChOff();

    /**
     * Offset of alignment character. See the charoff attribute definition in
     * HTML 4.01.
     *
     * @param chOff DOCUMENT ME!
     */
    public void setChOff(String chOff);

    /**
     * Number of columns spanned by cell. See the colspan attribute definition
     * in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getColSpan();

    /**
     * Number of columns spanned by cell. See the colspan attribute definition
     * in HTML 4.01.
     *
     * @param colSpan DOCUMENT ME!
     */
    public void setColSpan(int colSpan);

    /**
     * List of <code>id</code> attribute values for header cells. See the
     * headers attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHeaders();

    /**
     * List of <code>id</code> attribute values for header cells. See the
     * headers attribute definition in HTML 4.01.
     *
     * @param headers DOCUMENT ME!
     */
    public void setHeaders(String headers);

    /**
     * Cell height. See the height attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getHeight();

    /**
     * Cell height. See the height attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param height DOCUMENT ME!
     */
    public void setHeight(String height);

    /**
     * Suppress word wrapping. See the nowrap attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getNoWrap();

    /**
     * Suppress word wrapping. See the nowrap attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @param noWrap DOCUMENT ME!
     */
    public void setNoWrap(boolean noWrap);

    /**
     * Number of rows spanned by cell. See the rowspan attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getRowSpan();

    /**
     * Number of rows spanned by cell. See the rowspan attribute definition in
     * HTML 4.01.
     *
     * @param rowSpan DOCUMENT ME!
     */
    public void setRowSpan(int rowSpan);

    /**
     * Scope covered by header cells. See the scope attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getScope();

    /**
     * Scope covered by header cells. See the scope attribute definition in
     * HTML 4.01.
     *
     * @param scope DOCUMENT ME!
     */
    public void setScope(String scope);

    /**
     * Vertical alignment of data in cell. See the valign attribute definition
     * in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getVAlign();

    /**
     * Vertical alignment of data in cell. See the valign attribute definition
     * in HTML 4.01.
     *
     * @param vAlign DOCUMENT ME!
     */
    public void setVAlign(String vAlign);

    /**
     * Cell width. See the width attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getWidth();

    /**
     * Cell width. See the width attribute definition in HTML 4.01. This
     * attribute is deprecated in HTML 4.01.
     *
     * @param width DOCUMENT ME!
     */
    public void setWidth(String width);
}