/*******************************************************************************
 * Copyright (c) 2009 CollabNet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     CollabNet - initial API and implementation
 ******************************************************************************/
package com.collabnet.subversion.merge;

public class SkippedMergeResult extends MergeResult implements ISkippedMergeResult {

	public SkippedMergeResult(String action, String propertyAction, String treeConflictAction, String path, boolean error) {
		super(action, propertyAction, treeConflictAction, path, error);
	}

}
