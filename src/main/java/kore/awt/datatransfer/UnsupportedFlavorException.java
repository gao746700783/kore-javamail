/*
 * Copyright 1996-2000 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 * 
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package kore.awt.datatransfer;


/**
 * Signals that the requested data is not supported in this flavor.
 * 
 * @see Transferable#getTransferData
 * 
 * @author Amy Fowler
 */
public class UnsupportedFlavorException
		extends Exception {

	/*
	 * JDK 1.1 serialVersionUID
	 */
	private static final long serialVersionUID = 5383814944251665601L;

	/**
	 * Constructs an UnsupportedFlavorException.
	 * 
	 * @param flavor the flavor object which caused the exception. May
	 *            be <code>null</code>.
	 */
	public UnsupportedFlavorException(DataFlavor flavor) {
		super((flavor != null) ? flavor.getHumanPresentableName() : null);
	}
}