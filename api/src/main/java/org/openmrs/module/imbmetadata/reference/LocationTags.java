package org.openmrs.module.imbmetadata.reference;

import org.openmrs.LocationTag;
import org.openmrs.module.emrapi.EmrApiConstants;
import org.openmrs.module.imbmetadata.ImbMetadataUtil;
import org.openmrs.module.metadatadeploy.bundle.CoreConstructors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Defines all of the Location Tags needed for the system
 */
public class LocationTags {

	// UUID CONSTANTS

	public static final String LOGIN_LOCATION = "b8bbf83e-645f-451f-8efe-a0db56f09676";
	public static final String VISIT_LOCATION = "0967d73d-f3c9-492b-abed-356478610a94";
	public static final String ADMISSION_LOCATION = "f5b9737b-14d5-402b-8475-dd558808e172";
	public static final String TRANSFER_LOCATION = "9783aba6-df7b-4969-be6e-1e03e7a08965";

	// NAME CONSTANTS

	public static final Map<String, String> NAMES = ImbMetadataUtil.toMap(
			LOGIN_LOCATION, EmrApiConstants.LOCATION_TAG_SUPPORTS_LOGIN,
			VISIT_LOCATION, EmrApiConstants.LOCATION_TAG_SUPPORTS_VISITS,
			ADMISSION_LOCATION, EmrApiConstants.LOCATION_TAG_SUPPORTS_ADMISSION,
			TRANSFER_LOCATION, EmrApiConstants.LOCATION_TAG_SUPPORTS_TRANSFER
	);

	// DESCRIPTION CONSTANTS

	public static final Map<String, String> DESCRIPTIONS = ImbMetadataUtil.toMap(
			LOGIN_LOCATION, "When a user logs in and chooses a session location, they may only choose one with this tag",
			VISIT_LOCATION, "Visits are only allowed to happen at locations tagged with this location tag or at locations that descend from a location tagged with this tag.",
			ADMISSION_LOCATION, "Patients may only be admitted to inpatient care in a location with this tag",
			TRANSFER_LOCATION, "Patients may only be transfer to inpatient care in a location with this tag"
	);

	// CONVENIENCE SET CONSTANTS

	public static final List<String> ALL = Arrays.asList(LOGIN_LOCATION, VISIT_LOCATION, ADMISSION_LOCATION, TRANSFER_LOCATION);

	/**
	 * For the given uuid, returns an unsaved LocationTag template that describes what should be created
	 */
	public static LocationTag getTemplate(String uuid) {
		return CoreConstructors.locationTag(NAMES.get(uuid), DESCRIPTIONS.get(uuid), uuid);
	}
}
