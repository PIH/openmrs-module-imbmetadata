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
        install(location("Rwikwavu Hospital","Rwikwavu Hospital", Locations.RWINKWAVU_HOSPITAL,null,LocationTags.ALL));
        install(location("Rwikwavu Health Center","Rwikwavu Health Center", Locations.RWINKWAVU_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Rwantonde Health Center","Rwantonde Health Center", Locations.RWANTONDE_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Rutare Health Center","Rutare Health Center", Locations.RUTARE_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Rusumo Health Center","Rusumo Health Center", Locations.RUSUMO_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Ruramira Health Center","Ruramira Health Center", Locations.RURAMIRA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Rukira Health Center","Rukira Health Center", Locations.RUKIRA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Nyarubuye Health Center","Nyarubuye Health Center", Locations.NYARUBUYE_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Nyamirama Health Center","Nyamirama Health Center", Locations.NYAMIRAMA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Nyabitare Health Center","Nyabitare Health Center", Locations.NYABITARE_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Ntaruka Health Center","Ntaruka Health Center", Locations.NTARUKA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Nsinda Prison","Nsinda Prison", Locations.NSINDA_PRISON,null,LocationTags.ALL));
        install(location("Ndego Health Center","Ndego Health Center", Locations.NDEGO_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Nasho Health Center","Nasho Health Center", Locations.NASHO_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Mushikiri Health Center","Mushikiri Health Center", Locations.MUSHIKIRI_HEALTH_CENTE,null,LocationTags.ALL));
        install(location("Musaza Health Center","Musaza Health Center", Locations.MUSAZA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Mulindi Health Center","Mulindi Health Center", Locations.MULINDI_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Mahama Health Center","Mahama Health Center", Locations.MAHAMA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Kirehe Hospital","Kirehe Hospital", Locations.KIREHE_HOSPITAL,null,LocationTags.ALL));
        install(location("Kirehe Health Center","Kirehe Health Center", Locations.KIREHE_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Kibungo Hospital","Kibungo Hospital", Locations.KIBUNGO_PRISON,null,LocationTags.ALL));
        install(location("Karama Health Center","Karama Health Center", Locations.KARAMA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Kabuye Health Center","Kabuye Health Center", Locations.KABUYE_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Kabarondo Health Center","Kabarondo Health Center", Locations.KABARONDO_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Gashongora Health Center","Gashongora Health Center", Locations.GASHONGORA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Gahara Health Center","Gahara Health Center", Locations.GAHARA_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Cyarubare Health Center","Cyarubare Health Center", Locations.CYARUBARE_HEALTH_CENTER,null,LocationTags.ALL));
        install(location("Bukora Health Center","Bukora Health Center", Locations.BUKORA_HEALTH_CENTER,null,LocationTags.ALL));

        // Rwink Retired locations
        uninstall(location("Rwanda", "Rwanda", Locations.RETIRED_RWANDA),"retired");
        uninstall(location("Ruhengeri Health Center","Ruhengeri Health Center", Locations.RETIRED_RUHENGERI),"retired");
        uninstall(location("Gasiza Health Center","Gasiza Health Center", Locations.RETIRED_GASIZA),"retired");
        uninstall(location("Delete","Delete", Locations.RETIRED_DELETE),"retired");
        uninstall(location("Burera","Burera", Locations.RETIRED_BURERA), "retired");


        //DB Test Location
        install(location("Inman Health Center","Inman Health Center", Locations.INMAN_HOSPITAL));


        // TODO: For now, set unknown location as login, etc.  Evolve this as needed and add any unit tests needed to confirm set up correctly
	}
}