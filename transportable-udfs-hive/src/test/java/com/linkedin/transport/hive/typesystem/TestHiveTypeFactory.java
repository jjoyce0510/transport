/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.transport.hive.typesystem;

import com.linkedin.transport.typesystem.AbstractBoundVariables;
import com.linkedin.transport.typesystem.AbstractTestTypeFactory;
import com.linkedin.transport.typesystem.AbstractTypeFactory;
import com.linkedin.transport.typesystem.AbstractTypeSystem;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.testng.annotations.Test;


@Test
public class TestHiveTypeFactory extends AbstractTestTypeFactory<ObjectInspector> {

  @Override
  protected AbstractTypeSystem<ObjectInspector> getTypeSystem() {
    return new HiveTypeSystem();
  }

  @Override
  protected AbstractTypeFactory<ObjectInspector> getTypeFactory() {
    return new HiveTypeFactory();
  }

  @Override
  protected AbstractBoundVariables<ObjectInspector> createBoundVariables() {
    return new HiveBoundVariables();
  }
}
