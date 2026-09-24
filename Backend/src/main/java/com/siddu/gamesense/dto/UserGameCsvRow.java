package com.siddu.gamesense.dto;

public record UserGameCsvRow(
     String userId,
     String parentAsin,
     Double rating,
     String reviewText,
     Long timestamp )
{}