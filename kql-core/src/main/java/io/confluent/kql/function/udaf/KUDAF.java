/**
 * Copyright 2017 Confluent Inc.
 *
 **/

package io.confluent.kql.function.udaf;

import io.confluent.kql.physical.GenericRow;
import org.apache.kafka.streams.kstream.Aggregator;
import org.apache.kafka.streams.kstream.Initializer;

public abstract class KUDAF {
  Initializer<GenericRow> initializer;
  Aggregator<String, GenericRow, GenericRow> aggregator;

  public Initializer<GenericRow> getInitializer() {
      return initializer;
  }

  public void setInitializer(final Initializer<GenericRow> initializer) {
      this.initializer = initializer;
  }

  public Aggregator<String, GenericRow, GenericRow> getAggregator() {
      return aggregator;
  }

  public void setAggregator(final Aggregator<String, GenericRow, GenericRow> aggregator) {
      this.aggregator = aggregator;
  }
}