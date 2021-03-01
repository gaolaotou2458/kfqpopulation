/**
  * Copyright 2020 bejson.com
  */
package com.zhibodata.gis.kfqpopulation.dto.indto.resource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Auto-generated: 2020-07-31 10:12:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeatureEntity {

    private String type;
    private List<Features> features;

}
