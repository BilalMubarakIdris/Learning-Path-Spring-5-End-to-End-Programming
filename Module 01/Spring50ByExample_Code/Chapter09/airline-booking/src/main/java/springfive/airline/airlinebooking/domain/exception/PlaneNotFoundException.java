package springfive.airline.airlinebooking.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaneNotFoundException extends RuntimeException {

  String id;

}
