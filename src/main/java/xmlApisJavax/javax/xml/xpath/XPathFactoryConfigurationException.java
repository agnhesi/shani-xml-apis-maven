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
 * $Id: XPathFactoryConfigurationException.java,v 1.3 2005/11/03 19:34:16 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright 2005 Sun Microsystems, Inc. All Rights Reserved.
 */

package javax.xml.xpath;

/**
 * <code>XPathFactoryConfigurationException</code> represents a configuration error in a <code>XPathFactory</code> environment.</p>
 *
 * @author  <a href="mailto:Norman.Walsh@Sun.com">Norman Walsh</a>
 * @author  <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @version $Revision: 1.3 $, $Date: 2005/11/03 19:34:16 $
 * @since 1.5
 */
public class XPathFactoryConfigurationException extends XPathException {
    
    /**
     * <p>Stream Unique Identifier.</p>
     */
    private static final long serialVersionUID = -1837080260374986980L;    
    
    /**
     * <p>Constructs a new <code>XPathFactoryConfigurationException</code> with the specified detail <code>message</code>.</p>
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
    public XPathFactoryConfigurationException(String message) {
        super(message);
    }

    /**
     * <p>Constructs a new <code>XPathFactoryConfigurationException</code>
     * with the specified <code>cause</code>.</p>
     *
     * <p>If <code>cause</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param cause The cause.
     *
     * @throws NullPointerException if <code>cause</code> is <code>null</code>.
     */
    public XPathFactoryConfigurationException(Throwable cause) {
        super(cause);
    }
}
