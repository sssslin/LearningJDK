/*
 * @(#)MenuEvent.java	1.15 03/12/19
 *
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package javax.swing.event;

import java.util.EventObject;


/**
 * MenuEvent is used to notify interested parties that 
 * the menu which is the event source has been posted,
 * selected, or canceled.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans<sup><font size="-2">TM</font></sup>
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @version 1.15 12/19/03
 * @author Georges Saab
 * @author David Karlton
 */
public class MenuEvent extends EventObject {
    /**
     * Constructs a MenuEvent object.
     *
     * @param source  the Object that originated the event
     *                (typically <code>this</code>)
     */
    public MenuEvent(Object source) {
        super(source);
    }
}

