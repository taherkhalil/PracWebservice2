package com.globalpay.ws.ca.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class ObjectMapper {
	// private static Mapper mapper = DozerBeanMapperSingletonWrapper
	// .getInstance();
	static DozerBeanMapper mapper = new DozerBeanMapper();
	static {
		final List<String> mappingFilesNames = new ArrayList<>();
		mappingFilesNames.add("dozerBeanMapping.xml");
		mapper.setMappingFiles(mappingFilesNames);
	}

	public static <T, S> T map(S sourceObject, Class<T> destination) {
		T msgReq = null;
		if (sourceObject != null) {

			msgReq = mapper.map(sourceObject, destination);
		}
		return msgReq;
	}
}
