package com.haoqi.magic.business.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.haoqi.magic.business.enums.YesOrNoEnum;

import java.io.IOException;

/**
 *
 * @author twg
 * @since 2019/12/4
 */
public class YesOrNoSerializer extends JsonSerializer<Integer> {


    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(YesOrNoEnum.getNameByKey(value));
    }
}
