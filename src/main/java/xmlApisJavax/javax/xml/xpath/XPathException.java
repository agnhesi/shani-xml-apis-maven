/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://jaxp.dev.java.net/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://jaxp.dev.java.net/CDDLv1.0.html
 * If applicable add the following below this CDDL HEADER
 * with the fields enclosed by brackets "[]" replaced with
 * your own identifying information: Portions Copyright
 * [year] [name of copyright owner]
 */

/*
 * $Id: XPathException.java,v 1.3 2005/11/03 19:34:16 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright 2005 Sun Microsystems, Inc. All Rights Reserved.
 */

package javax.xml.xpath;

import java.io.PrintWriter;

/**
 * <code>XPathException</code> represents a generic XPath exception.</p>
 *
 * @author  <a href="Norman.Walsh@Sun.com">Norman Walsh</a>
 * @author <a href="mailto:Jeff.Suttor@Sun.COM">Jeff Suttor</a>
 * @version $Revision: 1.3 $, $Date: 2005/11/03 19:34:16 $
 * @since 1.5
 */
public class XPathException extends Exception {

    private final Throwable cause;
    
    /**
     * <p>Stream Unique Identifier.</p>
     */
    private static final long serialVersionUID = -1837080260374986980L;

    /**
     * <p>Constructs a new <code>XPathException</code>
     * with the specified detail <code>message</code>.</p>
     *
     * <p>The <code>cause</code> is not initialized.</p>
     *
     * <p>If <code>message</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param message The detail message.
     *
     * @throws NullPointerException When <code>message</code> is
     *   <code>null</code>.
     */
    public XPathException(String message) {
        super(message);
        if ( message == null ) {
            throw new NullPointerException ( "message can't be null");
        }
        this.cause = null;
    }

    /**
     * <p>Constructs a new <code>XPathException</code>
     * with the specified <code>cause</code>.</p>
     *
     * <p>If <code>cause</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param cause The cause.
     *
     * @throws NullPointerException if <code>cause</code> is <code>null</code>.
     */
    public XPathException(Throwable cause) {
        super();
        this.cause = cause;
        if ( cause == null ) {
            throw new NullPointerException ( "cause can't be null");
        }
    }

    /**
     * <p>Get the cause of this XPathException.</p>
     *
     * @return Cause of this XPathException.
     */
    public Throwable getCause() {
        return cause;
    }

    /**
     * <p>Print stack trace to specified <code>PrintStream</code>.</p>
     *
     * @param s Print stack trace to this <code>PrintStream</code>.
     */
    public void printStackTrace(java.io.PrintStream s) {
        if (getCause() != null) {
            getCause().printStackTrace(s);
          s.println("--------------- linked to ------------------");
        }

        super.printStackTrace(s);
    }

    /**
     * <p>Print stack trace to <code>System.err</code>.</p>
     */
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /**
     * <p>Print stack trace to specified <code>PrintWriter</code>.</p>
     *
     * @param s Print stack trace to this <code>PrintWriter</code>.
     */
    public void printStackTrace(PrintWriter s) {

        if (getCause() != null) {
            getCause().printStackTrace(s);
          s.println("--------------- linked to ------------------");
        }

        super.printStackTrace(s);
    }
}
