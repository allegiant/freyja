package org.freyja.cache;

import java.io.Serializable;

public class PersistObj implements Serializable {

	protected Boolean serialize;

	public Boolean getSerialize() {
		return serialize;
	}

	public void setSerialize(Boolean serialize) {
		this.serialize = serialize;
	}

}
