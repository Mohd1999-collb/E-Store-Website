package com.example.EStore.Dto.RequestDto;

import com.example.EStore.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CustomerRequestDto {
    String name;

    String mobNo;

    String emailId;

    Gender gender;
}
