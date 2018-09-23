package com.hn.keeper.starter.serializer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.hn.keeper.starter.model.Keeper;
import com.hn.keeper.starter.service.KeeperService;

@JsonComponent
public class KeeperSerializer extends JsonSerializer<Keeper> {

	@Autowired
	private KeeperService keeperService;

	@Override
	public void serialize(Keeper payload, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException {

		jsonGenerator.writeStartObject();

		JavaType javaType = serializerProvider.constructType(payload.getClass());
		com.fasterxml.jackson.databind.BeanDescription beanDesc = serializerProvider.getConfig().introspect(javaType);
		JsonSerializer<Object> serializer = BeanSerializerFactory.instance.findBeanSerializer(serializerProvider,
				javaType, beanDesc);

		serializer.unwrappingSerializer(null).serialize(payload, jsonGenerator, serializerProvider);

		jsonGenerator.writeObjectField("extra_field", keeperService.getCurrentTransformer());
		jsonGenerator.writeEndObject();
	}

}