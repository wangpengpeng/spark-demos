package com.netease.spark.utils;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.spark.serializer.KryoRegistrator;

import com.esotericsoftware.kryo.Kryo;

public class KafkaRegistrator implements KryoRegistrator {
	@Override
	public void registerClasses(Kryo arg0) {
		arg0.register(ConsumerRecord.class);
	}
}

