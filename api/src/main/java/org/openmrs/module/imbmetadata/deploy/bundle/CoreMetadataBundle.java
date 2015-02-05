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
import org.openmrs.module.imbmetadata.reference.Locations;
import org.openmrs.module.imbmetadata.reference.MetadataSharingPackages;
import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.openmrs.module.imbmetadata.reference.LocationTags.ADMISSION_LOCATION;
import static org.openmrs.module.imbmetadata.reference.LocationTags.ALL;
import static org.openmrs.module.imbmetadata.reference.LocationTags.LOGIN_LOCATION;
import static org.openmrs.module.imbmetadata.reference.LocationTags.TRANSFER_LOCATION;
import static org.openmrs.module.imbmetadata.reference.LocationTags.VISIT_LOCATION;
import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.location;
import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.locationTag;

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
        installConcepts();
	}

	public void installLocations() {

		log.info("Installing Location Tags");

		install(locationTag(LOGIN_LOCATION.NAME, LOGIN_LOCATION.DESCRIPTION, LOGIN_LOCATION.UUID));
		install(locationTag(ADMISSION_LOCATION.NAME, ADMISSION_LOCATION.DESCRIPTION, ADMISSION_LOCATION.UUID));
		install(locationTag(TRANSFER_LOCATION.NAME, TRANSFER_LOCATION.DESCRIPTION, TRANSFER_LOCATION.UUID));
		install(locationTag(VISIT_LOCATION.NAME, VISIT_LOCATION.DESCRIPTION, VISIT_LOCATION.UUID));
		List<String> allTags = Arrays.asList(ALL);

		log.info("Installing Locations");

		// TODO: Review and set location tags appropriately for all below locations

		install(location("Unknown Location", "Unknown Location", Locations.UNKNOWN, null, allTags));
        install(location("Rwikwavu Hospital","Rwikwavu Hospital", Locations.RWINKWAVU_HOSPITAL,null,allTags));
        install(location("Rwikwavu Health Center","Rwikwavu Health Center", Locations.RWINKWAVU_HEALTH_CENTER,null,allTags));
        install(location("Rwantonde Health Center","Rwantonde Health Center", Locations.RWANTONDE_HEALTH_CENTER,null,allTags));
        install(location("Rutare Health Center","Rutare Health Center", Locations.RUTARE_HEALTH_CENTER,null,allTags));
        install(location("Rusumo Health Center","Rusumo Health Center", Locations.RUSUMO_HEALTH_CENTER,null,allTags));
        install(location("Ruramira Health Center","Ruramira Health Center", Locations.RURAMIRA_HEALTH_CENTER,null,allTags));
        install(location("Rukira Health Center","Rukira Health Center", Locations.RUKIRA_HEALTH_CENTER,null,allTags));
        install(location("Nyarubuye Health Center","Nyarubuye Health Center", Locations.NYARUBUYE_HEALTH_CENTER,null,allTags));
        install(location("Nyamirama Health Center","Nyamirama Health Center", Locations.NYAMIRAMA_HEALTH_CENTER,null,allTags));
        install(location("Nyabitare Health Center","Nyabitare Health Center", Locations.NYABITARE_HEALTH_CENTER,null,allTags));
        install(location("Ntaruka Health Center","Ntaruka Health Center", Locations.NTARUKA_HEALTH_CENTER,null,allTags));
        install(location("Nsinda Prison","Nsinda Prison", Locations.NSINDA_PRISON,null,allTags));
        install(location("Ndego Health Center","Ndego Health Center", Locations.NDEGO_HEALTH_CENTER,null,allTags));
        install(location("Nasho Health Center","Nasho Health Center", Locations.NASHO_HEALTH_CENTER,null,allTags));
        install(location("Mushikiri Health Center","Mushikiri Health Center", Locations.MUSHIKIRI_HEALTH_CENTE,null,allTags));
        install(location("Musaza Health Center","Musaza Health Center", Locations.MUSAZA_HEALTH_CENTER,null,allTags));
        install(location("Mulindi Health Center","Mulindi Health Center", Locations.MULINDI_HEALTH_CENTER,null,allTags));
        install(location("Mahama Health Center","Mahama Health Center", Locations.MAHAMA_HEALTH_CENTER,null,allTags));
        install(location("Kirehe Hospital","Kirehe Hospital", Locations.KIREHE_HOSPITAL,null,allTags));
        install(location("Kirehe Health Center","Kirehe Health Center", Locations.KIREHE_HEALTH_CENTER,null,allTags));
        install(location("Kibungo Hospital","Kibungo Hospital", Locations.KIBUNGO_PRISON,null,allTags));
        install(location("Karama Health Center","Karama Health Center", Locations.KARAMA_HEALTH_CENTER,null,allTags));
        install(location("Kabuye Health Center","Kabuye Health Center", Locations.KABUYE_HEALTH_CENTER,null,allTags));
        install(location("Kabarondo Health Center","Kabarondo Health Center", Locations.KABARONDO_HEALTH_CENTER,null,allTags));
        install(location("Gashongora Health Center","Gashongora Health Center", Locations.GASHONGORA_HEALTH_CENTER,null,allTags));
        install(location("Gahara Health Center","Gahara Health Center", Locations.GAHARA_HEALTH_CENTER,null,allTags));
        install(location("Cyarubare Health Center","Cyarubare Health Center", Locations.CYARUBARE_HEALTH_CENTER,null,allTags));
        install(location("Bukora Health Center","Bukora Health Center", Locations.BUKORA_HEALTH_CENTER,null,allTags));

        // Rwink Retired locations
        uninstall(location("Rwanda", "Rwanda", Locations.RETIRED_RWANDA),"retired");
        uninstall(location("Ruhengeri Health Center","Ruhengeri Health Center", Locations.RETIRED_RUHENGERI),"retired");
        uninstall(location("Gasiza Health Center","Gasiza Health Center", Locations.RETIRED_GASIZA),"retired");
        uninstall(location("Delete","Delete", Locations.RETIRED_DELETE),"retired");
        uninstall(location("Burera","Burera", Locations.RETIRED_BURERA), "retired");


        //DB Test Location
        install(location("Inman Health Center","Inman Health Center", Locations.INMAN_HOSPITAL));
	}

    public void installConcepts() {
        installMetadataSharingPackage(MetadataSharingPackages.DIAGNOSIS_CONCEPT_SET_NAME + "-"
                + MetadataSharingPackages.DIAGNOSIS_CONCEPT_SET_VERSION + ".zip",
                MetadataSharingPackages.DIAGNOSIS_CONCEPT_SET_UUID);

    }
}