package com.example.springbootproject.NEW.API.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GetResponse {
    private String placeName;
    private String countryName;
    private String type;
    private double latitude;
    private double longitude;
}
