package io.javabrains.ratingsdataservice.models;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class UserRating {
    private List<Rating> userRating;
    
}
