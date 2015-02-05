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

package org.openmrs.module.imbmetadata.deploy.bundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.emrapi.EmrApiConstants;
import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Core metadata bundle that is common across entire distribution
 */
@Component
public class GlobalPropertyBundle extends ImbMetadataBundle {

	protected Log log = LogFactory.getLog(getClass());

	/**
	 * @see AbstractMetadataBundle#install()
	 */
	@Override
	public void install() {
		log.info("Installing Global Properties");

		Map<String, String> m = new HashMap<String ,String>();

		// Configure EMR API Module

		// TODO: Fill these in once they are defined and created
		m.put(EmrApiConstants.GP_ADMISSION_ENCOUNTER_TYPE, "");
		m.put(EmrApiConstants.GP_TRANSFER_WITHIN_HOSPITAL_ENCOUNTER_TYPE, "");
		m.put(EmrApiConstants.GP_EXIT_FROM_INPATIENT_ENCOUNTER_TYPE, "");
		m.put(EmrApiConstants.GP_CHECK_IN_ENCOUNTER_TYPE, "");
		m.put(EmrApiConstants.GP_AT_FACILITY_VISIT_TYPE, "");
		m.put(EmrApiConstants.GP_DIAGNOSIS_SET_OF_SETS, "");
	}
}