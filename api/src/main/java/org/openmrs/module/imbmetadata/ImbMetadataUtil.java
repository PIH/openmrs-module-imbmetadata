/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.imbmetadata;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility methods
 */
public class ImbMetadataUtil {

	/**
	 * @param keysAndValues an array of inputs, should be in the form of key, value, key, value ...
	 * @return a Map of key to value pairs
	 */
	public static Map<String, String> toMap(String... keysAndValues) {
		Map<String, String> ret = new HashMap<String, String>();
		if (keysAndValues != null) {
			for (int i = 0; i < keysAndValues.length; i+=2) {
				ret.put(keysAndValues[i], keysAndValues[i+1]);
			}
		}
		return ret;
	}
		
}
