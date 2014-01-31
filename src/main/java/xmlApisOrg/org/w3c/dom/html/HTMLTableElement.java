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

import org.w3c.dom.DOMException;


/**
 * The create and delete methods on the table allow authors to construct and
 * modify tables. [ <a
 * href='http://www.w3.org/TR/1999/REC-html401-19991224'>HTML 4.01 </a>]
 * specifies that only one of each of the <code>CAPTION</code>,
 * <code>THEAD</code>, and <code>TFOOT</code> elements may exist in a table.
 * Therefore, if one exists, and the createTHead() or createTFoot() method is
 * called, the method returns the existing THead or TFoot element. See the
 * TABLE element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLTableElement
    extends HTMLElement {
    /**
     * Returns the table's <code>CAPTION</code>, or void if none exists.
     *
     * @return DOCUMENT ME!
     */
    public HTMLTableCaptionElement getCaption();

    /**
     * Returns the table's <code>CAPTION</code>, or void if none exists.
     *
     * @param caption DOCUMENT ME!
     *
     * @exception DOMException HIERARCHY_REQUEST_ERR: if the element is not a
     *            <code>CAPTION</code>.
     */
    public void setCaption(HTMLTableCaptionElement caption)
        throws DOMException;

    /**
     * Returns the table's <code>THEAD</code>, or <code>null</code> if none
     * exists.
     *
     * @return DOCUMENT ME!
     */
    public HTMLTableSectionElement getTHead();

    /**
     * Returns the table's <code>THEAD</code>, or <code>null</code> if none
     * exists.
     *
     * @param tHead DOCUMENT ME!
     *
     * @exception DOMException HIERARCHY_REQUEST_ERR: if the element is not a
     *            <code>THEAD</code>.
     */
    public void setTHead(HTMLTableSectionElement tHead)
        throws DOMException;

    /**
     * Returns the table's <code>TFOOT</code>, or <code>null</code> if none
     * exists.
     *
     * @return DOCUMENT ME!
     */
    public HTMLTableSectionElement getTFoot();

    /**
     * Returns the table's <code>TFOOT</code>, or <code>null</code> if none
     * exists.
     *
     * @param tFoot DOCUMENT ME!
     *
     * @exception DOMException HIERARCHY_REQUEST_ERR: if the element is not a
     *            <code>TFOOT</code>.
     */
    public void setTFoot(HTMLTableSectionElement tFoot)
        throws DOMException;

    /**
     * Returns a collection of all the rows in the table, including all in
     * <code>THEAD</code>,<code>TFOOT</code>, all <code>TBODY</code> elements.
     *
     * @return DOCUMENT ME!
     */
    public HTMLCollection getRows();

    /**
     * Returns a collection of the table bodies (including implicit ones).
     *
     * @return DOCUMENT ME!
     */
    public HTMLCollection getTBodies();

    /**
     * Specifies the table's position with respect to the rest of the document.
     * See the align attribute definition in HTML 4.01. This attribute is
     * deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAlign();

    /**
     * Specifies the table's position with respect to the rest of the document.
     * See the align attribute definition in HTML 4.01. This attribute is
     * deprecated in HTML 4.01.
     *
     * @param align DOCUMENT ME!
     */
    public void setAlign(String align);

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
     * The width of the border around the table. See the border attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getBorder();

    /**
     * The width of the border around the table. See the border attribute
     * definition in HTML 4.01.
     *
     * @param border DOCUMENT ME!
     */
    public void setBorder(String border);

    /**
     * Specifies the horizontal and vertical space between cell content and
     * cell borders. See the cellpadding attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCellPadding();

    /**
     * Specifies the horizontal and vertical space between cell content and
     * cell borders. See the cellpadding attribute definition in HTML 4.01.
     *
     * @param cellPadding DOCUMENT ME!
     */
    public void setCellPadding(String cellPadding);

    /**
     * Specifies the horizontal and vertical separation between cells. See the
     * cellspacing attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getCellSpacing();

    /**
     * Specifies the horizontal and vertical separation between cells. See the
     * cellspacing attribute definition in HTML 4.01.
     *
     * @param cellSpacing DOCUMENT ME!
     */
    public void setCellSpacing(String cellSpacing);

    /**
     * Specifies which external table borders to render. See the frame
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getFrame();

    /**
     * Specifies which external table borders to render. See the frame
     * attribute definition in HTML 4.01.
     *
     * @param frame DOCUMENT ME!
     */
    public void setFrame(String frame);

    /**
     * Specifies which internal table borders to render. See the rules
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getRules();

    /**
     * Specifies which internal table borders to render. See the rules
     * attribute definition in HTML 4.01.
     *
     * @param rules DOCUMENT ME!
     */
    public void setRules(String rules);

    /**
     * Description about the purpose or structure of a table. See the summary
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getSummary();

    /**
     * Description about the purpose or structure of a table. See the summary
     * attribute definition in HTML 4.01.
     *
     * @param summary DOCUMENT ME!
     */
    public void setSummary(String summary);

    /**
     * Specifies the desired table width. See the width attribute definition in
     * HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getWidth();

    /**
     * Specifies the desired table width. See the width attribute definition in
     * HTML 4.01.
     *
     * @param width DOCUMENT ME!
     */
    public void setWidth(String width);

    /**
     * Create a table header row or return an existing one.
     *
     * @return A new table header element (<code>THEAD</code>).
     */
    public HTMLElement createTHead();

    /**
     * Delete the header from the table, if one exists.
     */
    public void deleteTHead();

    /**
     * Create a table footer row or return an existing one.
     *
     * @return A footer element (<code>TFOOT</code>).
     */
    public HTMLElement createTFoot();

    /**
     * Delete the footer from the table, if one exists.
     */
    public void deleteTFoot();

    /**
     * Create a new table caption object or return an existing one.
     *
     * @return A <code>CAPTION</code> element.
     */
    public HTMLElement createCaption();

    /**
     * Delete the table caption, if one exists.
     */
    public void deleteCaption();

    /**
     * Insert a new empty row in the table. The new row is inserted immediately
     * before and in the same section as the current <code>index</code> th row
     * in the table. If <code>index</code> is -1 or equal to the number of
     * rows, the new row is appended. In addition, when the table is empty the
     * row is inserted into a <code>TBODY</code> which is created and inserted
     * into the table.A table row cannot be empty according to [ <a
     * href='http://www.w3.org/TR/1999/REC-html401-19991224'>HTML 4.01 </a>].
     *
     * @param index The row number where to insert a new row. This index starts
     *        from 0 and is relative to the logical order (not document order)
     *        of all the rows contained inside the table.
     *
     * @return The newly created row.
     *
     * @exception DOMException INDEX_SIZE_ERR: Raised if the specified index is
     *            greater than the number of rows or if the index is a
     *            negative number other than -1.
     */
    public HTMLElement insertRow(int index)
        throws DOMException;

    /**
     * Delete a table row.
     *
     * @param index The index of the row to be deleted. This index starts from
     *        0 and is relative to the logical order (not document order) of
     *        all the rows contained inside the table. If the index is -1 the
     *        last row in the table is deleted.
     *
     * @exception DOMException INDEX_SIZE_ERR: Raised if the specified index is
     *            greater than or equal to the number of rows or if the index
     *            is a negative number other than -1.
     */
    public void deleteRow(int index)
        throws DOMException;
}