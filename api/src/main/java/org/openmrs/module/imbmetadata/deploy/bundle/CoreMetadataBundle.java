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
import org.openmrs.module.imbmetadata.reference.LocationTags;
import org.openmrs.module.imbmetadata.reference.Locations;
import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.location;

/**
 * Core metadata bundle that is common across entire distribution
 */
@Component
public class CoreMetadataBundle extends ImbMetadataBundle {

	protected Log log = LogFactory.getLog(getClass());

	/**
	 * @see AbstractMetadataBundle#install()
	 */
	@Override
	public void install() {
		log.info("Installing Core Metadata");
		installLocations();
	}

	public void installLocations() {

		log.info("Installing Location Tags");

		install(LocationTags.getTemplate(LocationTags.LOGIN_LOCATION));
		install(LocationTags.getTemplate(LocationTags.ADMISSION_LOCATION));
		install(LocationTags.getTemplate(LocationTags.TRANSFER_LOCATION));
		install(LocationTags.getTemplate(LocationTags.VISIT_LOCATION));

		log.info("Installing Locations");

		install(location("Unknown Location", "Unknown Location", Locations.UNKNOWN, null, LocationTags.ALL));

		// TODO: For now, set unknown location as login, etc.  Evolve this as needed and add any unit tests needed to confirm set up correctly
	}
}