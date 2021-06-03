package com.promineotech.jeep.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {
  private Long modelPK;
  private JeepModel modelId;
  private String trimLevel;
  private int numDoors;
  private int wheelSize;
  private BigDecimal basePrice;
  
  public Jeep(Long pkId, int model, String trim, int doors, int wSize, BigDecimal bPrice)
  {
	  this.modelPK = pkId;
	  this.modelId = JeepModel.values()[model - 1];
	  this.trimLevel = trim;
	  this.numDoors = doors;
	  this.wheelSize = wSize;
	  this.basePrice = bPrice;
  }
}
