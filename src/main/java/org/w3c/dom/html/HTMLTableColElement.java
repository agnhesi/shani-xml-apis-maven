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
 * Regroups the <code>COL</code> and <code>COLGROUP</code> elements. See the
 * COL element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLTableColElement
    extends HTMLElement {
    /**
     * Horizontal alignment of cell data in column. See the align attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getAlign();

    /**
     * Horizontal alignment of cell data in column. See the align attribute
     * definition in HTML 4.01.
     *
     * @param align DOCUMENT ME!
     */
    public void setAlign(String align);

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
     * Indicates the number of columns in a group or affected by a grouping.
     * See the span attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public int getSpan();

    /**
     * Indicates the number of columns in a group or affected by a grouping.
     * See the span attribute definition in HTML 4.01.
     *
     * @param span DOCUMENT ME!
     */
    public void setSpan(int span);

    /**
     * Vertical alignment of cell data in column. See the valign attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getVAlign();

    /**
     * Vertical alignment of cell data in column. See the valign attribute
     * definition in HTML 4.01.
     *
     * @param vAlign DOCUMENT ME!
     */
    public void setVAlign(String vAlign);

    /**
     * Default column width. See the width attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getWidth();

    /**
     * Default column width. See the width attribute definition in HTML 4.01.
     *
     * @param width DOCUMENT ME!
     */
    public void setWidth(String width);
}