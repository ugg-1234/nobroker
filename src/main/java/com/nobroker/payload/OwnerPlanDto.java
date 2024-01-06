package com.nobroker.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlanDto {

    private  long planId;


    private String planName;

    private double price;

    private int palnValidity;

    private boolean relationshipManager;

    private boolean rentalAgreement;

    private boolean propertyPromotion;

    private boolean guaranteedTenants;

    private boolean showingProperty;

    private boolean facebookMarketingOfProperty;
}

