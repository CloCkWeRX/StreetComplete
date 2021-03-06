package de.westnordost.streetcomplete.data.osmnotes;

import de.westnordost.osmapi.map.data.Element;
import de.westnordost.osmapi.map.data.LatLon;

public class CreateNote
{
	public long id;
	public String text;
	public LatLon position;
	public Element.Type elementType;
	public Long elementId;

	public boolean hasAssociatedElement()
	{
		return elementType != null && elementId != null;
	}
}
