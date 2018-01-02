/*
 * @(#)ServerException.java	1.15 03/12/19
 *
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package java.rmi;

/**
 * A <code>ServerException</code> is thrown as a result of a remote method
 * invocation when a <code>RemoteException</code> is thrown while processing
 * the invocation on the server, either while unmarshalling the arguments or
 * executing the remote method itself.
 * 
 * A <code>ServerException</code> instance contains the original
 * <code>RemoteException</code> that occurred as its cause.
 *
 * @version 1.15, 12/19/03
 * @author  Ann Wollrath
 * @since   JDK1.1
 */
public class ServerException extends RemoteException {

    /* indicate compatibility with JDK 1.1.x version of class */
    private static final long serialVersionUID = -4775845313121906682L;

    /**
     * Constructs a <code>ServerException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
    public ServerException(String s) {
	super(s);
    }

    /**
     * Constructs a <code>ServerException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
    public ServerException(String s, Exception ex) {
	super(s, ex);
    }
}
