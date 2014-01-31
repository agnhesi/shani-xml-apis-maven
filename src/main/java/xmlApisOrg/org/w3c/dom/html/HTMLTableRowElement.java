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
 * A row in a table. See the TR element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLTableRowElement
    extends HTMLElement {
    /**
     * This is in logical order and not in document order. The
     * <code>rowIndex</code> does take into account sections (
     * <code>THEAD</code>,<code>TFOOT</code>, or <code>TBODY</code>) within
     * the table, placing <code>THEAD</code> rows first in the index, followed
     * by <code>TBODY</code> rows, followed by <code>TFOOT</code> rows.
     *
     * @return DOCUMENT ME!
     */
    public int getRowIndex();

    /**
     * The index of this row, relative to the current section (
     * <code>THEAD</code>,<code>TFOOT</code>, or <code>TBODY</code>), starting
     * from 0.
     *
     * @return DOCUMENT ME!
     */
    public int getSectionRowIndex();

    /**
     * The collection of cells in this row.
     *
     * @return DOCUMENT ME!
     */
    public HTMLCollection getCells();

    /**
     * Horizontal alignment of data within cells of this row. See the align
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAlign();

    /**
     * Horizontal alignment of data within cells of this row. See the align
     * attribute definition in HTML 4.01.
     *
     * @param align DOCUMENT ME!
     */
    public void setAlign(String align);

    /**
     * Background color for rows. See the bgcolor attribute definition in HTML
     * 4.01. This attribute is deprecated in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getBgColor();

    /**
     * Background color for rows. See the bgcolor attribute definition in HTML
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
     * Vertical alignment of data within cells of this row. See the valign
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getVAlign();

    /**
     * Vertical alignment of data within cells of this row. See the valign
     * attribute definition in HTML 4.01.
     *
     * @param vAlign DOCUMENT ME!
     */
    public void setVAlign(String vAlign);

    /**
     * Insert an empty <code>TD</code> cell into this row. If
     * <code>index</code> is -1 or equal to the number of cells, the new cell
     * is appended.
     *
     * @param index The place to insert the cell, starting from 0.
     *
     * @return The newly created cell.
     *
     * @exception DOMException INDEX_SIZE_ERR: Raised if the specified
     *            <code>index</code> is greater than the number of cells or if
     *            the index is a negative number other than -1.
     */
    public HTMLElement insertCell(int index)
        throws DOMException;

    /**
     * Delete a cell from the current row.
     *
     * @param index The index of the cell to delete, starting from 0. If the
     *        index is -1 the last cell in the row is deleted.
     *
     * @exception DOMException INDEX_SIZE_ERR: Raised if the specified
     *            <code>index</code> is greater than or equal to the number of
     *            cells or if the index is a negative number other than -1.
     */
    public void deleteCell(int index)
        throws DOMException;
}