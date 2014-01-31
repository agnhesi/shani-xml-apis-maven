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

import org.w3c.dom.Document;


/**
 * Create a frame. See the FRAME element definition in HTML 4.01.
 * 
 * <p>
 * See also the <a
 * href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>Document
 * Object Model (DOM) Level 2 HTML Specification </a>.
 * </p>
 */
public interface HTMLFrameElement
    extends HTMLElement {
    /**
     * Request frame borders. See the frameborder attribute definition in HTML
     * 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getFrameBorder();

    /**
     * Request frame borders. See the frameborder attribute definition in HTML
     * 4.01.
     *
     * @param frameBorder DOCUMENT ME!
     */
    public void setFrameBorder(String frameBorder);

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating a long description of this image or frame. See the longdesc
     * attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getLongDesc();

    /**
     * URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396 </a>]
     * designating a long description of this image or frame. See the longdesc
     * attribute definition in HTML 4.01.
     *
     * @param longDesc DOCUMENT ME!
     */
    public void setLongDesc(String longDesc);

    /**
     * Frame margin height, in pixels. See the marginheight attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getMarginHeight();

    /**
     * Frame margin height, in pixels. See the marginheight attribute
     * definition in HTML 4.01.
     *
     * @param marginHeight DOCUMENT ME!
     */
    public void setMarginHeight(String marginHeight);

    /**
     * Frame margin width, in pixels. See the marginwidth attribute definition
     * in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getMarginWidth();

    /**
     * Frame margin width, in pixels. See the marginwidth attribute definition
     * in HTML 4.01.
     *
     * @param marginWidth DOCUMENT ME!
     */
    public void setMarginWidth(String marginWidth);

    /**
     * The frame name (object of the <code>target</code> attribute). See the
     * name attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getName();

    /**
     * The frame name (object of the <code>target</code> attribute). See the
     * name attribute definition in HTML 4.01.
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name);

    /**
     * When true, forbid user from resizing frame. See the noresize attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public boolean getNoResize();

    /**
     * When true, forbid user from resizing frame. See the noresize attribute
     * definition in HTML 4.01.
     *
     * @param noResize DOCUMENT ME!
     */
    public void setNoResize(boolean noResize);

    /**
     * Specify whether or not the frame should have scrollbars. See the
     * scrolling attribute definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getScrolling();

    /**
     * Specify whether or not the frame should have scrollbars. See the
     * scrolling attribute definition in HTML 4.01.
     *
     * @param scrolling DOCUMENT ME!
     */
    public void setScrolling(String scrolling);

    /**
     * A URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] designating the initial frame contents. See the src attribute
     * definition in HTML 4.01.
     *
     * @return DOCUMENT ME!
     */
    public String getSrc();

    /**
     * A URI [ <a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396
     * </a>] designating the initial frame contents. See the src attribute
     * definition in HTML 4.01.
     *
     * @param src DOCUMENT ME!
     */
    public void setSrc(String src);

    /**
     * The document this frame contains, if there is any and it is available,
     * or <code>null</code> otherwise.
     *
     * @return DOCUMENT ME!
     *
     * @since DOM Level 2
     */
    public Document getContentDocument();
}